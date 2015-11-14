package com.zws.log;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;

import org.apache.log4j.Priority;
import org.apache.log4j.RollingFileAppender;
import org.apache.log4j.helpers.CountingQuietWriter;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.spi.LoggingEvent;

/**
 * 
 * @author wensh.zhu
 *
 */
public class MyRollingFileAppender extends RollingFileAppender {
	private long nextRollover = 0;

	public void rollOver() {
		File target;
		File file;

		if (qw != null) {
			long size = ((CountingQuietWriter) qw).getCount();
			nextRollover = size + maxFileSize;
		}
		LogLog.debug("maxBackupIndex=" + maxBackupIndex);

		boolean renameSucceeded = true;
		if (maxBackupIndex > 0) {
			//删除序号最大（最早的文件）的文件
			file = new File(genFileName(fileName, maxBackupIndex));
			if (file.exists())
				renameSucceeded = file.delete();

			//所有文件名序号加1
			for (int i = maxBackupIndex - 1; i >= 1 && renameSucceeded; i--) {
				file = new File(genFileName(fileName, i));
				if (file.exists()) {
					target = new File(genFileName(fileName, i + 1));
					renameSucceeded = file.renameTo(target);
				}
			}

			if (renameSucceeded) {
				target = new File(genFileName(fileName, 1));

				this.closeFile(); 

				file = new File(fileName);
				renameSucceeded = file.renameTo(target);

				if (!renameSucceeded) {
					try {
						this.setFile(fileName, true, bufferedIO, bufferSize);
					} catch (IOException e) {
						if (e instanceof InterruptedIOException) {
							Thread.currentThread().interrupt();
						}
						LogLog.error("setFile(" + fileName + ", true) call failed.", e);
					}
				}
			}
		}
		if (renameSucceeded) {
			try {

				this.setFile(fileName, false, bufferedIO, bufferSize);
				nextRollover = 0;
			} catch (IOException e) {
				if (e instanceof InterruptedIOException) {
					Thread.currentThread().interrupt();
				}
				LogLog.error("setFile(" + fileName + ", false) call failed.", e);
			}
		}
	}

	private String genFileName(String name, int index) {
		String fileName = "";
		if (index > 0) {
			String num = index < 10 ? "0" + index : String.valueOf(index);
			fileName = name.replace(".log", "") + "_" + num + ".log";
		} else {
			fileName = name;
		}
		return fileName;
	}
	
	protected void subAppend(LoggingEvent event) {
		super.subAppend(event);
		if (fileName != null && qw != null) {
			long size = ((CountingQuietWriter) qw).getCount();
			if (size >= maxFileSize && size >= nextRollover) {
				rollOver();
			}
		}
	}

	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		String level = priority.toString();
		if (level.equalsIgnoreCase("ERROR")) {
			return this.getThreshold().equals(priority);
		}
		return super.isAsSevereAsThreshold(priority);
	}
}
