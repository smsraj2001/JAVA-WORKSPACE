package com.tvsmotor.day12.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd MM yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		LocalDate today = LocalDate.now();
		
		System.out.println("Today (Default Format): " + today);
		System.out.println("After Format: " + today.format(format1));
		System.out.println("After Format: " + today.format(format2));
		System.out.println("After Format: " + today.format(format3));
		System.out.println("After Format: " + today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
	}

}
