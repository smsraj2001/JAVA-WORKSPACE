package com.tvsmotor.exception;

public class InValidPriceException extends RuntimeException 
{
	String msg;

	public InValidPriceException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}

	public String getMsg() 
	{
		return msg;
	}
}
