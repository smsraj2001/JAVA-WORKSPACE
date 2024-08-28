package com.tvsmotor.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class ParameterisedQuery {
	public static void main(String[] args) {
		try
		{
			// Step 1: Load the driver classes.
//			Class.forName("com.tvsmotor.day14.A");
			Class.forName("com.mysql.cj.jdbc.Driver"); // Will give error initially, if not included in pom.xml file
			System.out.println("Class Loaded.");
			
			// Step 2: Establish the connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle", "root", "Root@123");
			System.out.println("Connected");
			
			// Step 3: Prepared statement object
			PreparedStatement ps = con.prepareStatement("insert into parts values(?,?,?,?)");
			ps.setInt(1, 3);
			ps.setString(2,  "tyre");
			ps.setInt(3,  1200);
			ps.setString(4, "auto mobile");
			
			ps.execute();
			
			System.out.println("Inserted the data.");
			
			
			// Step 4: Connected closed:
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
