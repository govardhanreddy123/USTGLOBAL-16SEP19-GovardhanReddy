<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="./home">Home</a>
	<a href="./logout" style="float: right;">Logout</a>

	<fieldset>
		<legend align="center">UpdatePassword</legend>
		<form action="./updatepassword" method="post">
			<table align="center">
				<tr>
					<td>NewPassword:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>ConfirmPassword:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="change Password"></td>
				</tr>

			</table>
		</form>
	</fieldset>


</body>
</html>