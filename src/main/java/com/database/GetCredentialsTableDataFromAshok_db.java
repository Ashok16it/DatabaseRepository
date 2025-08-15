package com.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GetCredentialsTableDataFromAshok_db {
	
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	@BeforeClass
	public void dataBaseSetup() throws SQLException
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ashok_db","root","root");
	}
	
	@Test
	public void getDataFromTable() throws SQLException
	{
		stmt=con.createStatement();
		rs=stmt.executeQuery("Select * from credentials");
		
		while(rs.next())
		{
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("User -> "+rs.getString("user")+" , Password -> "+rs.getString("password"));
		}	
	}

	
	@AfterClass
	public void tearDown() throws SQLException
	{
		con.close();	
	}
}
