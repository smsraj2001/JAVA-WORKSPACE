package com.tvsmotor.day9.task;

import java.util.Scanner;
interface Operation
{
	int test(int a, int b);
}

public class Task2MethodReference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		Operation operadd = Task2UtilityCalculator :: add;
		Operation opersub = Task2UtilityCalculator :: sub;
		Operation opermul = Task2UtilityCalculator :: mul;
		Operation operdiv = Task2UtilityCalculator :: div;
		Operation operlarge2 = Task2UtilityCalculator :: findLargestOf2;
		
		System.out.println("Enter 2 integer numbers:-");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition: " + operadd.test(a,  b));
		System.out.println("Subtraction: " + opersub.test(a,  b));
		System.out.println("Multiplication: " + opermul.test(a,  b));
		System.out.println("Division: " + operdiv.test(a,  b));
		System.out.println("Largest of 2 numbers: " + operlarge2.test(a,  b));
		
		sc.close();
	}
	
	

}
