<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register Account</title>
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
		<div class="regbox box">
			
			<h1>Customer Register Account</h1>
			<form action="Register" method="post">
				<p>Username</p>
				<input type="text" placeholder="Username" name="name" required>
				<p>Useremail</p>
				<input type="text" placeholder="Useremail" name="email" required>
				<p>Password</p>
				<input type="password" placeholder="Password" name="password"
					required><br> <br>
					<input type="submit" value="Register"> <br><a
					href="index.jsp">Already have Account?</a>
			</form>
		</div>
	</div>
</body>
</html>
