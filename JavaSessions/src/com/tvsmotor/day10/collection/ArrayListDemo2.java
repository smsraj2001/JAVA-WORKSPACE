package com.tvsmotor.day10.collection;

import java.util.ArrayList;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		
		System.out.println("Num 1: " + num1);
		
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(4);
		num2.add(5);
		num2.add(6);
		num2.add(7);
		num2.add(8);
		num2.add(9);
		num2.add(10);
		num2.add(11);
		
		System.out.println("Num 2: " + num2);
		
//		num2.addAll(num1);
//		System.out.println("Elements are: " + num2);
//		
//		num2.removeAll(num1);
//		System.out.println("Elements are: " + num2);
		
		// Takes the common element between the 2 ArrayList.
		num2.retainAll(num1);
		System.out.println("Elements are: " + num2);
		

	}

}
