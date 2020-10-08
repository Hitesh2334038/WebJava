<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Join Us</title>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei"
	rel="stylesheet">
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
</head>
<body>
	<div class="container">
		<div class="box">

			<h1>Customer Login Account</h1>
			<form action="LoginCust" method="post">

				UserName : <input type="text" placeholder="Username" name="email"
					required> <br>
				<br> Password :<input type="password" placeholder="Password"
					name="password" required><br>
				<br> <input type="submit" value="Login"> <br>
				<br>
				<a href="reg.jsp">Forget Password? </a><br> <a href="reg.jsp">Create
					New Account </a><br>
				<a href="admin.jsp">Admin</a>
			</form>
		</div>
	</div>
</body>
</html>

