package com.tvsmotor.day11.collection;
import java.util.ArrayList;
import java.util.Collections;

import com.tvsmotor.day10.collection.Product;

public class ComparatorSortDemo {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Laptop", 3, 56000.56));
		products.add(new Product(2, "Toys", 1, 40000.00));
		products.add(new Product(3, "Music System", 2, 76000.45));
		System.out.println("Sorting using COMPARATOR");

		Collections.sort(products, (pro1, pro2) -> pro1.getName().compareTo(pro2.getName()));
		System.out.println("Sorted by name: " + products);
		
		Collections.sort(products, (pro3, pro4) ->
		{
		if(pro3.getPrice() > pro4.getPrice())
			{
			return 1;
			}
		else if(pro3.getPrice() == pro4.getPrice())
			{
			return 0;
			}
		return -1;
		}
		);
		System.out.println("Sorted by price: " + products);
	}

}
