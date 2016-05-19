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
	<a href="<c:url value='/new' />">Add new student</a>
	<a href="<c:url value='/search' />">Search student</a>
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

	<div id="pagination">

		<c:url value="/list" var="prev">
			<c:param name="page" value="${page-1}"/>
		</c:url>
		<c:if test="${page > 1}">
			<a href="<c:out value="${prev}" />" class="pn prev">Prev</a>
		</c:if>

		<c:forEach begin="1" end="${maxPages}" step="1" varStatus="i">
			<c:choose>
				<c:when test="${page == i.index}">
					<span>${i.index}</span>
				</c:when>
				<c:otherwise>
					<c:url value="/list" var="url">
						<c:param name="page" value="${i.index}"/>
					</c:url>
					<a href='<c:out value="${url}" />'>${i.index}</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:url value="/list" var="next">
			<c:param name="page" value="${page + 1}"/>
		</c:url>
		<c:if test="${page + 1 <= maxPages}">
			<a href='<c:out value="${next}" />' class="pn next">Next</a>
		</c:if>
	</div>




</body>
</html>