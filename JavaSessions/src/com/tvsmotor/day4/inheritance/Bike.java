package com.tvsmotor.day4.inheritance;

public class Bike {
	int modelNo;
	String color;
	String modelName;
	// Has a relationship
	Engine engine;
	public Bike(int modelNo, String color, String modelName, Engine engine) {
		super();
		this.modelNo = modelNo;
		this.color = color;
		this.modelName = modelName;
		this.engine = engine;
	}
	
	void displayVehicleDetails()
	{
		System.out.println("Model number: " + modelNo);
		System.out.println("Color: " + color);
		System.out.println("Model Name: " + modelName);
		System.out.println("Power: " + engine.power);
		System.out.println("Chassis number: " + engine.chassisNumber);
		System.out.println("Number of Cylinders: " + engine.noOfCylinder);
	}

}
