package com.tvsmotor.service;


import com.tvsmotor.exception.InValidPriceException;
import com.tvsmotor.exception.InValidVehicleCategoryException;
import com.tvsmotor.model.Vehicle;
import com.tvsmotor.util.AppConstant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

		vehicles.add(vehicle);

		
	}
	public ArrayList<Vehicle> viewAllVehicle()
	{
		return (ArrayList<Vehicle>) vehicles;
	}
	
	public List<Vehicle> displayVehiclePrice150000()
	{
		return vehicles.stream().filter(v -> v.getPrice() > 150000).collect(Collectors.toList());
	}
	
	public List<Vehicle> displayOnlyScooter()
	{
		return vehicles.stream().filter(v -> v.getCategory().equalsIgnoreCase("Scooter")).collect(Collectors.toList());
	}
	public List<Vehicle> viewByCategory(String categorytype)
	{
		List<Vehicle> category;
		
		category = vehicles.stream().filter(v -> v.getCategory().equalsIgnoreCase(categorytype)).collect(Collectors.toList());		
		return category;
	}
	public List<Vehicle> sortVehicleByPrice()
	{
		return vehicles.stream()
	    .sorted(Comparator.comparing(Vehicle :: getPrice))
	    .collect(Collectors.toList());
	}
	public long sumOfTotalSales()
	{
		long sumSales = vehicles.stream().collect(Collectors.summingInt(Vehicle :: getTotalsales));
	    return sumSales;
	}
	public double displayAveragePrice()
	{
		double avgSales = vehicles.stream().collect(Collectors.averagingDouble(Vehicle :: getPrice));
		return avgSales;
	}
	public Vehicle displayMaxPrice()
	{
		Vehicle maxi = vehicles.stream().max(Comparator.comparing(Vehicle :: getPrice)).get();
		return maxi;
	}
	public Vehicle displayMinPrice()
	{
		Vehicle mini = vehicles.stream().min(Comparator.comparing(Vehicle :: getPrice)).get();
		return mini;
	}
	public List<Vehicle> displayThePriceDescendingOrder()
	{
		return vehicles.stream()
		.sorted(Comparator.comparing(Vehicle :: getPrice).reversed())
		.collect(Collectors.toList());
	}
	public List<Vehicle> sortOfByManufacturingDate()
	{
		return vehicles.stream()
		.sorted(Comparator.comparing(Vehicle :: getMfgdate))
		.collect(Collectors.toList());
	}
	public List<Vehicle> displayVehicleMfgAfter2022()
	{
		return vehicles.stream().filter(v -> v.getMfgdate().getYear() > 2022).collect(Collectors.toList());
	}
	public long displayCountOfVehiclesAfter2021()
	{
		return vehicles.stream().filter(v -> v.getMfgdate().getYear() > 2021).count();
	}	
	
}
