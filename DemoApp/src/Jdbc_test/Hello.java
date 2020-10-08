package Jdbc_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Command Complted........");
			String connString ="jdbc:sqlserver://DESKTOP-9ISEJU9\\MSSQLSERVER;"+ "databaseName=employe;integratedSecurity=true;";
			Connection conn = DriverManager.getConnection(connString);
			Statement stmt= conn.createStatement();
			String query= "SELECT * FROM EmpInfo ";
			ResultSet rs= stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+""+rs.getString(2));
			}
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}

	}

}
