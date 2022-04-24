<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title..........</title>
</head>
<body>
<form action="saveRegistrations" method="post">
<pre>
id:   <input type="text" name="id"/>
email:<input type="text" name="email"/>
name: <input type="text" name="name"/>
<input type="submit" value="save"/>
</pre>
</form>
<pre>  
${msg}

<a href="getAllRegd">Get ALL Registrations</a>
</pre>
</body>
</html>