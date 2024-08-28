package com.tvsmotor.day13.optionalclass;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
//		String name = "Sachin";
		String name = null;
//		System.out.println(name.length()); // Will throw NullPointerException Error
		
		Optional<String> name2 = Optional.ofNullable(null);
		if(name2.isPresent())
		{
			String nametemp = name2.get();
			System.out.println("Length: " + nametemp.length());
		}
		else
		{
			System.out.println("Name is Empty");
		}
	}
}
