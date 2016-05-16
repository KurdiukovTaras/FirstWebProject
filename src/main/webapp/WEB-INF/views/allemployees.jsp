<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>My first web project</title>

	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>

</head>


<body>
	<h2>List of Students</h2>
	<a href="<c:url value='/new' />">Add New Student</a>
	<table>
		<tr>
			<td>Id</td><td>Name</td><td>Age</td><td>Is admin</td><td>Created Date</td><td></td>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
			<td><a href="<c:url value='/edit-${employee.id}-employee' />">${employee.id}</a></td>
			<td>${employee.name}</td>
			<td>${employee.age}</td>
			<td>${employee.isAdmin}</td>
			<td>${employee.createdDate}</td>
			<td><a href="<c:url value='/delete-${employee.id}-employee' />">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/>

</body>
</html>