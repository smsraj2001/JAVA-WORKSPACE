package com.tvsmotor.day10.collection;

import java.util.Objects;

public class Product implements Comparable<Product>{
	
	int id;
	String name;
	int quantity;
	double price;
	
	public Product()
	{
		super();
	}
	
	public Product(int id, String name, int quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	// PART OF DAY 11. OVERRIDING THESE METHODS SO THAT DUPLICATES IN THE SET ARE IDENTIFIED.
	// If the below two methods are commented out, then the set will allow duplicates.
	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity;
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(this.price == o.price)
		{
			return 0;
		}
		else if(this.price > o.price)
		{
			return 1;
		}
	    return -1;
	}
}
