package com.tvsmotor.day5.interfacedemo;

interface Payment
{
	public static final int noOfDays = 365;
	int month = 12;
	
	void doPayment();
}

class Upi implements Payment
{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Do the payment by UPI.");
	}	
}

class BankTransfer implements Payment
{

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Do the payment by net banking.");	
	}	
}

public class InterfaceDemo1 
{
	public static void main(String[] args) 
	{
		Payment payment1 = new Upi();
		payment1.doPayment();
		Payment payment2 = new BankTransfer();
		payment2.doPayment();
	}
}
