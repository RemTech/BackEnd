<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" encoding="UTF-8">
<style>
h1 {
  color: blue;
  font-family: verdana;
  font-size: 200%;
}
p {
  color: black;
  font-family: courier;
  font-size: 100%;
}</style>
<title>welcome to the web</title>
</head>
<body>
<h1 align="center">Welcome to this page</h1>
<form action="<%=request.getContextPath()%>/staging" method="post">
<tr>
<table>
<td>
UserName: <input type="text" id="username" name="fname"/><br>
Password: <input type="password" id="password" name="pass"/><br>
</td>
</table>
<td>
<input type="submit" value="submit">
</td>
</tr>
</form>
</body>
</html>