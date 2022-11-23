package com.mylogin.proj;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MyLoginController {
	private String yourName;
	private String yourPassword;
	private static final Logger logger = LogManager.getLogger(MyLoginController.class);

	public String executeLogin() {
		logger.fatal("Entering executeLogin.");
		String message = null;
		if (yourName.equals("SUMAN") && yourPassword.equals("1234")) {
			message = "success";
		} else
			message = "fail";
		logger.fatal("Exiting executeLogin.");
		return message;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getYourPassword() {
		return yourPassword;
	}

	public void setYourPassword(String yourPassword) {
		this.yourPassword = yourPassword;
	}

}
