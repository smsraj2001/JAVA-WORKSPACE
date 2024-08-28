package com.tvsmotor.day9.task;

import java.util.Scanner;
interface OperationLambda
{
	int test(int a, int b);
}

public class Task2LambdaCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		OperationLambda operadd = (a, b) -> 
		{
			return a + b;
		};
		OperationLambda opersub = (a, b) -> 
		{
			return a - b;
		};
		OperationLambda opermul = (a, b) -> 
		{
			return a * b;
		};
		OperationLambda operdiv = (a, b) -> 
		{
			return a / b;
		};
		OperationLambda operlarge2 = (a, b) -> 
		{
			return (a > b) ? a : b;
		};
		System.out.println("Enter 2 integer numbers:-");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition: " + operadd.test(a,  b));
		System.out.println("Subtraction: " + opersub.test(a,  b));
		System.out.println("Multiplication: " + opermul.test(a,  b));
		System.out.println("Division: " + operdiv.test(a,  b));
		System.out.println("Largest of 2 numbers: " + operlarge2.test(a,  b));
	
		sc.close();
	}
}
