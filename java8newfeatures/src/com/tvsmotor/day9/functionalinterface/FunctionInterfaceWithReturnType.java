package com.tvsmotor.day9.functionalinterface;

interface ArithmeticOperation
{
	public abstract int calculate(int a, int b);
	
}
public class FunctionInterfaceWithReturnType {
	public static void main(String[] args) {
		
		// For Single line body, return type is optional, i.e. no need to give return type.
		ArithmeticOperation add = (a, b) -> a + b;
		
		ArithmeticOperation largest = (a, b) -> {
			if(a > b)
					return a;
			return b;
		};
		System.out.println("Sum is " + add.calculate(2, 4));
		System.out.println("Largest is " + largest.calculate(4, 2));
	}

}
