package com.tvsmotor.day5.task;

class Scooter extends Vehicle
{
	int max_speed;
	int storage;
	
	Scooter(String model, int cc, String colour, int max_speed, int storage)
	{
		super(model, cc, colour);
		this.max_speed = max_speed;
		this.storage = storage;
	}
	void display()
	{
		System.out.println("MODEL: "+model);
		System.out.println("CC: "+cc);
		System.out.println("COLOUR: "+colour);
		System.out.println("MAXIMUM SPEED: "+max_speed);
		System.out.println("STORAGE: "+storage);
		
	}
	public static void main(String[] args) {
		Scooter scoot = new Scooter("NTorq", 125, "Red", 100, 200);
		scoot.display();
	}
}
