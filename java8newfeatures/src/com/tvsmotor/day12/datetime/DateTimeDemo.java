package com.tvsmotor.day12.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeDemo {
	public static void main(String[] args) {
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Day: " + today.getDayOfWeek());
		System.out.println("Hour: " + today.getHour());
		System.out.println("Minutes: " + today.getMinute());
		System.out.println("Year: " + today.getYear());
		System.out.println("Month: " + today.getMonth());
		
		LocalDateTime dob = LocalDateTime.of(2001, 11, 27, 17, 15, 30);
		int myyear = today.compareTo(dob);
		System.out.println("Your Year: " + myyear);
		
	}
	
	
}
