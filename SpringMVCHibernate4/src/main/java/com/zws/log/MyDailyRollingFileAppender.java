package com.zws.log;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;
/**
 * 等级为ERROR的日志单独在一个文件里面
 * @author wensh.zhu
 *
 */
public class MyDailyRollingFileAppender extends DailyRollingFileAppender {
	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		String level = priority.toString();
		if (level.equalsIgnoreCase("ERROR")) {
			//this.getThreshold()即为配置文件中Threshold属性
			return this.getThreshold().equals(priority);
		}
		return super.isAsSevereAsThreshold(priority);
	}
}
