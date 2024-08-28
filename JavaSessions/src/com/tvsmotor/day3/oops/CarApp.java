package com.tvsmotor.day3.oops;

class Car
{
	int modelNo;
	String brandName;
	int kilometerDriven;
	int speed;
	
	
	/* Description: This method is used to calculate the car status
	 *  Returns: It returns a string message
	 *  Author: Sutharsan
	 *  Created Date: 24-07-2024
	 */
	
	String checkCarStatus()
	{
		if(kilometerDriven <= 5000)
			return "Car is new";
		else if(kilometerDriven > 5000 && kilometerDriven < 30000)
			return "Car is in good condition";
		return "Car is old";
	}
	
	/* Description: This method is used to calculate the car status
	 *  Returns: It returns a string message
	 *  Author: Sutharsan
	 *  Created Date: 24-07-2024
	 */
	
	String speed()
	{
		if(speed <= 0)
			return "Car is NOT moving";
		return "Car is moving";
	}
	
}

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car();
		car.kilometerDriven = 25000;
		car.speed = 0;
		System.out.println(car.checkCarStatus());
		System.out.println(car.speed());
		
		
		Car car2 = new Car();
		car2.kilometerDriven = 20000;
		car2.speed = 10;
		System.out.println(car2.checkCarStatus());
		System.out.println(car2.speed());
	}
}
