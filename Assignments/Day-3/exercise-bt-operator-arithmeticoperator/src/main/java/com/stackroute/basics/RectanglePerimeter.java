package com.stackroute.basics;

import java.util.Scanner;

public class RectanglePerimeter 
{
    public static void main(String[] args) 
    {
   	  System.out.println("Enter length and breadth of the rectangle:");
      new RectanglePerimeter().getValues();
    }

    // Get user input from console
    public void getValues() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length and breadth of the rectangle:");
        double length = scan.nextDouble();
        double breadth = scan.nextDouble();
        double perimeter = perimeterCalculator(length, breadth);
        System.out.println(perimeter);
        scan.close();
    }

    // Write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) 
    {
        return 2 * (length + breadth);
    }
}
