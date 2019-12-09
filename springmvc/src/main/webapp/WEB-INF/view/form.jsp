<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form  action="./form" method="post">
<table >
<tr>
<td>id:</td>
<td><input type="number" name="id" placeholder="id"></td>
</tr>
<tr>
<td>name:</td>
<td><input type="text" name="name" placeholder="name"></td>
</tr>
<tr>
<td>password:</td>
<td><input type="password"  name="password" placeholder="password"></td>
</tr>
<tr>
<td>gender:</td>
<td><input type="radio" name="gender" value="male">M</td>
<td><input type="radio" name="gender"  value="female">F</td>
<td><input type="radio" name="gender" value="others" >O</td>
</tr>
<tr>
<td>DOJ:</td>
<td><input type ="date" name="doj"></td>
</tr>
<tr>
<td><input type= "reset" value="Reset" ></td>
<td><input type= "submit" value="Submit" ></td>
</tr>

</table>

</form>

</body>
</html>