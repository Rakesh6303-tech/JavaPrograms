package com.tap.transfer;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransferMoney {
	
	private static final String DISP="select * from user";
	
	private static final String S_Amount = "update user set balance=balance-? where account=?";
	
	private static final String R_Amount = "update user set balance=balance+? where account=?";
	
	private static Connection con;
	
	private static String url = "jdbc:mysql://localhost:3306/bank";
	
	private static String username ="root";
	
	private static String password = "root";

	private static Statement stmt;

	private static ResultSet resultSet;

	private static Scanner scan1 = new Scanner(System.in);
	


	private static PreparedStatement pstmt;
	
	static 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		disp();
		
		System.out.println("Enter the sender Account Number");
		String senderacc = scan1.next();
		System.out.println("Enter the Amount");
		String amount = scan1.next();
		
		try {
			pstmt = con.prepareStatement(S_Amount);
			
			pstmt.setString(1, amount);
			
			pstmt.setString(2,senderacc);	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enter Recevier Account number:");
		String recevier = scan1.next();
		
		try
		{
			pstmt = con.prepareStatement(R_Amount);
			
			pstmt.setString(1, amount);
			
			pstmt.setString(2, recevier);
			
			int x = pstmt.executeUpdate();
			
			if(x==0)
			{
				System.out.println("Failure");
			}
			else
			{
				System.out.println("Transfered Sucessfully");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		disp();
	}
	
	static void disp()
	{
		try
		{
			stmt = con.createStatement();
			resultSet = stmt.executeQuery(DISP);
			
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)
						+" "+
						resultSet.getString(2)+" "+
						resultSet.getString(3)+" "+
						resultSet.getString(4)+" ");
			}
			
		}
		catch(Exception e)
		{
			
		}
	}
}

