package com.tvsmotor.day11.collection;
import java.util.HashSet;
import com.tvsmotor.day10.collection.Product;
public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<String>();
		names.add("Banana");
		names.add("Avocado");
		names.add("Kiwi");
		names.add("Kiwi");
		
		for(String fruit : names)
			System.out.println(fruit);
		
		HashSet<Product> products2 = new HashSet<Product>();
		products2.add(new Product(1, "Television", 3, 56000.56));
		products2.add(new Product(2, "Refrigerator", 1, 40000.00));
		products2.add(new Product(3, "Music System", 2, 76000.45));
		products2.add(new Product(3, "Music System", 2, 76000.45));
		// System.out.println(products2);
		
		for(Product product : products2)
			System.out.println(product);
	}

}
