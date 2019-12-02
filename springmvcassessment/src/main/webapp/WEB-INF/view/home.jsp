<%@page import="com.ustglobal.springmvcassessment.beans.Retailer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	Retailer bean = (Retailer) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./updatepassword">Update Password</a>
	
	<a href="./logout" style="float: right;">Logout</a>

	<h2>
		Welcome
		<%=bean.getName()%></h2>
	 <fieldset>
		<legend align="center">Search Employee</legend>
		<form action="./search">
			<table align="center">
				<tr>
					<td>ID:</td>
					<td><input type="number" name="id"></td>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
	</fieldset>

	<%
		Retailer Retailer = (Retailer) request.getAttribute("bean");
	%>
	<%
		if (Retailer != null) {
	%>
	<br>
	<br>
	<table border="1" align="center">
		<tr>
			<th>Name</th>
			<th>Email</th>

		</tr>
		<tr>
			<td><%=Retailer.getName()%></td>
			<td><%=Retailer.getEmail()%></td>

		</tr>

	</table>

	<%
		}
	%>

	<h3>${msg}</h3>

</body>
</html>