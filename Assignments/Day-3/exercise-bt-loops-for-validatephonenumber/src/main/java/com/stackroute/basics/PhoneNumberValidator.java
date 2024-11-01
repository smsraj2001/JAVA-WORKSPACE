package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator 
{

    // Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // call the functions in the required sequence
        PhoneNumberValidator phone = new PhoneNumberValidator();
        String pno = phone.getInput();
        int result = phone.validatePhoneNumber(pno);
        phone.displayResult(result);
        phone.closeScanner();
    }

    public String getInput() 
    {
        // Read entire line of input for the phone number
        String pno = sc.nextLine().trim();
        return pno.isEmpty() ? null : pno; // Return null if empty, otherwise return phone number
    }

    public void displayResult(int result) 
    {
        // displays the result
    	if (result == 1) 
    	{
            System.out.println("Valid");
        } 
    	else if (result == 0) 
    	{
            System.out.println("Invalid");
        } 
    	else if (result == -1) 
    	{
            System.out.println("Empty string");
        }
    }

    public int validatePhoneNumber(String input) 
    {
        if (input == null || input.isEmpty()) 
        {
            return -1; // Empty input
        }

        int count_num = 0;
        boolean flag = true;
        for (int i = 0; i < input.length() && flag; ++i) 
        {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') 
            {
                count_num++;
                flag = true;
            } 
            else if (ch == '-') 
            {
                flag = true;
            } 
            else 
            {
                flag = false;
            }
        }

        if (flag && count_num == 10) 
        {
            return 1; // Valid phone number
        } 
        else 
        {
            return 0; // Invalid phone number
        }
    }

    public void closeScanner() 
    {
        // close the Scanner object
        sc.close();
    }
}
