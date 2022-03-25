<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="saveUser" method="POST">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="pwd" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Phno:</td>
				<td><input type="text" name="phno" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>

	</form>


</body>
</html>