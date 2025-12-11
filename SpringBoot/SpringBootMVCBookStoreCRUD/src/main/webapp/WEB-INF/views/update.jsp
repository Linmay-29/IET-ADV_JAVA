<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
 --%>
 
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Book</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
    }
    form {
        background-color: #fff;
        padding: 25px 30px;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        width: 350px;
    }
    h2 {
        text-align: center;
        margin-bottom: 20px;
        color: #007BFF;
    }
    label {
        display: block;
        margin-bottom: 5px;
        font-weight: bold;
        color: #333;
    }
    input[type="text"] {
        width: 100%;
        padding: 8px 10px;
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 4px;
        transition: border-color 0.3s;
    }
    input[type="text"]:focus {
        border-color: #007BFF;
        outline: none;
    }
    button {
        width: 100%;
        padding: 10px;
        background-color: #ffc107;
        border: none;
        border-radius: 5px;
        color: #333;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s;
    }
    button:hover {
        background-color: #e0a800;
    }
</style>
</head>
<body>
    <form action="/books/updatebook" method="post">
        <h2>Update Book</h2>
        
        <label for="bid">Book Id:</label>
        <input type="text" name="bid" id="bid" value="${book.bid}" readonly>
        
        <label for="bname">Book Name:</label>
        <input type="text" name="bname" id="bname" value="${book.bname}">
        
        <label for="author">Author:</label>
        <input type="text" name="author" id="author" value="${book.author}">
        
        <label for="price">Book Price:</label>
        <input type="text" name="price" id="price" value="${book.price}">
        
        <label for="cid">Book CID:</label>
        <input type="text" name="cid" id="cid" value="${book.cid}">
        
        <button type="submit" name="btn" id="update">Update Book</button>
    </form>
</body>
</html>
 