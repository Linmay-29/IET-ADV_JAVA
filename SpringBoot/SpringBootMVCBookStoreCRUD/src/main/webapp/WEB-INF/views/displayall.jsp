<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display All</title>
</head>
<body>
	<table border='2'>
<tr><th>book id</th>
	<th>book Name</th>
	<th>author</th>
	<th>Price</th>
	<th>cid</th>
	<th>action</th>
	
</tr>
<c:forEach var="book" items="${blist}">
<tr>
	<td>${book.bid}</td>
	<td>${book.bname}</td>
	<td>${book.author}</td>
	<td>${book.price}</td>
	<td>${book.cid}</td>
	<td><a href="deletebook/${book.bid}">delete</a>/<a href="update/${book.bid}">edit</a></td>
</tr>
</c:forEach>
</table>
<a href="addbook">Add new book</a>
</body>
</html>