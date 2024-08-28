package com.tvsmotor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tvsmotor.dbproperties.DBConnection;
import com.tvsmotor.model.Parts;

public class PartsService 
{
    List<Parts> parts = new ArrayList<Parts>();

    public String addParts(Parts parts) throws ClassNotFoundException, SQLException
    {
        Connection conn = DBConnection.getConnected();
        PreparedStatement ps = conn.prepareStatement("insert into parts values(?,?,?,?)");
        ps.setInt(1, parts.getId() );
        ps.setString(2, parts.getName());
        ps.setInt(3, parts.getPrice());
        ps.setString(4, parts.getCategory());
        ps.execute();
        return "Parts added successfully";
    }

    public List<Parts> viewAllParts() throws ClassNotFoundException, SQLException
    {
        Connection conn = DBConnection.getConnected();
        PreparedStatement ps = conn.prepareStatement("select * from parts");
        ResultSet rs = ps.executeQuery();
        while(rs.next()) 
        {
            parts.add(new Parts(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
        }
        return parts;
    }
}