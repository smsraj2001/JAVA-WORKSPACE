package com.tvsmotor.exception;

public class InValidVehicleCategoryException extends RuntimeException
{
	String msg;

	public InValidVehicleCategoryException(String msg) {
		// super(); // Without passing msg it will return 'null' if not using getMsg() method.
		super(msg); // Passing msg in this will help in NOT requiring getMsg() method itself.
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
