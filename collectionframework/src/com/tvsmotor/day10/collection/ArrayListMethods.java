package com.tvsmotor.day10.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> items = new ArrayList<String>();
		items.add("Laptop");
		items.add("Pendrive");
		items.add("Mouse");
		items.add("Bottle");
		items.add("Watch");
		
		System.out.println("Total number of items: " + items.size());
		
		// Inserting at the specific location.
		items.add(2, "Table");
		
		System.out.println("After adding element in second index: " + items);
		
		// Remove by index
		items.remove(3);
		System.out.println("After removing: " + items);
		
		// Update by index
		items.set(0, "TV");
		System.out.println("After update: " + items);
		
		System.out.println("Check the items: " + items.contains("Laptop"));
		System.out.println("Check the items: " + items.contains("Watch")); // Case sensitive.
		
		System.out.println("---------------ITERATING--------------------");
		for(String item : items)
		{
			System.out.println(item);
		}
		
		System.out.println("---------------SORTING-------------------");
		System.out.println("---------------BEFORE SORTING-------------------");
		System.out.println(items);
		
		System.out.println("---------------AFTER SORTING-------------------");
		Collections.sort(items);
		System.out.println(items);
		
		items.clear();
		System.out.println("Items are: " + items);
	}

}
