<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="newRegistration">Add New Registrations</a>
<table border=1>
<tr>
<th>id</th>
<th>email</th>
<th>name</th>
<th>delete</th>
<th>update</th>
</tr>
<c:forEach items = "${registrations}"  var = "registration">
<tr>
<td>${registration.id}</td>
<td>${registration.email}</td>
<td>${registration.name}</td>
<td><a href="deleteRegistrations?id=${registration.id}">delete</a>
<td><a href="updateAllRegistrations?id=${registration.id}">update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>