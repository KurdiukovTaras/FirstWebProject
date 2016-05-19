<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Confirmation Page</title>
</head>
<body>
	message : ${success}
	<br/>
	<br/>
	<c:choose>
		<c:when test="${search}">
			<a href="<c:url value='/edit-${employee.id}-employee' />">Just click Here to edit that student data</a>
			<br/>
			<br/>
			Go back to <a href="<c:url value='/list' />">List of All Students</a>
		</c:when>
		<c:otherwise>

			Go back to <a href="<c:url value='/list' />">List of All Students</a>
		</c:otherwise>
	</c:choose>

</body>

</html>