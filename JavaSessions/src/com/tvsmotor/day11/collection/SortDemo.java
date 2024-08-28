package com.tvsmotor.day11.collection;

import java.util.ArrayList;
import java.util.Collections;
import com.tvsmotor.day10.collection.Product;

public class SortDemo {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(5);
		nums.add(4);
		nums.add(3);
		
		System.out.println(nums);
		Collections.sort(nums);
		System.out.println("Sorted Array List: " + nums);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Laptop", 3, 56000.56));
		products.add(new Product(2, "Toys", 1, 40000.00));
		products.add(new Product(3, "Music System", 2, 76000.45));
		
		System.out.println("The sorted products is:-");
		System.out.println("Sorting using COMPARABLE");
		Collections.sort(products);
		System.out.println(products);
		
	}
}