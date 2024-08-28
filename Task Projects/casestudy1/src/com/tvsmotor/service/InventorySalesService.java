
package com.tvsmotor.service;

import java.util.List;
import java.util.Comparator;
import com.tvsmotor.model.Inventory;
import com.tvsmotor.model.Sales;

public class InventorySalesService 
{

    private List<Inventory> inventories;
    private List<Sales> saleslist;

    public InventorySalesService(List<Inventory> inventories, List<Sales> saleslist) 
    {
        this.inventories = inventories;
        this.saleslist = saleslist;
    }

    public double calculateInventoryValueAfterSales() 
    {
        saleslist.forEach(sale -> {
            inventories.stream()
                .filter(inventory -> inventory.getItemcode().equalsIgnoreCase(sale.getItemcode()))
                .forEach(inventory -> {
                    inventory.setStock(inventory.getStock() - sale.getQuantity());
                });
        });

        return inventories.stream()
            .mapToDouble(inventory -> inventory.getPrice() * inventory.getStock())
            .sum();
    }

    public String bestSellingItemWithStock() 
    {
        Sales topSale = saleslist.stream()
            .max(Comparator.comparingInt(Sales::getQuantity))
            .orElse(null);

        if (topSale == null)
        {
            return "No sales data available.";
        }

        Inventory correspondingInventory = inventories.stream()
            .filter(inventory -> inventory.getItemcode().equalsIgnoreCase(topSale.getItemcode()))
            .findFirst()
            .orElse(null);

        if (correspondingInventory == null) 
        {
            return "Inventory data for item " + topSale.getItemcode() + " not found.";
        }

        return "Best-selling item: " + topSale.getItemcode() + " with " + topSale.getQuantity() + " units sold.\n" +
               "Current stock: " + correspondingInventory.getStock() + " units.\n" +
               (correspondingInventory.getStock() < topSale.getQuantity() ? "Reorder needed!" : "Stock is sufficient.");
    }

    public double inventoryTurnoverRate() 
    {
        int totalSalesQuantity = saleslist.stream()
            .mapToInt(Sales::getQuantity)
            .sum();

        double averageInventoryValue = inventories.stream()
            .mapToDouble(inventory -> inventory.getPrice() * inventory.getStock())
            .average()
            .orElse(0.0);

        return averageInventoryValue > 0 ? totalSalesQuantity / averageInventoryValue : 0.0;
    }
    
    public boolean salesPerformance(String itemcode)
    {
		double totalSalesPrice=saleslist.stream()
				.filter(sale->sale.getItemcode().equals(itemcode))
				.mapToDouble(sales-> sales.getQuantity()*sales.getSellingprice())
				.sum();
		
		double totalUnitPrice=inventories.stream()
							  .filter(inventory->inventory.getItemcode().equals(itemcode))
							  .mapToDouble(inventor->inventor.getStock()*inventor.getPrice())
							  .sum();
		
		if(totalSalesPrice>totalUnitPrice) 
		{
			return true;
		}
		return false;
    }

}