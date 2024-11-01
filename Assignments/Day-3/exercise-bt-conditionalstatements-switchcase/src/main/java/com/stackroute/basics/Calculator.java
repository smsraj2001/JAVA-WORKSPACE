package com.stackroute.basics;
import java.util.Scanner;
public class Calculator
{
    private static Scanner scan;
    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args)
    {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
        scan.close();
    }
    //Get values and which operator from the menu
    public void getValues(Scanner scan)
    {
    	while(true)
        {
	        System.out.println("Enter the first number:");
	        int firstValue = scan.nextInt();
	        System.out.println("Enter the second number:");
	        int secondValue = scan.nextInt();
	        System.out.println("Enter number beside the operation to perform: ");
	        System.out.println("1.Add");
	        System.out.println("2.Subtract");
	        System.out.println("3.Multiply");
	        System.out.println("4.Divide");
	        int operator = scan.nextInt();
        
            System.out.println(calculate(firstValue, secondValue, operator));
            System.out.println("Do you want to try again(y/n)");
            char choice = scan.next().charAt(0);
            if(choice != 'y')
            {
                break;
            }
        }
    }
    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator)
    {
        String result = "";
        switch (operator)
        {
            case 1:
                result = firstValue + " + " + secondValue + " = " + (firstValue + secondValue); break;
            case 2:
                result = firstValue + " - " + secondValue + " = " + (firstValue - secondValue); break;
            case 3:
                result = firstValue + " * " + secondValue + " = " + (firstValue * secondValue); break;
            case 4:
                if (secondValue == 0)
                {
                    result = "The divider (secondValue) cannot be zero";
                    break;
                }
                else
                {
                	result = firstValue + " / " + secondValue + " = " + (firstValue / secondValue); break;
                }
            default: result =  "Entered wrong option " + operator; break;
        }
        return result;
    }
}