package com.tvsmotor.day4.task;

class Bike extends Vehicle
{
	int no_of_gears;
	String design;
	Bike(String model, int cc, String colour, int no_of_gears, String design)
	{
		super(model, cc, colour);
		this.no_of_gears = no_of_gears;
		this.design = design;
	}
	void display()
	{
		System.out.println("MODEL: "+model);
		System.out.println("CC: "+cc);
		System.out.println("COLOUR: "+colour);
		System.out.println("NUMBER OF GEARS: "+ no_of_gears);
		System.out.println("DESIGN: "+design);
		
	}
	public static void main(String[] args) {
		Bike bike = new Bike("Ronin", 200, "Yellow", 5, "Streamlined");
		bike.display();
	}
}
