package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.*;

public class DatabaseCon {
	
	
	String query= "SELECT * FROM emp.user";
	String url = "jdbc:mysql://localhost:3306/emp";
	String username = "root";
	String password="root";
		public ArrayList<User> check() {
			ArrayList<User> empRecSet= new ArrayList<User>();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection(url,username,password);
				PreparedStatement st= conn.prepareStatement(query);
			
			
				ResultSet rs= st.executeQuery();
				while(rs.next()) {
			
					User e=new User();
					e.setName(rs.getString(1));
					e.setEmail(rs.getString(2));
					e.setPassword(rs.getString(3));
					
					empRecSet.add(e);
					
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return empRecSet;
		}
}


