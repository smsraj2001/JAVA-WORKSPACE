package com.stackroute.exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FindDay {

    //write logic to find day of the date and return result
    public String findDay(int month, int day, int year) {
    	String result = "";
    	String dd = "";
    	String mm = "";
    	String yyyy = "";
    	if(month < 1 || month > 12)
    	{
    		result += "Give month in range";
    	}
    	if(day < 1 || day > 31)
    	{
    		result += "Give day in range";
    	}
    	if(year < 2000 || year > 3000)
    	{
    		result += "Give year in range";
    	}
    	if(day >= 1 && day <= 31 && year >= 200 && year <= 3000 && month >=1 && month <= 12)
    	{
    		if(day >=1 && day <= 9)
    		{
    			dd = "0" + Integer.toString(day);
    		}
    		else
    		{
    			dd = Integer.toString(day);
    		}
    		
    		if(month >=1 && month <= 9)
    		{
    			mm = "0" + Integer.toString(month);
    		}
    		else
    		{
    			mm = Integer.toString(month) + "-";
    		}
    		yyyy = Integer.toString(year);
    		
    		String date = yyyy + "-" + mm + "-" + dd;
    		LocalDate thisdate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

    		return thisdate.getDayOfWeek().name();
    	} 	
        return result;
    }
}
