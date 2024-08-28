package com.tvsmotor.day6.exception;

import java.util.*;
public class MultipleCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try
		{
			String name = null;
			//System.out.println(2/0);
			System.out.println(name.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
