<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<%
    String name = request.getParameter("name");
	String email = request.getParameter("email");
	String password = request.getParameter("password");
 	
    
    try{
    	  Class.forName("com.mysql.jdbc.Driver");
    	String INSERT_USERS_SQL = "insert into user(name,email,password) values(?,?,?)";
    	Connection connection = DriverManager
     	        .getConnection("jdbc:mysql://localhost:3306/emp?useSSL=false", "root", "root");
    	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
    	preparedStatement.setString(1,name );
    	preparedStatement.setString(2,email );
    	preparedStatement.setString(3, password);
       
    	preparedStatement.executeUpdate();
      
    }catch(Exception e){
        e.printStackTrace();
    }

    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>candidate added by using jsp-jdbc</h1>
</body>
</html>