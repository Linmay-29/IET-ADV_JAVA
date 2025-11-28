<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form >
	<label>Enter Username</label>
	<input type="text" name="uname" id="uname"/>
	<label>Enter Password</label>
	<input type="text" name="pass" id="pass"/>
	<button type="submit">Login</button>
	</form>
	
	<%
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		session = request.getSession();
		session.setAttribute("name", uname);
		session.setAttribute("pass", pass);
		if(uname!=null || pass!=null){
			out.println("<h3>Username : "+session.getAttribute("name")+"</h3>");
			out.println("<h3>Password : "+session.getAttribute("pass")+"</h3>");
		}
	%>
</body>
</html>