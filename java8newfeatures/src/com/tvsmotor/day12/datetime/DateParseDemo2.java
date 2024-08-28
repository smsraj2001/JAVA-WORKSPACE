package com.tvsmotor.day12.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateParseDemo2 {
	public static void main(String[] args) {
		String dob = "20-Feb-2022";
		LocalDate birthDay = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		System.out.println(birthDay);
		
		String dob2 = "20-08-2022";
		LocalDate birthDay2 = LocalDate.parse(dob2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println(birthDay2);
	}

}
