<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>

</head>
<style>
body {
    background-image: url(../img/green-curry-background.jpg);
    background-size: cover;
    background-repeat: no-repeat;
    font-family: 'Arimo', sans-serif;
    margin: 0;
    padding: 0;
    height: 100%;
    box-sizing: border-box;
    text-align: center;
}

</style>
<body>
<%
response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");
%>
<center> <h1> Admin Login Form </h1> </center> 
<div class="container">
<form action="Login" method="post">
	Enter username : <input type="text" name="uname"><br>
	Enter password : <input type="password" name="pass"><br><br>
	 <button type="submit" value="login">Login</button> <br><br><a href="index.jsp"> go back to CustomerLogin </a>
</div>
</form>
</body>
</html>

