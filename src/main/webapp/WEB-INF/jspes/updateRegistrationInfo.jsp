<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateRegi" method="post">
<pre>
id:   <input type="text" name="id" value="${registration.id}"/>
email:<input type="text" name="email" value="${registration.email}"/>
name: <input type="text" name="name" value="${registration.name}"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>