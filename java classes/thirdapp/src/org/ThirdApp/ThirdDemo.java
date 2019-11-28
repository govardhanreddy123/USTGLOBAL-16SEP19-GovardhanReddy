package org.ThirdApp;

import java.sql.*;


public class ThirdDemo {

	public static void main(String[] args)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="insert into oej12.student values(?,?,?)";
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded and regd.");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307?user=root&password=root");
		System.out.println("connection established");
		pstmt=con.prepareStatement(qry);
		pstmt.setInt(1, 1);
		pstmt.setString(2, "lali");
		pstmt.setDouble(3, 78.88);
		pstmt.executeUpdate();
		System.out.println("1stdata inserted successfully");
		pstmt.setInt(1, 2);
		pstmt.setString(2, "lalith");
		pstmt.setDouble(3, 99.99);
		pstmt.executeUpdate();
		System.out.println("2nddata inserted successfully");
		pstmt.setInt(1, 3);
		pstmt.setString(2, "smart");
		pstmt.setDouble(3, 98);
		pstmt.executeUpdate();
		System.out.println("3rddata inserted successfully");
		
		
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
		if(pstmt!=null)
		{
			try
			{
				pstmt.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	

	}

}
