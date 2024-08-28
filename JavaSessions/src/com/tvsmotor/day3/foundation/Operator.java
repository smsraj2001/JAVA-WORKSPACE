package com.tvsmotor.day3.foundation;

public class Operator {
	public static void main(String[] args) {
		int a = 5;
		System.out.println(a++);
		System.out.println(++a);
		a = 5;
		int b = --a + ++a + --a + a++;
		System.out.println(b);
		
	}

}
