package com.tvsmotor.service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.tvsmotor.model.Inventory;
import com.tvsmotor.service.InventoryService;
import com.tvsmotor.model.Sales;

import com.tvsmotor.exception.*;

public class SalesService 
{
	List<Sales> saleslist = new ArrayList<Sales>();
	
	public void vehicleOrder(List<Inventory> inventory,Sales sale)
	{
		saleslist.add(sale);
			
		inventory.stream().filter(invent->invent.getItemcode().equalsIgnoreCase(sale.getItemcode()))
		.forEach(invent->
		{
			 if (sale.getItemcode() == null || !sale.getItemcode().matches("^[a-zA-Z0-9]+$")) 
			 {
			        throw new IllegalIdException("Code must be alphanumeric.");
			 }
			 
			 if((invent.getStock() - sale.getQuantity()) > 10)
			 {
				 invent.setStock(invent.getStock() - sale.getQuantity());
				 discountupdate(sale.getQuantity(),sale);
			 }
			 
			else 
			{
				invent.setStock(invent.getStock() + 100);
				throw new InsufficientStockException("Insufficient Stock"); 
			}
		});
		
	}
	
	public List<Sales> viewAllSales()
	{
		return saleslist;
	}
	
	public void cancelOrder(String dealercode)
	{
	saleslist=saleslist.stream().filter(sale-> !dealercode.equals(sale.getDealercode()))
			  .collect(Collectors.toList());		
	}

	public List<Sales> viewByDealers(String dealercode)
	{
        return  saleslist.stream()
                .filter(sale -> dealercode.equalsIgnoreCase(sale.getDealercode()))
                .collect(Collectors.toList());
	}
	
	public List<Sales> getYearlySales(int year)
	{
	    return saleslist.stream()
	        .filter(sale -> sale.getOrderdate().getYear() == year)
	        .collect(Collectors.toList());
	}
	public void discountupdate(int salequantity, Sales sale) 
	{

		if(salequantity > 10)
		{
			sale.setDiscount(3);
			sale.setSellingprice(sale.getSellingprice() - (sale.getSellingprice() * 0.03));
		}
		else if(salequantity > 50) 
		{ 
			sale.setDiscount(4);
			sale.setSellingprice(sale.getSellingprice() - (sale.getSellingprice() * 0.04));
		}
		
		else 
		{
			sale.setDiscount(5);
			sale.setSellingprice(sale.getSellingprice() - (sale.getSellingprice() * 0.05));
		}
	}
}
