package com.tvsmotor.day3.oops;

class Employee
{
	Employee()
	{
		System.out.println("This is a default constructor");
	}
	Employee(int salary)
	{
		System.out.println("This is a parameterized constructor");
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		Employee employee = new Employee();
		Employee employee2 = new Employee(45);
	}
}
