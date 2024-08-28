package com.tvsmotor.day9.functionalinterface;

interface Operation
{
	void calculate(int a, int b);
}

public class FunctionInterfaceWithParameter {
	public static void main(String[] args) {
		Operation add = (a, b) -> System.out.println(a + b);
		Operation sub = (a, b) -> System.out.println(a - b);
		add.calculate(2, 3);
		sub.calculate(5, 3);
		
	}

}
