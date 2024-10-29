package com.tvsmotor.exception;

public class OutOfStockException extends RuntimeException
{
	String msg;

	public OutOfStockException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}

	public String getMsg() 
	{
		return msg;
	}
}
