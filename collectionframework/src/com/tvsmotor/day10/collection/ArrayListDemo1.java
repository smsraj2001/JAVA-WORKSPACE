package com.tvsmotor.day10.collection;

import java.util.ArrayList;
public class ArrayListDemo1 
{
	public static void main(String[] args) 
	{
		ArrayList obj = new ArrayList();
		
		System.out.println("Size of the element is: " + obj.size());
		obj.add(1);
		obj.add("Ravi");
		obj.add(10.20);
		System.out.println("Size of the element is: " + obj.size());
		System.out.println("Elements are: " + obj);		
	}
}
