<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="java.sql.*"%>
<%
	if (request.getParameter("submit") != null) {
	String id = request.getParameter("id");
	String name = request.getParameter("sname");
	String course = request.getParameter("course");
	String fee = request.getParameter("fee");

	Class.forName("com.mysql.jdbc.Driver");
	
	String INSERT_USERS_SQL = "update  records set stname=? ,course=? , fee=? where id=?";
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false", "root",
	"root");
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
	preparedStatement.setString(1, name);
	preparedStatement.setString(2, course);
	preparedStatement.setString(3, fee);
	preparedStatement.setString(4, id);
	preparedStatement.executeUpdate();
%>
<script>
	alert("Student info updated......Thank You");
</script>



<%
	}
%>




<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Info</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css"></link>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css"></link>
</head>
<body>

	<h1> Student Info updated....</h1>

	<div class="row">
		<div class="col-sm-4">
			<form method="post" action="#">

				<%
					Class.forName("com.mysql.jdbc.Driver");
				ResultSet rs;
				String INSERT_USERS_SQL = "select * from records where id=?";
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false", "root", "root");
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);

				String id = request.getParameter("id");

				preparedStatement.setString(1, id);

				rs = preparedStatement.executeQuery();

				while (rs.next()) {
				%>

				<div alight="left">
					<label class="form-label">Student Name</label> <input type="text"
						class="form-control" placeholder="student name" name="sname"
						id="sname" value="<%=rs.getString("stname")%>" required />
				</div>

				<div alight="left">
					<label class="form-label">Course</label> <input type="text"
						class="form-control" placeholder="Course" name="course"
						id="course" value="<%=rs.getString("course")%>" required />
				</div>

				<div alight="left">
					<label class="form-label">Fee</label> <input type="text"
						class="form-control" placeholder="Fee" name="fee" id="fee"
						value="<%=rs.getString("fee")%>" required />
				</div>


				<%
					}
				%>
				</br>
				<div alight="left">
					<input type="submit" id="submit" value="submit" name="submit"
						class="btn btn-info" />
				</div>


				<div alight="right">
					<p>
						<a href="index.jsp">Click back</a>
					</p>

				</div>
			</form>

		</div>

	</div>
</body>
</html>