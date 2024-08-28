package com.tvsmotor.day3.Constructor;

public class Bike {
	int model;
	int speed;
	String brandName;
	int kilometerdriven;

	public Bike(int model, int speed, String brandName)
	{
		this.model = model;
		this.speed = speed;
		this.brandName = brandName;
		this.kilometerdriven = 10000;
	}

	int accelerate()
	{
		this.speed = this.speed + 5;		
		return this.speed;
	}
	int brake()
	{
		this.speed = this.speed - 3;		
		return this.speed;
	}
	int getSpeed()
	{
		return this.speed;
	}
}
