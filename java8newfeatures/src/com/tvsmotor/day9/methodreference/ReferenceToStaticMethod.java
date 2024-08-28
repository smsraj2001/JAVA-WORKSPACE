package com.tvsmotor.day9.methodreference;

interface CalculatorApp
{
	int doOperations(int a, int b);
}

public class ReferenceToStaticMethod {
	public static void main(String[] args) {
		
		// Reference to static methods
		CalculatorApp add = Calculator :: add;
		System.out.println(add.doOperations(4,2));
		
		CalculatorApp sub = Calculator :: sub;
		System.out.println(sub.doOperations(4,2));	
	}
}
