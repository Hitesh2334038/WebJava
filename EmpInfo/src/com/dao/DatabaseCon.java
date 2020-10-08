package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.Employee;

public class DatabaseCon {
	
	
	String query= "select * from emp.login";
	String url = "jdbc:mysql://localhost:3306/emp";
	String username = "root";
	String password="root";
		public ArrayList<Employee> check() {
			ArrayList<Employee> empRecSet= new ArrayList<Employee>();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection(url,username,password);
				PreparedStatement st= conn.prepareStatement(query);
			
				
				ResultSet rs= st.executeQuery();
				while(rs.next()) {
			
					Employee e=new Employee();
					e.setUname(rs.getString(1));
					e.setPass(rs.getString(2));
					
					empRecSet.add(e);
					
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return empRecSet;
		}
}


