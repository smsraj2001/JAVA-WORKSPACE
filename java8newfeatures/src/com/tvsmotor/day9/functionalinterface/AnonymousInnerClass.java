package com.tvsmotor.day9.functionalinterface;

class Parent
{
	void phone()
	{
		System.out.println("samsung");
	}
}

//// This class is for overriding.
//class Child extends Parent
//{
//	@Override
//	public void phone()
//	{
//		System.out.println("iphone");
//	}
//}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		// We can declare here directly without even declaring a sub class. Reduced the code
		Parent parent = new Parent()
		{
			void phone()
			{
				super.phone();
				System.out.println("i-phone");
			}
		};
		parent.phone();
	}
}
