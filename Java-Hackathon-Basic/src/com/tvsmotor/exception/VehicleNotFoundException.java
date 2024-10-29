package com.tvsmotor.exception;

public class VehicleNotFoundException extends RuntimeException
{
	String msg;

	public VehicleNotFoundException(String msg) 
	{
		super(msg);
		this.msg = msg;
	}

	public String getMsg() 
	{
		return msg;
	}

}
