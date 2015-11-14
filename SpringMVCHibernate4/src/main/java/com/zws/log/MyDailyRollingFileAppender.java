package com.zws.log;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;
/**
 * �ȼ�ΪERROR����־������һ���ļ�����
 * @author wensh.zhu
 *
 */
public class MyDailyRollingFileAppender extends DailyRollingFileAppender {
	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		String level = priority.toString();
		if (level.equalsIgnoreCase("ERROR")) {
			//this.getThreshold()��Ϊ�����ļ���Threshold����
			return this.getThreshold().equals(priority);
		}
		return super.isAsSevereAsThreshold(priority);
	}
}
