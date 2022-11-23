package com.tutorialspoint.struts2;
//This is the MODEL of MVC
public class HelloWorldAction {
	private String firstName;

	public String execute1() throws Exception {
		System.out.println("Your name is = " + firstName + " in console");
		return "success";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}