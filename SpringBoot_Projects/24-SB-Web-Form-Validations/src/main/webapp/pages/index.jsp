<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.error {
	color: red;
}
</style>

</head>
<body>

	<h3>User Form</h3>

	<form:form action="saveUser" modelAttribute="user" method="POST">

		<table>
			<tr>
				<td>Username:</td>
				<td><form:input path="uname" /></td>
				<td><form:errors path="uname" class="error" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:password path="pwd" /></td>
				<td><form:errors path="pwd" class="error" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" class="error" /></td>
			</tr>
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phno" /></td>
				<td><form:errors path="phno" class="error" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>

	</form:form>


</body>
</html>