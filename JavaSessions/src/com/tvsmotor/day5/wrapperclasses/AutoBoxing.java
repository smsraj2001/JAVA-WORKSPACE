package com.tvsmotor.day5.wrapperclasses;

public class AutoBoxing {
	public static void main(String[] args) {
		int salary = 40000;
		Integer sal1 = Integer.valueOf(salary);
		Integer sal2 = salary;
		
		System.out.println(sal1);
		System.out.println(sal2);
		
	}

}
