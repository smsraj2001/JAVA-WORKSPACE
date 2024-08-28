package com.tvsmotor.day4.staticdemo;

public class StaticDemo2 {
	
	void greet()
	{
		System.out.println("Welcome All");
	}
	static void hobby()
	{
		System.out.println("Listening to music");
	}
	public static void main(String[] args) {
		StaticDemo2 SD2 = new StaticDemo2();
		SD2.greet();
		StaticDemo2.hobby();		
	}
}
