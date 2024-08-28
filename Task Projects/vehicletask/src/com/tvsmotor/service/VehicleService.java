package com.tvsmotor.service;

import com.tvsmotor.exception.InValidPriceException;
import com.tvsmotor.exception.InValidVehicleCategoryException;
import com.tvsmotor.model.Vehicle;
import com.tvsmotor.util.AppConstant;

import java.util.ArrayList;
import java.util.List;

public class VehicleService 
{
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	/*
	 * Description : this method is used to add vehicle in the list
	 * @param : Takes Vehicle object as parameter
	 * @return : Returns void
	 * @Throws : It throws InvalidCategoryException, when category is other
	 * than bike, scooter and auto
	 * @Author : S M SUTHARSAN RAJ
	 * @Created Date: 6-Aug-2024
	 */
	
	public void addVehicle(Vehicle vehicle)
	{
		String categorycheck = vehicle.getCategory();

		if(!categorycheck.equalsIgnoreCase("Scooter") && !categorycheck.equalsIgnoreCase("Bike") && !categorycheck.equalsIgnoreCase("Auto")) 
		{
			// throw new InValidVehicleCategoryException("The Vehicle category can only be Scooter OR Bike OR Auto");
			throw new InValidVehicleCategoryException(AppConstant.INVALID_CATEGORY_MESSAGE);
		}
		
		double pricecheck = vehicle.getPrice();
		if(pricecheck <= 50000) 
		{
			// throw new InValidPriceException("The Vehicle Price can only be greater than INR 50000");
			throw new InValidPriceException(AppConstant.INVALID_PRICE_MESSAGE);
		}
//		vehicles.add(new Vehicle(
//			    vehicle.getId(),
//			    vehicle.getName(),
//			    vehicle.getCategory(),
//			    vehicle.getCC(),
//			    vehicle.getModel(),
//			    vehicle.getPrice(),
//			    vehicle.getTotalsales()
//			));	
		vehicles.add(vehicle);
		// return vehicles;
		
	}
	public ArrayList<Vehicle> viewAllVehicle()
	{
		return (ArrayList<Vehicle>) vehicles;
	}
	
	public ArrayList<Vehicle> displayVehiclePrice()
	{
		ArrayList<Vehicle> tempvehicle = new ArrayList<Vehicle>();
		Vehicle vehicle = null;
		for(Vehicle iter : vehicles)
		{
			if(iter.getPrice() >= 150000)
			{
				tempvehicle.add(iter);
			}
		}
		return tempvehicle;
	}
	
	public ArrayList<Vehicle> displayOnlyScooter()
	{
		ArrayList<Vehicle> tempvehicle = new ArrayList<Vehicle>();
		Vehicle vehicle = null;
		for(Vehicle iter : vehicles)
		{
			if(iter.getCategory().equalsIgnoreCase("Scooter"))
			{
				tempvehicle.add(iter);
			}
		}
		return tempvehicle;
	}

}
