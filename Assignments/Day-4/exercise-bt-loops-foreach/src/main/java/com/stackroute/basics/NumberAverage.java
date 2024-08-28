package com.stackroute.basics;

import java.util.Scanner;
public class NumberAverage 
{

    public static void main(String[] args) 
    {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() 
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter number of values:");
    	int size = scan.nextInt();
    	if(size <= 0)
    	{
    		System.out.println("Empty array");
    		return;
    	}
    	int[] array = new int[size];
    	System.out.println("Enter the values:");
    	for(int iterator = 0; iterator < size; iterator++)
    	{
    		array[iterator] = scan.nextInt();
    	}
    	
    	// Calculate average and print result
        String result = findAverage(array);
        System.out.println(result);
    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) 
    {
    	int iterator = 0;
    	int size = inputArray.length;
    	int sum = 0;
    	int average = 0;
    	if (size <= 0) 
    	{
            return "Empty array";
        }

    	for(; iterator < size; iterator++)
    	{
    		if(inputArray[iterator] <= 0)
    		{
    			return "Give proper positive integer values";
    		}
    	}
    	for(iterator = 0; iterator < size; iterator++)
    	{
    		sum = sum + inputArray[iterator];
    	}
    	
    	average = sum / size;
    	
    	return String.format("The average value is: " + String.valueOf(average)); // String format of integer.
    }
}
