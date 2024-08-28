package com.tvsmotor.client;

import com.tvsmotor.service.*;
import com.tvsmotor.model.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.tvsmotor.exception.*;

public class VehicleApp 
{
	// ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	public static void main(String[] args)
	{

		VehicleService service = new VehicleService();
		
		try
		{
			service.addVehicle(new Vehicle(1, "NTorq", "Scooter", 125, 2024, 160000.00, 100, LocalDate.of(2024, 2, 10)));
			service.addVehicle(new Vehicle(2, "Apache", "Bike", 200, 2023, 180000.00, 150, LocalDate.of(2023, 10, 5)));
			service.addVehicle(new Vehicle(3, "TVS King Deluxe", "Auto", 200, 2022, 200000.00, 50, LocalDate.of(2022, 2, 10)));
			service.addVehicle(new Vehicle(3, "Duramax Plus", "Auto", 200, 2021, 250000.00, 50, LocalDate.of(2022, 10, 27)));
			service.addVehicle(new Vehicle(4, "Activa", "Scooter", 110, 2021, 75000.00, 200, LocalDate.of(2021, 9, 30)));
			service.addVehicle(new Vehicle(5, "Access", "Scooter", 125, 2021, 85000.00, 120, LocalDate.of(2021, 8, 23)));
			service.addVehicle(new Vehicle(6, "Splendor", "Bike", 100, 2022, 55000.00, 300, LocalDate.of(2022, 9, 15)));
			service.addVehicle(new Vehicle(7, "Ronin", "Bike", 1000, 2022, 500000.00, 10, LocalDate.of(2022, 3, 31)));
//			 service.addVehicle(new Vehicle(6, "Splendor", "Bike", 100, 2018, 45000.00, 300, LocalDate.of(2024, 2, 10)));
//			 service.addVehicle(new Vehicle(7, "XYZ", "Car", 1000, 2021, 500000.00, 10, LocalDate.of(2024, 2, 10)));
			
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
			List<Vehicle> tempvehicles2;
			tempvehicles2 = service.displayVehiclePrice150000();
			for(Vehicle iter : tempvehicles2)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			System.out.println("--------Display Vehicle that is only Scooter--------");
			List<Vehicle> tempvehicles3;
			tempvehicles3 = service.displayOnlyScooter();
			for(Vehicle iter : tempvehicles3)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			
			System.out.println("--------Display Vehicle by Category--------");
			List<Vehicle> tempvehicles4;
			tempvehicles4 = service.viewByCategory("Bike");
			for(Vehicle iter : tempvehicles4)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			
			System.out.println("--------Sort Vehicle By Price-------");
			List<Vehicle> tempvehicles5;
			tempvehicles5 = service.sortVehicleByPrice();
			for(Vehicle iter : tempvehicles5)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			
			System.out.println("--------------------------------------------------------");
			System.out.println("Sum of Total Sales: " + service.sumOfTotalSales());
			System.out.println();
			
			System.out.println("--------------------------------------------------------");
			System.out.println("Average Price of all vehicles: " + service.displayAveragePrice());
			System.out.println();
			
			System.out.println("--------------------------------------------------------");
			System.out.println("Maximum Price: " + service.displayMaxPrice());
			System.out.println();
			
			System.out.println("--------------------------------------------------------");
			System.out.println("Minimum Price: " + service.displayMinPrice());
			System.out.println();
			
			System.out.println("--------Sort Vehicle By Price REVERSE ORDER-------");
			List<Vehicle> tempvehicles6;
			tempvehicles6 = service.sortVehicleByPrice();
			for(Vehicle iter : tempvehicles6)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			
			System.out.println("--------Sort Vehicle By Date-------");
			List<Vehicle> tempvehicles7;
			tempvehicles7 = service.sortOfByManufacturingDate();
			for(Vehicle iter : tempvehicles7)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			
			System.out.println("--------Get Manufactured Vehicle after 2022-------");
			List<Vehicle> tempvehicles8;
			tempvehicles8 = service.displayVehicleMfgAfter2022();
			for(Vehicle iter : tempvehicles8)
			{
				System.out.println(iter);
			}
			System.out.println("--------------------------------------------------------");
			System.out.println();
			
			System.out.println("--------------------------------------------------------");
			System.out.println("Count of Vehicles after 2021: " + service.displayCountOfVehiclesAfter2021());
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
