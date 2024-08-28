package com.tvsmotor.day10.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> bag1 = new ArrayList<String>();
		bag1.add("biscuit");
		bag1.add("banana");
		bag1.add("apple");
		bag1.add("water");
		bag1.add("milk");
		
		System.out.println("Bag 1: " + bag1);
		
		ArrayList<String> bag2 = new ArrayList<String>();
		bag2.add("chips");
		bag2.add("apple");
		bag2.add("water");
		bag2.add("toys");
		bag2.add("ball");
		
		System.out.println("Bag 2: " + bag2);
		
		bag1.removeAll(bag2);
		bag1.addAll(bag2);
		
		System.out.println("Removing Duplicates");
		System.out.println(bag1);
		
		System.out.println("SORTING the Bag 2:-");
		Collections.sort(bag1);
		System.out.println(bag1);	
	}
}
