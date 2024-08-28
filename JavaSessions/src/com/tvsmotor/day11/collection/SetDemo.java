package com.tvsmotor.day11.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();
		LinkedHashSet<String> names2 = new LinkedHashSet<String>();
		TreeSet<String> names3 = new TreeSet<String>();
		
		names.add("Banana");
		names.add("Avocado");
		names.add("Kiwi");
		names.add("Kiwi");
		System.out.println("HASHSET: " + names);
		names2.add("Cricket");
		names2.add("Baseball");
		names2.add("Tennis");
		names2.add("Baseball");
		System.out.println("LINKEDHASHSET: " + names2);
		names3.add("Sutharsan");
		names3.add("Mohan");
		names3.add("Suja");
		names3.add("Mohan");
		System.out.println("TREESET: " + names3);
	}

}
