package com.tvsmotor.day6.exception;

class Voter
{
	public void validate(int age)
	{
		if(age >= 18)
			System.out.println("You can Vote");
		else
			throw new ArithmeticException("Your age is less.");
	}
}


public class ThrowDemo {
	public static void main(String[] args) {
		Voter voter = new Voter();
		try
		{
			voter.validate(10);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
