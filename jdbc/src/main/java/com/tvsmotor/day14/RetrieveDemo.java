package com.tvsmotor.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveDemo {
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
			
			// Step 3: Pass the static sql query
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from parts;");
			System.out.println(rs);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
			}
			
			// Step 4: Connected closed:
			con.close();					
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}			
	}
}
