package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class LoginDao {
	
	String query= "select * from login where uname=? and pass=? ";
	String url = "jdbc:mysql://localhost:3306/emp";
	String username = "root";
	String password="root";
		public boolean check(String uname , String pass) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection(url,username,password);
				PreparedStatement st= conn.prepareStatement(query);
				st.setString(1,uname);
				st.setString(2,pass);
//				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//				String connString ="jdbc:sqlserver://DESKTOP-9ISEJU9\\MSSQLSERVER;"+ "databaseName=employe;integratedSecurity=true;";
//				Connection conn = DriverManager.getConnection(connString);
//				PreparedStatement st= conn.prepareStatement(query);
				
				
				ResultSet rs= st.executeQuery();
				while(rs.next()) {
				System.out.println(uname);
					
					return true;
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			return false;
		}
}




//try {
//	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//	System.out.println("Command Complted........");
//	String connString ="jdbc:sqlserver://DESKTOP-9ISEJU9\\MSSQLSERVER;"+ "databaseName=employe;integratedSecurity=true;";
//	Connection conn = DriverManager.getConnection(connString);
//	Statement stmt= conn.createStatement();
//	String query= "SELECT * FROM EmpInfo ";
//	ResultSet rs= stmt.executeQuery(query);
//	
//	while(rs.next()) {
//		System.out.println(rs.getString(1)+""+rs.getString(2));
//	}
//	
//}
//catch(Exception e){
//	System.out.println(e);
//	
//}