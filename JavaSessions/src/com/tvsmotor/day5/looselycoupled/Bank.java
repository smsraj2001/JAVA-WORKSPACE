package com.tvsmotor.day5.looselycoupled;

public class Bank 
{
	Bank()
	{
		System.out.println("We initiate all the banking systems. We are the BANK.");
	}
	void getAuthorized(int id)
	{
		System.out.println("The UPI system authorized with ID: " + id);
		System.out.println("Done");
	}
}
