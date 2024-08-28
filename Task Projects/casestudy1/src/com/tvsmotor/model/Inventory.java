package com.tvsmotor.model;
import java.time.LocalDate;
import com.tvsmotor.exception.IllegalIdException;
public class Inventory
{
	private String itemcode;
	private String itemname;
	private String itemdescription;
	private String category;
	private int stock;
	private int reorderlevel;
	private String location;
	private double price;
	private static final int SAFETY_STOCK = 100;
	LocalDate stockrefilldate;
	
	public Inventory()
	{
		super();
	}
	public Inventory(String itemcode, String itemname, String itemdescription, String category, int stock,
			int reorderlevel, String location, double price, LocalDate stockrefilldate)
	{
		super();
		this.itemcode = itemcode;
		this.itemname = itemname;
		this.itemdescription = itemdescription;
		this.category = category;
		this.stock = stock;
		this.reorderlevel = reorderlevel;
		this.location = location;
		this.price = price;
		this.stockrefilldate = stockrefilldate;
	}
	
	public String getItemcode()
	{
		return itemcode;
	}
	
	public void setItemcode(String itemcode)
	{
		this.itemcode = itemcode;
	}
	
	public String getItemname()
	{
		return itemname;
	}
	
	public void setItemname(String itemname)
	{
		this.itemname = itemname;
	}
	
	public String getItemdescription()
	{
		return itemdescription;
	}
	
	public void setItemdescription(String itemdescription)
	{
		this.itemdescription = itemdescription;
	}
	
	public String getCategory()
	{
		return category;
	}
	
	public void setCategory(String category)
	{
        this.category = category;
	}
	
	public int getStock()
	{
		return stock;
	}
	
	public void setStock(int stock)
	{
		this.stock = stock;
	}
	
	public int getReorderlevel()
	{
		return reorderlevel;
	}
	
	public void setReorderlevel(int reorderlevel)
	{
		 this.reorderlevel = reorderlevel;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public LocalDate getStockrefilldate()
	{
		return stockrefilldate;
	}
	
	public void setStockrefilldate(LocalDate stockrefilldate)
	{
		this.stockrefilldate = stockrefilldate;
	}
	
	public static int getSafetyStock()
	{
		return SAFETY_STOCK;
	}
	
	@Override
	public String toString()
	{
		return "Inventory [itemcode = " + itemcode + ", itemdescription = " + itemdescription + ", category = " + category
				+ ", stock = " + stock + ", reorderlevel = " + reorderlevel + ", location = " + location + ", price = " + price
				+ ", stockrefilldate = " + stockrefilldate + "]";
	}
}