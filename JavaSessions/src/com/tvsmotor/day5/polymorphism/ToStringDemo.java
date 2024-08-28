package com.tvsmotor.day5.polymorphism;

class Vehicle
{
	int number;
	String name;
	
	public Vehicle(int number, String name)
	{
		super();
		this.number = number;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + ", name=" + name + "]";
	}
}
public class ToStringDemo {
	public static void main(String[] args) {
		int a = 10;
		Vehicle vehicle = new Vehicle(1432, "Jupiter");
		
		System.out.println("Value of a: " + a);
		System.out.println("Value of vehicle: " + vehicle);
		
	}

}
