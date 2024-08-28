package com.tvsmotor.exception;

public class IllegalArgumentException  extends RuntimeException
{
	String msg;
	public IllegalArgumentException(String msg) 
	{
		
		super();
		this.msg = msg;
	}

	public String getMsg() 
	{
		return msg;
	}

}
