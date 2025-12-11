<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
</html> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display All</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        margin: 20px;
    }
    table {
        width: 80%;
        border-collapse: collapse;
        margin: 20px auto;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
        background-color: #fff;
    }
    th, td {
        padding: 12px 15px;
        text-align: center;
        border-bottom: 1px solid #ddd;
    }
    th {
        background-color: #007BFF;
        color: white;
        text-transform: uppercase;
        letter-spacing: 0.05em;
    }
    tr:nth-child(even) {
        background-color: #f9f9f9;
    }
    tr:hover {
        background-color: #f1f1f1;
    }
    a {
        text-decoration: none;
        color: #007BFF;
        font-weight: bold;
    }
    a:hover {
        color: #0056b3;
        text-decoration: underline;
    }
    .add-link {
        display: block;
        width: fit-content;
        margin: 20px auto;
        padding: 10px 15px;
        background-color: #28a745;
        color: white;
        border-radius: 5px;
        text-align: center;
    }
    .add-link:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
    <table>
        <tr>
            <th>Book ID</th>
            <th>Book Name</th>
            <th>Author</th>
            <th>Price</th>
            <th>CID</th>
            <th>Action</th>
        </tr>
        <c:forEach var="book" items="${blist}">
        <tr>
            <td>${book.bid}</td>
            <td>${book.bname}</td>
            <td>${book.author}</td>
            <td>${book.price}</td>
            <td>${book.cid}</td>
            <td>
                <a href="deletebook/${book.bid}">Delete</a> / 
                <a href="update/${book.bid}">Edit</a>
            </td>
        </tr>
        </c:forEach>
    </table>
    <a href="addbook" class="add-link">Add New Book</a>
</body>
</html>
