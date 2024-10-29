package com.tvsmotor.model;

public class Vehicle {
    private int id;
    private String name;
    private int engineCapacity;
    private String fuelType;
    private double price;
    private int quantityStock;
    private int productionYear;

    public Vehicle() 
    {
        super();
    }

    public Vehicle(int id, String name, int engineCapacity, String fuelType, double price, int quantityStock, int productionYear) 
    {
        super();
        this.id = id;
        this.name = name;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.price = price;
        this.quantityStock = quantityStock;
        this.productionYear = productionYear;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getEngineCapacity() 
    {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) 
    {
        this.engineCapacity = engineCapacity;
    }

    public String getFuelType() 
    {
        return fuelType;
    }

    public void setFuelType(String fuelType) 
    {
        this.fuelType = fuelType;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public int getQuantityStock() 
    {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) 
    {
        this.quantityStock = quantityStock;
    }

    public int getProductionYear() 
    {
        return productionYear;
    }

    public void setProductionYear(int productionYear) 
    {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() 
    {
        return String.format(
            "Vehicle [ID=%d, Name='%s', Engine Capacity=%dcc, Fuel Type='%s', Price=%.2f, Stock=%d, Production Year=%d]",
            id, name, engineCapacity, fuelType, price, quantityStock, productionYear
        );
    }
}
