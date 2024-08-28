package com.tvsmotor.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseConnectionDemo1 {
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
			
			// Step 3: Pass the sql statement
			Statement stmt = con.createStatement();
			stmt.execute("insert into parts values(1, 'mirror', 250, 'accessories');");
			System.out.println("Data inserted");
			stmt.execute("insert into parts values(2, 'seat cover',560, 'accessories');");
			System.out.println("Data inserted");
			
			// Step 4: Connected closed:
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
