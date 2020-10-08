<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%
	if (request.getParameter("submit") != null) {
	String name = request.getParameter("sname");
	String course = request.getParameter("course");
	String fee = request.getParameter("fee");

	Class.forName("com.mysql.jdbc.Driver");
	String INSERT_USERS_SQL = "insert into records(stname,course,fee) values(?,?,?)";
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false", "root",
	"root");
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
	preparedStatement.setString(1, name);
	preparedStatement.setString(2, course);
	preparedStatement.setString(3, fee);

	preparedStatement.executeUpdate();
%>
<script>
	alert("Student info added......Thank You");
</script>



<%
	}
%>





<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css"></link>
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css"></link>

</head>
<body>

	<h1>Student Registraion System Crud using Jsp</h1>

	</br>
	<div class="row">
		<div class="col-sm-6">
			<form method="post" action="#">

				<div alight="left">
					<label class="form-label">Student Name</label> <input type="text"
						class="form-control" placeholder="student name" name="sname"
						id="sname" required />
				</div>

				<div alight="left">
					<label class="form-label">Course</label> <input type="text"
						class="form-control" placeholder="Course" name="course"
						id="course" required />
				</div>

				<div alight="left">
					<label class="form-label">Fee</label> <input type="text"
						class="form-control" placeholder="Fee" name="fee" id="fee"
						required />
				</div>
				</br>
				<div alight="left">
					<input type="submit" id="submit" value="submit" name="submit"
						class="btn btn-info" />
				</div>

			</form>

		</div>
		<div class="col-sm-6">
			<div class="panel-body">
				<table id="tbl-student"
					class="table table-responsive table-bordered" cellpadding="0"
					width="100%">
					<thead>
						<tr>
							<th>Stdent Name</th>
							<th>Course</th>
							<th>Fee</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>

						<%
							Class.forName("com.mysql.jdbc.Driver");
						String INSERT_USERS_SQL = "select * from records";
						Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=true", "root", "root");
						Statement st = connection.createStatement();
						ResultSet rs = st.executeQuery(INSERT_USERS_SQL);

						while (rs.next()) {
							String id = rs.getString("id");
						%>
						<tr>
							<td><%=rs.getString("stname")%></td>
							<td><%=rs.getString("course")%></td>
							<td><%=rs.getString("fee")%></td>
							<td><a href="update.jsp?id=<%=id%>">Edit</a></td>
							<td><a href="delete.jsp?id=<%=id%>">Delete</a></td>
						</tr>

						<%
							}
						%>
					
				</table>
			</div>
		</div>


	</div>

</body>
</html>