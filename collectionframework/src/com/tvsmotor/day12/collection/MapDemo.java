package com.tvsmotor.day12.collection;

import java .util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Sachin", "Batsman");
		hm.put("Bumrah", "Bowler");
		hm.put("Rohit", "Batsman");
		hm.put("Rohit", "Captain"); // Giving same key value will override to the latest value and print only that one.
		
		System.out.println(hm);
		
		// Linked HashMap comes in insertion order.
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("Sachin", "Batsman");
		lhm.put("Bumrah", "Bowler");
		lhm.put("Rohit", "Batsman");
		lhm.put("Rohit", "Captain"); // Giving same key value will override to the latest value and print only that one.
		
		System.out.println(lhm);
		
		// TreeMap gives in Sorted order.
		TreeMap<String, String> tmp = new TreeMap<String, String>();
		tmp.put("Sachin", "Batsman");
		tmp.put("Bumrah", "Bowler");
		tmp.put("Rohit", "Batsman");
		tmp.put("Rohit", "Captain"); // Giving same key value will override to the latest value and print only that one.
		
		System.out.println(tmp);
	
	}

}
