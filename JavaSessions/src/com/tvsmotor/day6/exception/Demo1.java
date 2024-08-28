package com.tvsmotor.day6.exception;

public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Get ready");
		System.out.println("Walk for 5 minutes");
		try
		{
			System.out.println(2/0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception Occurred");
			System.out.println("Exception is " + ex.getMessage());
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Exception Occurred");
//		}
		// System.out.println(2/0);
		System.out.println(2/2);
		System.out.println("Login");
		System.out.println("Start your day");
	}
}
