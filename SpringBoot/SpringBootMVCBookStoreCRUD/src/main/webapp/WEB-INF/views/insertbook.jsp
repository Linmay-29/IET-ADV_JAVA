<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
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
</html> --%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Book</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f9;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    form {
        background-color: #fff;
        padding: 25px 30px;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        width: 350px;
    }
    form h2 {
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
        background-color: #28a745;
        border: none;
        border-radius: 5px;
        color: white;
        font-size: 16px;
        cursor: pointer;
        transition: background-color 0.3s;
    }
    button:hover {
        background-color: #218838;
    }
</style>
</head>
<body>
    <form action="/books/insertbook" method="post">
        <h2>Add New Book</h2>
        
        <label for="bid">Book Id:</label>
        <input type="text" name="bid" id="bid">
        
        <label for="bname">Book Name:</label>
        <input type="text" name="bname" id="bname">
        
        <label for="author">Author:</label>
        <input type="text" name="author" id="author">
        
        <label for="price">Book Price:</label>
        <input type="text" name="price" id="price">
        
        <label for="cid">Book CID:</label>
        <input type="text" name="cid" id="cid">
        
        <button type="submit" name="btn" id="insert">Add New Book</button>
    </form>
</body>
</html>
