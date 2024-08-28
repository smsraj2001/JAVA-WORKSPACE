package com.tvsmotor.day10.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class GenericCollection 
{
	public static void main(String[] args) 
	{
		// Initialize the arraylist with initial capacity to set a higher size
		ArrayList<Integer> obj = new ArrayList<Integer>(1000);
		
		// Default size is 10.
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(3);
		// marks.add("Raj"); // Not possible as it is Integer.
		System.out.println("Marks: " + marks);
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("Laptop");
		items.add("Pendrive");
		items.add("Mouse");
		System.out.println("Items: " + items);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Laptop", 3, 56000.56));
		products.add(new Product(2, "Toys", 1, 40000.00));
		products.add(new Product(3, "Music System", 2, 76000.45));
		System.out.println("Products: " + products.toString());
		
		System.out.println(marks.get(1));
		System.out.println(marks.get(2));		
		
	}

}
