<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Book</title>
</head>
<body>
    <form action="/insertbook" method="post">
        Book Id : <input type="text" name="bid" id="bid" value=${book.bid} readonly><br>
        Book Name : <input type="text" name="bname" id="bname" value=${book.bname}><br>
        Author : <input type="text" name="author" id="author" value=${book.author}><br>
        Book Price : <input type="text" name="price" id="price" value=${book.price}><br>
        Book cid : <input type="text" name="cid" id="cid" value=${book.cid}><br>
        <button type="submit" name="btn" id="insert">Add Book</button>
    </form>
</body>
</html>
