package com.tvsmotor.exception;

public class IllegalIdException extends RuntimeException
{
	String msg;
	public IllegalIdException(String msg) 
	{
		
		super();
		this.msg = msg;
	}

	public String getMsg() 
	{
		return msg;
	}

}
