package com.tvsmotor.day11.collection;

import com.tvsmotor.day10.collection.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import com.tvsmotor.day10.collection.Product;

class PriceCompare implements Comparator<Product>
{
	public int compare(Product p1, Product p2) 
	{
		if(p1.getPrice() == p2.getPrice())
			return 0;
		else if(p1.getPrice() > p2.getPrice())
			return 1;
		return -1;
	}
 }
class NameCompare implements Comparator<Product>
{
	public int compare(Product p1, Product p2) 
	{
		return p1.getName().compareTo(p2.getName());
	}
}
public class ComparatorSortDemoVersion2 
{
	public static void main(String[] args) {
		ArrayList<Integer> nums =new ArrayList<Integer>();
		nums.add(1);
		nums.add(10);
		nums.add(5);
		nums.add(3);
		
		System.out.println(nums);
		Collections.sort(nums);
		
		System.out.println("SORTED ARRAY: " + nums);
		
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "Laptop", 3, 45000.23));
		products.add(new Product(2, "Toys", 3, 12500.00));
		products.add(new Product(3, "Music system", 3, 91000.81));
		System.out.println("PRODUCTS(ArrayList): " + products);
		
		Collections.sort(products); // Comparable
		System.out.println("PRODUCTS(ArrayList)-COMPARABLE:\n" + products);
		
		NameCompare namecomp = new NameCompare();
		Collections.sort(products, namecomp); // Name comparison comparator
		System.out.println("PRODUCTS(ArrayList)-NAME COMPARATOR:\n" + products);
		
		PriceCompare pricecomp = new PriceCompare();
		Collections.sort(products, pricecomp); // Price comparison comparator
		System.out.println("PRODUCTS(ArrayList)-PRICE COMPARATOR:\n" + products);
	}
 }