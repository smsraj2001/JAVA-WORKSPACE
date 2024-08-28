package com.tvsmotor.day6.exception;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		System.out.println("Hi");
		
		try
		{
			int arr[] = new int[5];
			arr[7] = 10;
			System.out.println("Hello");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Thanks");
	}
}
