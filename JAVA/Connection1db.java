package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection1db {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ustDB","root","root");
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from Employee1");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" ");
				System.out.println(rs.getInt(2)+" ");
				System.out.println(rs.getString(3)+" ");
				System.out.println(rs.getString(4)+" ");
		}
			con.close();
			}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
