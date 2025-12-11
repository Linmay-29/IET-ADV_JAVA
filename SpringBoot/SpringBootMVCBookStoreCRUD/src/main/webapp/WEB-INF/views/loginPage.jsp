<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h2>${message}</h2>
	<form action="/validatelogin" method="post">
	<input type="text" name="uname" id="uname" placeholder="Enter Username"/><br>
	<input type="text" name="pass" id="pass" placeholder="Enter Password"/><br>
	<button type="submit">Login</button>
	</form>
</body>
</html> --%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
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
    .login-container {
        background-color: #fff;
        padding: 30px 40px;
        border-radius: 8px;
        box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        width: 350px;
        text-align: center;
    }
    h2 {
        margin-bottom: 20px;
        color: #007BFF;
    }
    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
        transition: border-color 0.3s;
    }
    input[type="text"]:focus, input[type="password"]:focus {
        border-color: #007BFF;
        outline: none;
    }
    button {
        width: 100%;
        padding: 12px;
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
    <div class="login-container">
        <h2>${message}</h2>
        <form action="/validatelogin" method="post">
            <input type="text" name="uname" id="uname" placeholder="Enter Username" required/>
            <input type="password" name="pass" id="pass" placeholder="Enter Password" required/>
            <button type="submit">Login</button>
        </form>
    </div>
</body>
</html>
