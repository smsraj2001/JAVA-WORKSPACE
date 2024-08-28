package com.tvsmotor.day4.inheritance;

class Parent
{
	Parent()
	{
		System.out.println("Parent class constructor default");
	}
	
	Parent(int salary)
	{
		System.out.println("Parent class constructor parameterized " + salary);
	}
}

class Child extends Parent
{
	Child(int sal)
	// Child()
	{
		//super(45000);
		super(sal);
		System.out.println("Child class Constructor");
	}
	
}

public class SingleInheritance {
	public static void main(String[] args) {
		
		Child child = new Child(45000);
		// Child child = new Child();
		// Parent parent = new Parent();
		
	}

}
