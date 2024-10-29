package com.tvsmotor.service;

import com.tvsmotor.exception.InValidPriceException;
import com.tvsmotor.exception.InvalidNameException;
import com.tvsmotor.exception.OutOfStockException;
import com.tvsmotor.exception.VehicleNotFoundException;
import com.tvsmotor.model.Scooter;
import com.tvsmotor.model.Vehicle;
import com.tvsmotor.util.AppConstant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class VehicleService 
{
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    Map<Integer, Integer> sales = new HashMap<Integer, Integer>();

    /*
     * Description : this method is used to add vehicle in the list
     * @param : Takes Vehicle object as parameter
     * @return : Returns void
     * @Throws : It throws InvalidNameException and InValidPriceException
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public void addStockDetails(Vehicle vehicle) 
    {
        if (!vehicle.getName().equalsIgnoreCase("TVS Apache") &&
                !vehicle.getName().equalsIgnoreCase("TVS Raider") &&
                !vehicle.getName().equalsIgnoreCase("TVS Star City") &&
                !vehicle.getName().equalsIgnoreCase("TVS Jupiter") &&
                !vehicle.getName().equalsIgnoreCase("TVS Ntorq") &&
                !vehicle.getName().equalsIgnoreCase("TVS Iqube") &&
                !vehicle.getName().equalsIgnoreCase("TVS XL100")) 
        {   
            throw new InvalidNameException(AppConstant.INVALID_NAME_MESSAGE);
        }
         
        if(vehicle.getPrice() < 0)
        {
            throw new InValidPriceException(AppConstant.INVALID_PRICE_MESSAGE);
        }
        
        vehicles.add(vehicle);
    }

    /*
     * Description : this method is used to remove a vehicle from the list by its ID
     * @param : Takes vehicle ID as parameter
     * @return : Returns void
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public void removeStockDetails(int id)
    {
        vehicles = vehicles.stream()
                .filter(vehicle -> id != vehicle.getId())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
     * Description : this method is used to update the stock details of a vehicle by its ID
     * @param : Takes vehicle ID and the new stock quantity as parameters
     * @return : Returns the updated list of vehicles
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public List<Vehicle> updateStockDetails(int id, int quantityStock) 
    {
        vehicles.forEach(vehicle -> 
        {
            if (vehicle.getId() == id) 
            {
                vehicle.setQuantityStock(quantityStock);  // Update the stock quantity
            }
        });

        return vehicles;
    }

    /*
     * Description : this method is used to search a vehicle by its ID
     * @param : Takes vehicle ID as parameter
     * @return : Returns the found vehicle object
     * @Throws : It throws VehicleNotFoundException if the vehicle is not found
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public Vehicle searchVehicle(int id) throws VehicleNotFoundException 
    {
        return vehicles.stream()
                .filter(vehicle -> id == vehicle.getId())
                .findFirst()
                .orElseThrow(() -> new VehicleNotFoundException(AppConstant.VEHICLE_NOT_FOUND_MESSAGE));
    }

    /*
     * Description : this method is used to view all vehicles in the list
     * @return : Returns the list of all vehicles
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public ArrayList<Vehicle> viewAllVehicle()
    {
        return new ArrayList<>(vehicles);
    }

    /*
     * Description : this method is used to sort vehicles by price
     * @return : Returns the sorted list of vehicles by price
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public ArrayList<Vehicle> sortByPrice()
    {
        return vehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getPrice))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
     * Description : this method is used to sort vehicles by fuel type
     * @return : Returns the sorted list of vehicles by fuel type
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public ArrayList<Vehicle> sortByFuelType()
    {
        return vehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getFuelType))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
     * Description : this method is used to sort vehicles by production year
     * @return : Returns the sorted list of vehicles by production year
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public ArrayList<Vehicle> sortByProductionYear()
    {
        return vehicles.stream()
                .sorted(Comparator.comparing(Vehicle::getProductionYear))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    /*
     * Description : this method is used to book a vehicle for sale
     * @param : Takes vehicle ID and sales quantity as parameters
     * @return : Returns void
     * @Throws : It throws OutOfStockException if vehicle quantity is less than sales.
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public void salesOrder(int id, int sales) 
    {
        Vehicle vehicle = vehicles.stream()
                .filter(v -> id == v.getId())
                .findFirst()
                .orElseThrow(() -> new VehicleNotFoundException(AppConstant.VEHICLE_NOT_FOUND_MESSAGE));
        
        if (sales > vehicle.getQuantityStock())
        {
            throw new OutOfStockException(AppConstant.OUT_OF_STOCK_MESSAGE);
        }
        
        vehicle.setQuantityStock(vehicle.getQuantityStock() - sales);
        
        // Update the sales map if stock is sufficient
        this.sales.merge(id, sales, Integer::sum);
    }

    /*
     * Description : this method is used to find the vehicle with the highest sales
     * @return : Returns an Optional containing the entry with the highest sales
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public Optional<HashMap.Entry<Integer, Integer>> findHighestSales() 
    {
        return sales.entrySet()
                .stream()
                .max(HashMap.Entry.comparingByValue());  // Compare by value to find the max
    }

    /*
     * Description : this method is used to calculate the total value of the inventory
     * @return : Returns the total inventory value
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public double inventoryTotalValue() 
    {
        return vehicles.stream()
            .mapToDouble(inventory -> inventory.getPrice() * inventory.getQuantityStock())
            .sum();
    }

    /*
     * Description : this method is used to calculate the total sales of all scooters
     * @return : Returns the total sales of all scooters
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public int totalSalesOfAllScooters() 
    {
        return vehicles.stream()
            .filter(vehicle -> vehicle instanceof Scooter) 
            .mapToInt(vehicle -> sales.getOrDefault(vehicle.getId(), 0)) 
            .sum(); 
    }

    /*
     * Description : this method is used to calculate the total sales of all electric scooters
     * @return : Returns the total sales of all electric scooters
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public int totalSalesOfElectricScooters() 
    {
        return vehicles.stream()
            .filter(vehicle -> vehicle instanceof Scooter) 
            .map(vehicle -> (Scooter) vehicle)
            .filter(Scooter::isElectric)
            .mapToInt(scooter -> sales.getOrDefault(scooter.getId(), 0)) 
            .sum(); 
    }

    /*
     * Description : this method is used to count the number of vehicles produced after 2021
     * @return : Returns the count of vehicles produced after 2021
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public long displayVehicle2023() 
    {
        return vehicles.stream()
            .filter(v -> v.getProductionYear() > 2021)
            .count();
    }

    /*
     * Description : this method is used to count the number of vehicles produced between 2022 and 2023
     * @return : Returns the count of vehicles produced between 2022 and 2023
     * @Author : S M SUTHARSAN RAJ
     * @Created Date: 16-Aug-2024
     */
    public long displayCountOfVehiclesAfter2021()
    {
        return vehicles.stream()
            .filter(v -> v.getProductionYear() >= 2022 && v.getProductionYear() <= 2023)
            .count();
    }
}
