package com.tvsmotor.day12.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
public class DateDemo1 {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
		
		// Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		// Set our Date
		LocalDate obj = LocalDate.of(2024, 2, 10);
		System.out.println("DOJ: " + obj);
		
		System.out.println("Year: " + today.getYear());
		System.out.println("Month: " + today.getMonth());
		System.out.println("Month: " + today.getMonthValue());
		System.out.println("Day of the Week: " + today.getDayOfWeek());
		System.out.println("Day of the Month: " + today.getDayOfMonth());
		System.out.println("Day of the Year: " + today.getDayOfYear());
	}

}
