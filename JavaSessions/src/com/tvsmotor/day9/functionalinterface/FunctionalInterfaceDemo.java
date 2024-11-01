package com.tvsmotor.day9.functionalinterface;

@FunctionalInterface
interface Bank
{
	void rateOfInterest();
}


class Rate implements Bank
{
	double rate = 0.0;

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		rate = 0.04;		
		System.out.println("ROI is "+ rate * 100.00);
	}
	
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Bank bank = new Rate();
		bank.rateOfInterest();
		System.out.println("-------------Lambda function for single without paranthesis----------");
		Bank bank2 = () -> System.out.println("Rate of interest is 100%"); System.out.println("Rate of interest is 10%");
		bank2.rateOfInterest();
		
		System.out.println("-------------Lambda function for Multi line paranthesis----------");
		Bank bank3 = ()->
		{
			System.out.println("Rate of interest is 12%");
			System.out.println("This rate is final");
		};
		bank3.rateOfInterest();	
		
	}

}
