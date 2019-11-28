package org.oar.SecondApp.lib;

import java.sql.*;

public class SecondDemo 
{

	public static void main(String[] args)
	{
		Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded and regd.");
		con=DriverManager.getConnection("jdbc:mysql://locolhost:3306?user=root&password=root");
	} catch (ClassNotFoundException | SQLException e)
	{
		
		e.printStackTrace();
	}
	finally
	{
		if(con!=null)
		{
			try
			{
				con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	}
}
	