<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View_Page</title>
</head>
<body>
<h1>Your Result</h1>
<div class="returned" id="servlet">
 <%=request.getAttribute("FirstName")%>
<%=request.getAttribute("Password") %>
</div>
</body>
</html>