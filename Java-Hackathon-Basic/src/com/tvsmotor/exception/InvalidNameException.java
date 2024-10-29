package com.tvsmotor.exception;

public class InvalidNameException extends RuntimeException
{
	String msg;

	public InvalidNameException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
