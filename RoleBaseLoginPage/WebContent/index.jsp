<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Join Us</title>
<link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei"
	rel="stylesheet">

</head>
<body>
	<div class="container">
		<div class="box">
			<img class="avatar" src="img/login.png">
			<h1>Login Account</h1>
			<form action="Login" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required> <input type="submit" value="Login"> <a
					href="reg.jsp">Forget Password?</a><br> <a href="reg.jsp">Create
					New Account</a> 
			</form>
		</div>
	</div>
</body>
</html>

