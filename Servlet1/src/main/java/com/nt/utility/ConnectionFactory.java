package com.nt.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	static Connection con=null;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeebase","root","rootuser");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
}
