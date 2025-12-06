<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${message}</h1>
	<table border="1">
	<tr>
	<th>pId</th>
	<th>pName</th>
	<th>pQty</th>
	<th>pPrice</th>
	<th>pCid</th>
	<th>Edit</th>
	</tr>
	<c:forEach var="product" items="${plist}">
		<tr>
		<td>${product.pid}</td>
		<td>${product.pname}</td>
		<td>${product.qty}</td>
		<td>${product.price}</td>
		<td>${product.cid}</td>
		<td><a href="#">delete</a> <a href="#">edit</a></td>
		</tr>
	</c:forEach>
	</table>
	<a href ="addproduct">Add Product</a>
</body>
</html>