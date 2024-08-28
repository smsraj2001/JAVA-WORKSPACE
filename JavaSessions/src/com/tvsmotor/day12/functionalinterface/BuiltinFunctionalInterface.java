package com.tvsmotor.day12.functionalinterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltinFunctionalInterface {
	public static void main(String[] args) {
		Predicate<Integer> checkEligibility = (age) -> age > 18;
		System.out.println(checkEligibility.test(24));
		
		Predicate<Integer> checkEven = (num) -> num % 2 == 0;
		System.out.println(checkEven.test(29));
		
		Function<String, Integer> nameLength = (name) -> name.length();
		System.out.println(nameLength.apply("Sachin"));
		System.out.println(nameLength.apply("Ram"));
		
	}
	
}
