<%@page import="java.sql.*"%>
<%
	
	String id = request.getParameter("id");
	

	Class.forName("com.mysql.jdbc.Driver");
	String INSERT_USERS_SQL = "delete from records where id =?";
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school?useSSL=false", "root",
	"root");
	PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
	
	preparedStatement.setString(1, id);
	preparedStatement.executeUpdate();
%>
<script>
	alert("Student info Deleted......Thank You");
</script>

<html>
<body>
	<p>
		<a href="index.jsp">Click back</a>
	</p>
</body>
</html>

