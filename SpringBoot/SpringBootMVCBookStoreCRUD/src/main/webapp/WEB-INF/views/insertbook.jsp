<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/insertbook" method="post">
Book Id : <input type="text" name="bid" id="bid"><br>
Book Name : <input type="text" name="bname" id="bname"><br>
Author : <input type="text" name="author" id="author"><br>
Book Price : <input type="text" name="price" id="price"><br>
Book cid : <input type="text" name="cid" id="cid"><br>
<button type="submit" name="btn" id="insert">Add new Product</button>

</form>
</body>
</html>