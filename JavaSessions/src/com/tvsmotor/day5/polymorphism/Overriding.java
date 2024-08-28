package com.tvsmotor.day5.polymorphism;

class Parent
{
	void qualification()
	{
		System.out.println("No degree");
	}
	
	void surname()
	{
		System.out.println("Sharma");
	}
}

class Child extends Parent
{
	@Override
	void qualification()
	{
		super.qualification();
		System.out.println("B.Tech");
	}
	
	void surname()
	{
		System.out.println("Sharma");
	}
}

public class Overriding {
	public static void main(String[] args) 
	{
		Child child = new Child();
		child.qualification();
		child.surname();
		
	}

}
