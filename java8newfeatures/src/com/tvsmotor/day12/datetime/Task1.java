package com.tvsmotor.day12.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the date for booking movie ticket:-");
		String bookingdate = scan.next();
		// String bookingdate = "20-08-2022";
		
		LocalDate bk2 = LocalDate.parse(bookingdate, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		LocalDate bk3 = LocalDate.parse("06-Aug-2024", DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		// System.out.println(bk2);
		
		if(bk2.isBefore(bk3))
		{
			System.out.println("Sorry Cannot Book Ticket");
		}
		else
		{
			System.out.println("Success, Booked Ticket...");
		}
		
	}

}
