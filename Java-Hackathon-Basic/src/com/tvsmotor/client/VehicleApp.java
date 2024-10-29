package com.tvsmotor.client;

import com.tvsmotor.model.Bike;
import com.tvsmotor.model.Moped;
import com.tvsmotor.model.Scooter;
import com.tvsmotor.model.Vehicle;
import com.tvsmotor.service.VehicleService;
import com.tvsmotor.exception.InValidPriceException;
import com.tvsmotor.exception.InvalidNameException;
import com.tvsmotor.exception.OutOfStockException;
import com.tvsmotor.exception.VehicleNotFoundException;

import java.util.HashMap;
import java.util.Optional;

public class VehicleApp 
{
    public static void main(String[] args) 
    {
        VehicleService vehicleService = new VehicleService();

        // Adding vehicles
        try 
        {
            Vehicle bike1 = new Bike(1, "TVS Apache", 200, "Petrol", 120000, 10, 2024, true, 150);
            Vehicle scooter1 = new Scooter(2, "TVS Jupiter", 110, "Petrol", 70000, 15, 2023, false, 80);
            Vehicle scooter2 = new Scooter(3, "TVS Ntorq", 125, "Petrol", 75000, 20, 2022, true, 90);
            Vehicle bike2 = new Bike(4, "TVS Raider", 150, "Petrol", 95000, 8, 2024, false, 140);
            Vehicle bike3 = new Bike(5, "TVS Star City", 110, "Petrol", 60000, 12, 2023, true, 120);
            Vehicle bike4 = new Bike(6, "TVS Iqube", 0, "Electric", 120000, 5, 2024, true, 100);
            Vehicle moped1 = new Moped(7, "TVS XL100", 100, "Petrol", 55000, 10, 2022, false, 80);
            Vehicle scooter3 = new Scooter(8, "TVS Apache", 110, "Petrol", 72000, 18, 2023, true, 85);
            Vehicle scooter4 = new Scooter(9, "TVS Raider", 125, "Petrol", 80000, 25, 2022, false, 90);
            Vehicle scooter5 = new Scooter(10, "TVS Star City", 100, "Petrol", 65000, 22, 2024, true, 75);
            Vehicle scooter6 = new Scooter(11, "TVS Jupiter", 115, "Petrol", 70000, 30, 2023, false, 80);
            Vehicle scooter7 = new Scooter(12, "TVS Ntorq", 125, "Petrol", 76000, 12, 2022, true, 95);
            Vehicle scooter8 = new Scooter(13, "TVS Iqube", 0, "Electric", 130000, 7, 2024, true, 105);

            vehicleService.addStockDetails(bike1);
            vehicleService.addStockDetails(bike2);
            vehicleService.addStockDetails(bike3);
            vehicleService.addStockDetails(bike4);
            vehicleService.addStockDetails(moped1);
            vehicleService.addStockDetails(scooter1);
            vehicleService.addStockDetails(scooter2);
            vehicleService.addStockDetails(scooter3);
            vehicleService.addStockDetails(scooter4);
            vehicleService.addStockDetails(scooter5);
            vehicleService.addStockDetails(scooter6);
            vehicleService.addStockDetails(scooter7);
            vehicleService.addStockDetails(scooter8);

            // Invalid Cases: Uncomment to test
            // Vehicle invalidNameVehicle = new Scooter(14, "Invalid Model", 110, "Petrol", 75000, 20, 2022, true, 90);
            // vehicleService.addStockDetails(invalidNameVehicle);
            // Vehicle invalidPriceVehicle = new Bike(15, "TVS Apache", 200, "Petrol", -120000, 10, 2024, true, 150);
            // vehicleService.addStockDetails(invalidPriceVehicle);
        } 
        catch (InvalidNameException | InValidPriceException e) 
        {
            System.err.println("Error adding vehicle: " + e.getMessage());
        }

        // Viewing all vehicles
        System.out.println("All Vehicles:");
        vehicleService.viewAllVehicle().forEach(System.out::println);

        // Updating stock details
        vehicleService.updateStockDetails(2, 12);
        System.out.println("\nUpdated Vehicle Stock:");
        vehicleService.viewAllVehicle().forEach(System.out::println);

        // Sorting vehicles
        System.out.println("\nVehicles Sorted by Price:");
        vehicleService.sortByPrice().forEach(System.out::println);

        System.out.println("\nVehicles Sorted by Fuel Type:");
        vehicleService.sortByFuelType().forEach(System.out::println);

        System.out.println("\nVehicles Sorted by Production Year:");
        vehicleService.sortByProductionYear().forEach(System.out::println);

        // Search for a vehicle
        try 
        {
            Vehicle vehicle = vehicleService.searchVehicle(1);
            System.out.println("\nVehicle Found:");
            System.out.println(vehicle);
        } 
        catch (VehicleNotFoundException e) 
        {
            System.err.println("Error searching vehicle: " + e.getMessage());
        }

        // Perform sales order for all vehicles
        try 
        {
            vehicleService.salesOrder(1, 3);  // TVS Apache
            vehicleService.salesOrder(2, 5);  // TVS Jupiter
            vehicleService.salesOrder(3, 7);  // TVS Ntorq
            vehicleService.salesOrder(4, 2);  // TVS Raider
            vehicleService.salesOrder(5, 4);  // TVS Star City
            vehicleService.salesOrder(6, 1);  // TVS Iqube
            vehicleService.salesOrder(7, 2);  // TVS XL100
            vehicleService.salesOrder(8, 6);  // TVS Apache
            vehicleService.salesOrder(9, 4);  // TVS Raider
            vehicleService.salesOrder(10, 8); // TVS Star City
            vehicleService.salesOrder(11, 10); // TVS Jupiter
            vehicleService.salesOrder(12, 5); // TVS Ntorq
            vehicleService.salesOrder(13, 3); // TVS Iqube

            // Invalid Cases: Uncomment to test
            // vehicleService.salesOrder(14, 5);  // Vehicle ID does not exist
            // vehicleService.salesOrder(1, 15);  // Exceeds available stock for TVS Apache

            System.out.println("\nSales Orders Successfully Placed.");
        } 
        catch (VehicleNotFoundException | OutOfStockException e) 
        {
            System.err.println("Error during sales order: " + e.getMessage());
        }

        // Find highest sales
        Optional<HashMap.Entry<Integer, Integer>> highestSales = vehicleService.findHighestSales();
        highestSales.ifPresent(entry -> 
            System.out.println("\nPopular Sales: ID = " + entry.getKey() + ", Sales = " + entry.getValue())
        );

        // Display total sales
        System.out.println("Total sales of all scooters: " + vehicleService.totalSalesOfAllScooters());
        System.out.println("Total sales of all e-scooters: " + vehicleService.totalSalesOfElectricScooters());

        // Calculate total inventory value
        double totalInventoryValue = vehicleService.inventoryTotalValue();
        System.out.println("\nTotal Inventory Value: " + totalInventoryValue);

        // Display vehicle counts
        System.out.println("\nCount of Vehicles Produced After 2021: " + vehicleService.displayVehicle2023());
        System.out.println("\nCount of Vehicles Produced Between 2022 and 2023: " + vehicleService.displayCountOfVehiclesAfter2021());
    }
}