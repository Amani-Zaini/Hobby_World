<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>error</title>
</head>
<body>
	
	<%
         // Set error code and reason.
         response.sendError(404, "Sorry, No information has been added for this course!");

      %>
</body>
</html>