package com.tvsmotor.day9.methodreference;

interface Company
{
	void greetMsg();
}

public class ReferenceToNonStaticMethod {
	public static void main(String[] args) {
		
		// Implementation using lambda expression
		Company company = () -> System.out.println("Welcome all,");
		company.greetMsg();
		
		Greeting greeting = new Greeting();
		
		// Implementation using method reference
		
		Company company2 = greeting::display; // Don't give '()' as it is a reference
		company2.greetMsg();
		
		Company company3 = greeting::greetAllEmployee;
		company3.greetMsg();
	}
}
