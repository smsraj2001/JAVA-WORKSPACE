package com.tvsmotor.day3.Constructor;

public class BikeRun {
	public static void main(String[]args)
	{
		Bike bike = new Bike(8842, 0, "Ntorq");
		int acceleratecounter = 0;
		int brakecounter = 0;
		for(int i = 0; i < 10; i++)
		{
			System.out.println("ACCELERATE");
			bike.accelerate();
			System.out.println("BRAKE");
			bike.brake();
			acceleratecounter++;
			brakecounter++;
			if(acceleratecounter % 5 == 0)
				bike.kilometerdriven += 1;	
			System.out.println("Current Speed: "+ bike.getSpeed());
			System.out.println("Current Distance: "+ bike.kilometerdriven);
		}
		
		
	}

}
