package com.test.logging.ToTestLogs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMain {
	private static final Logger LOGGER = LogManager.getLogger(TestMain.class);

	public static void main(String[] args) {
		LOGGER.debug("DEBUG message");
		LOGGER.info("INFO message");
		LOGGER.warn("WARN message");
		LOGGER.error("ERROR message");
		LOGGER.fatal("FATAL message");
	}
	/*
	 * For Logging I need to just add logger jars in pom.xml and add log4j2.xml in
	 * src/main/resources folder and add logge object in java classes with
	 * appripriate log messages
	 */
}
