package com.tvsmotor.day4.inheritance;

class Parent1
{
	int a = 1;
}
class Child1 extends Parent1
{
	int a = 2;
	void DisplayValue()
	{
		int a = 3;
		System.out.println("Super class property: " + super.a);
		System.out.println("Global Variable: " + this.a);
		System.out.println("Local variable: " + a);
		
	}
}
public class SuperVariableDemo {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.DisplayValue();
		
	}

}
