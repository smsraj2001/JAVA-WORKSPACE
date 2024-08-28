package com.tvsmotor.day4.staticdemo;

public class StaticBlockDemo {
	
	static
	{
		System.out.println("This is the static block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main function is the entry point.");
	}
	
	static
	{
		System.out.println("This is the static block 2");
	}

}
