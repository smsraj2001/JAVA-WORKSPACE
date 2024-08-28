package com.tvsmotor.day3.foundation;

import java.util.*;
public class MenuDrivenBank {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double balance = 50000.00;
        while(true)
        {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Welcome to the Bank. Enter your choice:-");
            System.out.println("1. Withdraw Money\n2. Deposit Money\n3. Check Balance\n4. Exit");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Enter the amount to withdraw");
                        double withdraw = sc.nextDouble();
                        if(withdraw > balance)
                        {
                            System.out.println("Insufficient Balance");
                        }
                        else
                        {
                            balance = balance - withdraw;
                            System.out.println("Amount Withdrawn Successfully");
                        }
                        break;
                case 2: System.out.println("Enter the amount to deposit");
                        double deposit = sc.nextDouble();
                        if(deposit < 0)
                        {
                            System.out.println("Invalid Amount");
                        }
                        else
                        {
                            balance = balance + deposit;
                            System.out.println("Amount Deposited Successfully");
                        }
                        break;
                case 3: System.out.println("Your Balance is " + balance);
                        break;
           
                case 4: System.out.println("Thanks Visit Again!!!!");
                		System.exit(0);
                default: System.out.println("Invalid Choice");
            }
        System.out.println("------------------------------------------------------------------");
        }
    }
}















