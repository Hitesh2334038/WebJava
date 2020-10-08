package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.User;

public class Userdatabase {

	public boolean saveUser(User user) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");

		boolean set = false;
		try{
			//Insert register data to database
			String INSERT_USERS_SQL = "insert into role(name,email,pass,role) values(?,?,?,?)";
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "root");
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getRole());
			preparedStatement.executeUpdate();
			set = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		return set;
	}


	public String login( User usr){

		try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			String Email = usr.getEmail();
			String pass = usr.getPassword();
			String emaildb= "";
			String passdb="";
			String roledb ="";


			String query ="select email, pass, role from emp.role";
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "root");

			PreparedStatement preparedStatement = connection.prepareStatement(query);


			ResultSet rs =preparedStatement.executeQuery();

			if(rs.next()){
				emaildb =rs.getString("email");
				passdb = rs.getString("pass");
				roledb = rs.getString("role");

				if(Email.equals(emaildb) && pass.equals(passdb) && roledb.equals("User"))
				{
					return "User_Role";
				}
				else  if(Email.equals(emaildb) && pass.equals(passdb) && roledb.equals("Admin"))
				{
					return "Admin_Role";
				}

			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return "Invalid user credential";
	}


}





