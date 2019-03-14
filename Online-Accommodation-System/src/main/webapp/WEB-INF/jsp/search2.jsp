<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Pg's-management</title>
</head>
<body>
	<h1>Pg's-data</h1>
		
	<form:form action="search" method="post" modelAttribute="Address">

		<table>
			<tr>
				<td>CITY</td>
				<td><form:input path="city"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" name="action" value="search" />
				</td>
			</tr>

		</table>

	</form:form>
	<br>
</body>
</html>




