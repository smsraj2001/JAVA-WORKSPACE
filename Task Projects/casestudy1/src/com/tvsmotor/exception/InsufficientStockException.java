package com.tvsmotor.exception;

public class InsufficientStockException extends RuntimeException 
{
	String msg;
	public InsufficientStockException(String msg) 
	{
		super();
		this.msg = msg;
	}

	public String getMsg() 
	{
		return msg;
	}

}
