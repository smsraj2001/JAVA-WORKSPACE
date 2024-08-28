package com.tvsmotor.day5.abstraction;


abstract class Calculate
{
	abstract int doOperation(int a, int b);
	Calculate()
	{
		System.out.println("Constructor of abstract class.");
	}
	
}

class Addition extends Calculate
{
	Addition()
	{
		super();
		System.out.println("Construction called for addition.");
	}
	@Override
	int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
}

class Subtraction extends Calculate
{
	Subtraction()
	{
		super();
	}

	@Override
	int doOperation(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}
	
}

public class AbstractDemo1 {
	public static void main(String[] args) {
		// Calculate calculate = new Calculate(); Cannot create object for Abstract class.
		Calculate calculate1 = new Addition();
		System.out.println(calculate1.doOperation(2,  3));	
		Calculate calculate2 = new Subtraction();
		System.out.println(calculate2.doOperation(2,  3));	
		Addition add = new Addition();
		System.out.println(add.doOperation(5, 4)); 
	}
}
