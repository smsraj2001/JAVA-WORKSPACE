package com.tvsmotor.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sales 
{
	
	private String dealercode;
	private String dealername;
	private String itemcode;
	private LocalDate orderdate;
	private int quantity;
	private double sellingprice;
	private LocalDate dispatchdate;
	private int discount;
	
	public Sales(String dealercode, String dealername, String itemcode, LocalDate orderdate, int quantity,
			double sellingprice, LocalDate dispatchdate, int discount) 
	{
		super();
		this.dealercode = dealercode;
		this.dealername = dealername;
		this.itemcode = itemcode;
		this.orderdate = orderdate;
		this.quantity = quantity;
		this.sellingprice = sellingprice;
		this.dispatchdate = dispatchdate;
		this.discount = discount;
	}
	
	public String getDealercode() 
	{
		return dealercode;
	}
	
	public void setDealercode(String dealercode)
	{
		this.dealercode = dealercode;
	}
	
	public String getDealername() 
	{
		return dealername;
	}
	
	public void setDealername(String dealername) 
	{
		this.dealername = dealername;
	}
	
	public String getItemcode() 
	{
		return itemcode;
	}
	
	public void setItemcode(String itemcode)
	{
		this.itemcode = itemcode;
	}
	
	public LocalDate getOrderdate() 
	{
		return orderdate;
	}
	
	public void setOrderdate(LocalDate orderdate)
	{
		this.orderdate = orderdate;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}
	
	public double getSellingprice() 
	{
		return sellingprice;
	}
	
	public void setSellingprice(double sellingprice) 
	{
		this.sellingprice = sellingprice;
	}
	
	public LocalDate getDispatchdate() 
	{
		return dispatchdate;
	}
	
	public void setDispatchdate(LocalDate dispatchdate) 
	{
		this.dispatchdate = dispatchdate;
	}
	
	public int getDiscount() 
	{
		return discount;
	}
	
	public void setDiscount(int discount) 
	{
		this.discount = discount;
	}	
	
	@Override
	public String toString() 
	{
		return "Sales [dealercode = " + dealercode + ", dealername = " + dealername + ", itemcode = " + itemcode + ", orderdate = "
				+ orderdate + ", quantity = " + quantity + ", sellingprice = " + sellingprice + ", dispatchdate = " + dispatchdate
				+ ", discount = " + discount + "]";
	}


}
