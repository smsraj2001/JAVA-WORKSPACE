package com.tvsmotor.client;

import com.tvsmotor.service.*;
import com.tvsmotor.model.Vehicle;
import java.util.ArrayList;
import com.tvsmotor.exception.*;

public class VehicleApp 
{
	// ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	public static void main(String[] args)
	{

		VehicleService service = new VehicleService();
		
		try
		{
			service.addVehicle(new Vehicle(1, "NTorq", "Scooter", 125, 2018, 160000.00, 100));
			service.addVehicle(new Vehicle(2, "Apache", "Bike", 200, 2020, 180000.00, 150));
			service.addVehicle(new Vehicle(3, "Vikram", "Auto", 150, 2015, 60000.00, 50));
			service.addVehicle(new Vehicle(4, "Activa", "Scooter", 110, 2019, 75000.00, 200));
			service.addVehicle(new Vehicle(5, "Access", "Scooter", 125, 2017, 85000.00, 120));
			// service.addVehicle(new Vehicle(6, "Splendor", "Bike", 100, 2018, 45000.00, 300));
			service.addVehicle(new Vehicle(7, "XYZ", "Car", 1000, 2021, 500000.00, 10));
			
			System.out.println("--------------------------------------------------------");
			System.out.println("--------Added above Vehicle-------"); 
			
			System.out.println("--------Display All vehicles--------");
			ArrayList<Vehicle> tempvehicles = new ArrayList<Vehicle>();
			tempvehicles = service.viewAllVehicle();
			for(Vehicle iter : tempvehicles)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			System.out.println("--------Display Price Greater than 150000--------");
			ArrayList<Vehicle> tempvehicles2 = new ArrayList<Vehicle>();
			tempvehicles2 = service.displayVehiclePrice();
			for(Vehicle iter : tempvehicles2)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			System.out.println("--------Display Vehicle that is only Scooter--------");
			ArrayList<Vehicle> tempvehicles3 = new ArrayList<Vehicle>();
			tempvehicles3 = service.displayOnlyScooter();
			for(Vehicle iter : tempvehicles3)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
		}
		catch(InValidVehicleCategoryException e)
		{
			System.out.println(e.getMsg());		
		}
		catch(InValidPriceException e)
		{
			System.out.println(e.getMsg());		
		}
	}

}
