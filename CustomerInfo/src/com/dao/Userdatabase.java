package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

public class Userdatabase {
	
	 public boolean saveUser(User user) throws ClassNotFoundException, SQLException{
		 Class.forName("com.mysql.jdbc.Driver");
     	
	        boolean set = false;
	        try{
	            //Insert register data to database
	        	String INSERT_USERS_SQL = "insert into user(name,email,password) values(?,?,?)";
	        	Connection connection = DriverManager
	         	        .getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "root");
	        	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
	        	preparedStatement.setString(1, user.getName());
	        	preparedStatement.setString(2, user.getEmail());
	        	preparedStatement.setString(3, user.getPassword());
	           
	        	preparedStatement.executeUpdate();
	           set = true;
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return set;
	    }
	 
	 
	 public User login(String email, String pass){
	        User usr=null;
	        try{
	        	 Class.forName("com.mysql.jdbc.Driver");
	            String query ="select * from user where email=? and password=?";
	            Connection connection = DriverManager
	         	        .getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "root");
	            PreparedStatement preparedStatement = connection.prepareStatement(query);
	            preparedStatement.setString(1, email);
	            preparedStatement.setString(2, pass);
	            
	            ResultSet rs = preparedStatement.executeQuery();
	            
	            if(rs.next()){
	                usr = new User();
	                usr.setId(rs.getInt("id"));
	                usr.setName(rs.getString("name"));
	                usr.setEmail(rs.getString("email"));
	                usr.setPassword(rs.getString("password"));
	                
	            }
	            
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return usr;
	    }


}


  

   
