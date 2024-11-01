package com.stackroute.basics;
import java.util.Scanner;
public class StringFinder
{
    // Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        StringFinder stringFinder = new StringFinder();
        // Get three strings from the user
        String searchString = stringFinder.getInput();
        String firstString = stringFinder.getInput();
        String secondString = stringFinder.getInput();
        // Check if second string comes after first string in the search string
        int result = stringFinder.findString(searchString, firstString, secondString);
        // Display the result
        stringFinder.displayResult(result);
        // Close the scanner
        stringFinder.closeScanner();
    }
    public String getInput()
    {
        String query = sc.nextLine().trim(); // Read full line and trim any extra spaces
        return query;
    }
    public void displayResult(int result)
    {
        // displays the result
        if (result == 1)
        {
            System.out.println("Found as expected");
        }
        else if (result == 0)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("Empty string or null");
        }
    }
    public int findString(String searchString, String firstString, String secondString)
    {
        if (searchString == null || searchString.isEmpty() || firstString == null || firstString.isEmpty() || secondString == null || secondString.isEmpty())
        {
            return -1;
        }
        int firstIndex = searchString.indexOf(firstString);
        int secondIndex = searchString.indexOf(secondString);
        if (firstIndex == -1 || secondIndex == -1 || firstIndex >= secondIndex)
        {
            return 0;
        }
        return 1;
    }
    public void closeScanner()
    {
        sc.close();
    }
}