package com.tvsmotor.day12.datetime;

import java.time.LocalDate;

public class DateParseDemo {
	public static void main(String[] args) {
		 String dob = "2001-11-27";
		// String dob = "2000-02-28";
		// String dob = "20-2-2000";
		
		// Converting string to date.
		LocalDate birthDate = LocalDate.parse(dob);
		System.out.println(birthDate);
		
		System.out.println("Birthdate + 3 years: " + birthDate.plusYears(3));
		System.out.println("Birthdate + 2 days: " + birthDate.plusDays(2));

		
		
	}

}
