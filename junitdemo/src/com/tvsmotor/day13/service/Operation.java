package com.tvsmotor.day13.service;

public class Operation 
{
	public boolean isEven(int number)
	{
		if(number % 2 == 0)
		{
			return true;
		}
		return false;
	}
	
	public String convertToUpperCase(String name)
	{
		return name.toUpperCase();
	}
	
	public boolean isPalindromeString(String query)
	{
		String reverse = "";
		for(int iter = query.length() - 1; iter >= 0; iter--)
		{
			reverse += query.charAt(iter);
		}
		if(reverse.equalsIgnoreCase(query))
		{
			return true;
		}
		return false;
	}
	
}
