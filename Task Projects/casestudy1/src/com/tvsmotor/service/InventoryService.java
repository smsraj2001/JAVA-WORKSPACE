package com.tvsmotor.service;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.tvsmotor.exception.IllegalIdException;
import com.tvsmotor.exception.InsufficientStockException;
import com.tvsmotor.exception.IllegalArgumentException;
import com.tvsmotor.model.Inventory;
public class InventoryService
{
	ArrayList<Inventory> inventories = new ArrayList<Inventory>();
	
	public void addStockDetails(Inventory inventory) 
	{
	    // Validate itemcode
	    if (inventory.getItemcode() == null || !inventory.getItemcode().matches("^[a-zA-Z0-9]+$")) 
	    {
	        throw new IllegalIdException("Code must be alphanumeric.");
	    }

	    // Validate category
	    if (!"2W".equalsIgnoreCase(inventory.getCategory()) && !"3W".equalsIgnoreCase(inventory.getCategory())) 
	    {
	        throw new IllegalArgumentException("Category must be '2W' or '3W'");
	    }

	    // Validate location
	    if (!"Nalagarh".equalsIgnoreCase(inventory.getLocation()) && !"Hosur".equalsIgnoreCase(inventory.getLocation()) && 
	        !"Mysuru".equalsIgnoreCase(inventory.getLocation())) 
	    {
	        throw new IllegalArgumentException("Location must be 'Nalagarh', 'Hosur', or 'Mysuru'");
	    }

	    inventories.add(inventory);
	}

	public List<Inventory> viewAllItems()
	{
		return  inventories;
	}
	
	public void removeStockDetails(String itemcode)
	{
		
		inventories = (ArrayList<Inventory>) inventories.stream()
                .filter(inventory -> !itemcode.equals(inventory.getItemcode()))
                .collect(Collectors.toList());
	}
	
	public List<Inventory> viewByLocation(String location)
	{
        return  inventories.stream()
                .filter(inventory -> location.equalsIgnoreCase(inventory.getLocation()))
                .collect(Collectors.toList());
	}
	
	public List<Inventory> sortVehicleByNameAndCode()
	{
		return inventories.stream()
			    .sorted(Comparator.comparing(Inventory :: getItemname).thenComparing(Inventory :: getItemcode))
			    .collect(Collectors.toList());
	}
	
	public List<Inventory> displayVehiclesByPrice(double price)
	{
		return inventories.stream().filter(invent -> invent.getPrice() >= price).collect(Collectors.toList());
	}
	
	public void updateItemLocation(String itemcode, String newLocation) 
	{
	    inventories.stream()
	        .filter(inventory -> itemcode.equalsIgnoreCase(inventory.getItemcode()))
	        .forEach(inventory -> inventory.setLocation(newLocation));
	}
	
	public double calculateTotalInventoryValue() 
	{
	    return inventories.stream()
	        .mapToDouble(inventory -> inventory.getPrice() * inventory.getStock())
	        .sum();
	}
	
	public List<Inventory> viewItemsNearExpiry(int days) 
	{
	    LocalDate thresholdDate = LocalDate.now().plusDays(days);
	    return inventories.stream()
	        .filter(inventory -> inventory.getStockrefilldate().isBefore(thresholdDate))
	        .collect(Collectors.toList());
	}
	
	public boolean checkStockAvailability(String itemcode) 
	{
	    return inventories.stream()
	        .anyMatch(inventory -> itemcode.equalsIgnoreCase(inventory.getItemcode()) && inventory.getStock() > 0);
	}


	 public void stockRefill(String itemcode) 
	 {
	        inventories.stream()
	            .filter(inventory -> itemcode.equalsIgnoreCase(inventory.getItemcode()))
	            .forEach(inventory -> inventory.setStock(inventory.getStock() + 1000));
	 }

	  public boolean adjustStockAfterSale(String itemcode, int quantity) 
	  {
		  for (Inventory inventory : inventories) 
		  {
			  if (inventory.getItemcode().equalsIgnoreCase(itemcode)) 
			  {
				  if ((inventory.getStock() - quantity) > 100) 
				  {
					  inventory.setStock(inventory.getStock() - quantity);
					  return true;
	              } 
				  else 
				  {
	                    return false;
				  }
			  }
		  }
		  return false;
	  }
}