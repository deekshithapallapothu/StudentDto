package com.student.exception;

public class AgeLimitException {

private int age;
	

	public AgeLimitException() {
	super();
	// TODO Auto-generated constructor stub
}

	public AgeLimitException(int age) {
	super();
	this.age = age;
	// TODO Auto-generated constructor stub
}

	@Override
	public String toString() {
		return "Minimum age Limit is 50 , Current Age is -----> "+age;
	}
}
