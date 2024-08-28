package com.tvsmotor.model;

public class Vehicle {
	private int id;
	private String name;
	private String category;
	private int CC;
	private int model;
	private double price;
	private int totalsales = 0;
	
	public Vehicle(int id, String name, String category, int cC, int model, double price, int totalsales) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		CC = cC;
		this.model = model;
		this.price = price;
		this.totalsales = totalsales;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCC() {
		return CC;
	}
	public void setCC(int cC) {
		CC = cC;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getTotalsales() {
		return totalsales;
	}
	public void setTotalsales(int totalsales) {
		this.totalsales = totalsales;
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", category=" + category + ", CC=" + CC + ", model=" + model
				+ ", price=" + price + ", totalsales=" + totalsales + "]";
	} 
	
	
}
