package com.staff;

import java.sql.DriverManager;
import java.sql.Connection;



import java.sql.Statement;

public class StaffDBUtil {
	
	public static boolean insertStaff(String ID,String name,String academic, String subject, String email, String number, String dateofBirth, String gender) {
		
		boolean isSuccess = false;
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/staff";
		String user = "root";
		String pass = "Nnc1120@";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			
			String sql = "insert into staff values('"+ID+"','"+name+"','"+academic+"','"+subject+"','"+email+"','"+number+"','"+dateofBirth+"','"+gender+"')";			
			int rs = stmt.executeUpdate(sql); //return 0 1
			
			if(rs > 0) {
				isSuccess = true;
			}
			
			else {
				isSuccess = false;
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
}
