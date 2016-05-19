<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Student Search Form</title>

    <style>

        .error {
            color: #ff0000;
        }
    </style>

</head>



<body>

<h2>Search Form</h2>
<form:form method="POST" modelAttribute="employee">
    <form:input path="id" id="id"/>


        <tr>
            <td colspan="3">
                        <input type="submit" value="Search"/>
            </td>
        </tr>
    </table>
</form:form>
<br/>
<br/>
Go back to <a href="<c:url value='/list' />">List of All Students</a>
</body>
</html>