package com.tvsmotor.day13.service;

public class CalculatorService {
	
	public int add(int a, int b)
	{
		return a + b;
	}
	
	public int countNameLength(String name)
	{
		return name.length();
	}
	
	public boolean checkEligibility(int age)
	{
		if(age > 18)
		{
			return true;
		}
		return false;
	}
}
