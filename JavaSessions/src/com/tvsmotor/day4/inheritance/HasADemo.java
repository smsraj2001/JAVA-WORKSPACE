package com.tvsmotor.day4.inheritance;

public class HasADemo {
	public static void main(String[] args) {
		Engine engine = new Engine(120, "BG^UFR%G&", 2);
		Bike bike = new Bike(2024, "Black", "Jupiter", engine);
		bike.displayVehicleDetails();
	}

}
