package com.tvsmotor.day9.defaultmethods;

interface Bank
{
	void doPayment();
	default void offers() // "default" should be provided otherwise will be considered as "public"
	{
		System.out.println("Offers");
	}
	default void rewards()
	{
		System.out.println("Rewards");
	}
	static void proofDocument()
	{
		System.out.println("Pan and aadhaar card.");
	}
}

class UPI implements Bank
{
	@Override
	public void doPayment() {
		// TODO Auto-generated method stub	
		// System.out.println("Doing payment from UPI");
	}
	public void offers()
	{
		System.out.println("UPI gives you many offers");
	}
}

public class DefaultMethodDemo {
	public static void main(String[] args) {
		Bank bank = () -> System.out.println("Complete the payment by online transfer");
		bank.doPayment();
		bank.offers();
		bank.rewards();
		
		Bank.proofDocument();
		
		Bank bank2 = new UPI();
		bank2.doPayment();
		bank2.offers();
		// bank2.rewards();
		}
	}

