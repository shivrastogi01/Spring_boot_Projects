<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="saveStudent" modelAttribute="student" method="POST">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Phno</td>
				<td><form:input path="phno" /></td>
			</tr>
			<tr>
				<td>Genders</td>
				<td><form:radiobuttons path="gender" items="${genders}" /></td>
			</tr>
			<tr>
				<td>Courses</td>
				<td><form:select path="course">
						<form:options items="${courses}" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Timings</td>
				<td>
					<form:checkboxes items="${timings}" path="timings"/>
				</td>
			</tr>
			
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Register"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>