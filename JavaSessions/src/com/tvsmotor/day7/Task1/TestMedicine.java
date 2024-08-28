/* Create an abstract class Medicine to represent a drug manufactured by a pharmaceutical company with attributes price and expiry date 
and a method getDetails() to print them.
Also include an abstract function displayLabel() in the Medicine class. 
Derive Tablet, Syrup and Ointment classes from the Medicine class. 
Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. 
For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.
Create a class TestMedicine with the main method that declares an array of Medicine references of size 5. 
Create a medicine object of the type Tablet/Syrup/Ointment as decided by a randomly generated integer in the range 1 to 3. (Refer Java API Documentation to find out random number generation)
Check the polymorphic behavior of the displayLabel() method. */

package com.tvsmotor.day7.Task1;

import java.util.Random;

abstract class Medicine
{
    double price;
    String expiryDate;

    Medicine(double price, String expiryDate)
    {
        this.price = price;
        this.expiryDate = expiryDate;
    }

    void getDetails()
    {
        System.out.println("Price: " + price);
        System.out.println("Expiry Date: " + expiryDate);
    }

    abstract void displayLabel();
}

class Tablet extends Medicine
{
    Tablet(double price, String expiryDate)
    {
        super(price, expiryDate);
    }
    
    @Override
    void displayLabel()
    {
        System.out.println("Store in a cool dry place");
    }
}

class Syrup extends Medicine
{
    Syrup(double price, String expiryDate)
    {
        super(price, expiryDate);
    }
    
    @Override
    void displayLabel()
    {
        System.out.println("For external use only.");
    }
}

class Ointment extends Medicine
{
    Ointment(double price, String expiryDate)
    {
        super(price, expiryDate);
    }
    
    @Override
    void displayLabel()
    {
        System.out.println("Use with caution and no contact to eyes.");
    }
}

public class TestMedicine
{
    public static void main(String[]args)
    {
        Medicine[] medicines = new Medicine[5];
        Random random = new Random();
        int randomNum;
        for(int i = 0; i < 5; i++)
        {
            randomNum = random.nextInt(3) + 1;
            switch(randomNum)
            {
                case 1:
                    medicines[i] = new Tablet(100, "12/12/2024");
                    break;
                case 2:
                    medicines[i] = new Syrup(200, "12/12/2024");
                    break;
                case 3:
                    medicines[i] = new Ointment(300, "12/12/2024");
                    break;
            }
        }

        for(int i = 0; i < 5; i++)
        {
            medicines[i].getDetails();
            medicines[i].displayLabel();
            System.out.println();
        }
    }
}