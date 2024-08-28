package com.tvsmotor.day6.exception;

import java.util.Scanner;

public class NestedTryCatch 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        try 
        {
            System.out.println("Enter a number");
            String input = scan.nextLine(); // Read input as String initially

            try 
            {
                num = Integer.parseInt(input); // Attempt to parse input to an integer

                // Validate range
                if (num >= -128 && num <= 127) 
                {
                    System.out.println("Valid number entered: " + num);
                } 
                else 
                {
                    System.out.println("Number is out of range (-128 to 127)");
                }
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Input is not a valid integer");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Exception occurred: " + e.getMessage());
        } 
        finally 
        {
            scan.close(); 
        }
    }
}
