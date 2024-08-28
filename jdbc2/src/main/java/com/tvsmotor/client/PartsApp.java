package com.tvsmotor.client;

import java.sql.SQLException;
import java.util.List;
import com.tvsmotor.model.Parts;
import com.tvsmotor.service.PartsService;

public class PartsApp 
{
    public static void main(String[] args) 
    {
        PartsService service = new PartsService();
        
        try
        {
            service.addParts(new Parts(101, "TVS Jupiter Brake Lever", 350, "Brakes & Controls"));
            service.addParts(new Parts(102, "TVS NTorq Air Filter", 250, "Engine Parts"));
            service.addParts(new Parts(103, "TVS Scooty Pep+ Rear View Mirror", 450, "Mirrors & Accessories"));
            service.addParts(new Parts(104, "TVS Jupiter Battery", 1200, "Electrical Components"));
            service.addParts(new Parts(105, "TVS NTorq Headlight Assembly", 2500, "Lighting"));
            service.addParts(new Parts(106, "TVS Jupiter Fuel Tank Cap", 180, "Fuel System"));
            service.addParts(new Parts(107, "TVS Scooty Pep+ Seat Cover", 700, "Body & Frame"));
            service.addParts(new Parts(108, "TVS NTorq Rear Brake Shoes", 600, "Brakes & Controls"));
            service.addParts(new Parts(109, "TVS Jupiter Clutch Assembly", 2800, "Transmission"));
            service.addParts(new Parts(110, "TVS Scooty Pep+ Silencer", 1500, "Exhaust"));
            
            System.out.println("Parts added successfully.");
            
            List<Parts> partsList = service.viewAllParts();
            System.out.println("The Parts details are:");
            for (Parts part : partsList) {
                System.out.println(part);
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("ClassNotFoundException: " + e.getMessage());
            System.out.println("Sorry, the SQL driver class was not found.");
        }
        catch(SQLException e)
        {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("Sorry, there was an issue with the database operation.");
        }
        catch(Exception e)
        {
            System.out.println("Exception: " + e.getMessage());
            System.out.println("Some internal error occurred.");
        }
    }
}
