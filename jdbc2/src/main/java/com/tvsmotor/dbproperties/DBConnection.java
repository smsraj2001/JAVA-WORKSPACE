package com.tvsmotor.dbproperties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public static Connection getConnected() throws ClassNotFoundException, SQLException
	{
		Class.forName(DBProperty.DRIVER_CLASS);
		Connection con = DriverManager.getConnection(DBProperty.URL, DBProperty.USERNAME, DBProperty.PASSWORD);
		return con;
	}
}
