package com.tvsmotor.day5.polymorphism;
class Flipkart
{
	void filter(int price)
	{
		System.out.println("Filter by price");
	}
	
	void filter(String brandName)
	{
		System.out.println("Filter by brand name");
	}
	void filter(int price, String brandName)
	{
		System.out.println("Filter by price and brand name");
	}
	
}
public class Overloading {
	public static void main(String[] args) {
		Flipkart flipkart = new Flipkart();
		// flipkart.filter(34);
		flipkart.filter("HP");
	}

}
