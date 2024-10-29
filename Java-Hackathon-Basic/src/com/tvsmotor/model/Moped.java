package com.tvsmotor.model;

public class Moped extends Vehicle 
{
	private boolean isElectric;
	private int maxSpeed;
	public static final String VEHICLE_TYPE = "Moped";
	
	public Moped()
	{
		
	}
	
	public Moped(int id, String name, int engineCapacity, String fuelType, double price, int quantityStock, int productionYear, boolean isElectric, int maxSpeed) 
	{
		super(id, name, engineCapacity, fuelType, price, quantityStock, productionYear);
		this.isElectric = isElectric;
		this.maxSpeed = maxSpeed;
	}
	
	public boolean isElectric() 
	{
		return isElectric;
	}
	
	public void setElectric(boolean isElectric) 
	{
		this.isElectric = isElectric;
	}
	
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) 
	{
		this.maxSpeed = maxSpeed;
	}
	
	public static String getVehicleType() 
	{
		return VEHICLE_TYPE;
	}
	
	@Override
    public String toString() 
	{
        return String.format(
            "Moped [ID=%d, Name='%s', Engine Capacity=%dcc, Fuel Type='%s', Price=%.2f, Stock=%d, Production Year=%d, Electric=%b, Max Speed=%d km/h]",
            getId(), getName(), getEngineCapacity(), getFuelType(), getPrice(), getQuantityStock(), getProductionYear(), isElectric, maxSpeed
        );
    }
}	