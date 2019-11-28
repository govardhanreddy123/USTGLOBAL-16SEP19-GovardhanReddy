package org.oar.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcTran 
{
	public static void main(String[] args)
	{
		
		Connection con=null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		String qry1="insert into oeje12.std1 values(?,?,?,?)";
		String qry2="insert into oeje12.std2 values(?,?,?)";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter dept");
		String dept=sc.next();
		System.out.println("Enter place");
		String place=sc.next();
		System.out.println("Enter perc");
		double perc=sc.nextDouble();
		sc.close();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded and regd.");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connection Established");
			
			con.setAutoCommit(false);
			
			pstmt1=con.prepareStatement(qry1);
			pstmt1.setInt(1, id);
			pstmt1.setString(2, name);
			pstmt1.setString(3, dept);
			pstmt1.setString(4, place);
			pstmt1.executeUpdate();
			
			pstmt2=con.prepareStatement(qry2);
			pstmt2.setInt(1, id);
			pstmt2.setString(2, name);
			pstmt2.setDouble(3, perc);
			pstmt2.executeUpdate();
			
			con.commit();
			
		} catch (ClassNotFoundException | SQLException e) {

			try {
				con.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		finally {
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt1!=null)
			{
				try {
					pstmt1.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pstmt2!=null)
			{
				try {
					pstmt2.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
