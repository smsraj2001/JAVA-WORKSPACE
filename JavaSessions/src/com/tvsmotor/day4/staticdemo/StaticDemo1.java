package com.tvsmotor.day4.staticdemo;

class Employee
{
	int id; // Non Static ---> belongs to object reference
	String name; // Non Static ---> belongs to object reference
	static String companyName; //Static ---> It belongs to class reference
}
public class StaticDemo1 {
	public static void main(String[] args) {
		Employee.companyName = "TVS Motor";
		Employee e1 = new Employee();
		e1.id = 1;
		e1.name = "SMS";
		
		Employee e2 = new Employee();
		e2.id = 2;
		e2.name = "RAJ";
		
		e2.companyName = "HOSUR TVSM";
		
		Employee e3 = new Employee();
		e3.id = 3;
		e3.name = "Rahul";
		
		e3.companyName = "Hero";
		
		System.out.println(e1.id+" "+e1.name + " " + e1.companyName);
		System.out.println(e2.id+" "+e2.name + " " + e1.companyName);
		System.out.println(e3.id+" "+e3.name + " " + e1.companyName);
	}
}
