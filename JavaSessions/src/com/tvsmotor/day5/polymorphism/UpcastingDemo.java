package com.tvsmotor.day5.polymorphism;

class RBI
{
	void rateOfInterest()
	{
		System.out.println("3% ROI");
	}
	void loan()
	{
		System.out.println("Provide the loan with 9% interest.");
	}
}

class Axis extends RBI
{
//	void loan()
//	{
//		System.out.println("Bank is open for 24 * 7");
//	}
	void rateOfInterest()
	{
		System.out.println("5% ROI");
	}
}

public class UpcastingDemo {
	public static void main(String[] args) {
		// Reference is parent class and object is of child class
		RBI rbi = new Axis();
		rbi.rateOfInterest(); // Overriding also occurs if its the case.
		rbi.loan(); // Cannot have properties of child. Follows properties of parent only
		
	}

}
