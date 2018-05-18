<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Form</h1>
	<div class="ex">
		<form action="${pageContext.request.contextPath}/save" method="post">
			<table style="with: 50%">
				<tr>  
				    <td>User Id</td>
					<td><input type="text" name="userId" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lname" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="state" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td><input type="text" name="country" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="text" name="phone" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
		</form>
	</div>
</body>
</html>