package com.tvsmotor.day5.task;

public class NTorq125 extends Scooter {
	String scoot_model;
	boolean smart_connected;
	
	NTorq125(String model, int cc, String colour, int max_speed, int storage, String scoot_model, boolean smart_connected)
	{
		super(model, cc, colour, max_speed, storage);
		this.scoot_model = scoot_model;
		this.smart_connected = smart_connected;
	}
	void display()
	{
		System.out.println("MODEL: "+model);
		System.out.println("CC: "+cc);
		System.out.println("COLOUR: "+colour);
		System.out.println("MAXIMUM SPEED: "+max_speed);
		System.out.println("STORAGE: "+storage);
		System.out.println("SCOOTER_MODEL: "+scoot_model);
		System.out.println("SMART CONNECTED: "+smart_connected);
		
		
	}
	public static void main(String[] args) {
		NTorq125 nt = new NTorq125("NTorq", 125, "Red", 100, 200, "NTorq XT", true);
		nt.display();
	}
}
