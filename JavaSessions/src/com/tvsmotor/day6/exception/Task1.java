package com.tvsmotor.day6.exception;

import java.util.*;
public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double result = 0.0;
		try
		{
			System.out.println("Enter 2 numbers:-");
			System.out.print("num1 ");
			int num1 = scan.nextInt();
			System.out.println();
			System.out.print("num2 ");
			int num2 = scan.nextInt();
			System.out.println();
			result = num1/ num2;
			System.out.println(num1+ " / "+ num2 + " = " + result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Do not enter zero");
			// System.out.println("Exception is " + ex.getMessage());
		}
		catch(InputMismatchException ex2 )
		// catch(Exception ex2 )
		{
			System.out.println("Do not enter String");
		}
	}

}
