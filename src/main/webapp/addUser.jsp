<%--
  Created by IntelliJ IDEA.
  User: devic
  Date: 01.12.2024
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Добавить пользователя</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 20px; }
        h1 { color: #333; }
        form { background-color: #fff; padding: 20px; border-radius: 5px; box-shadow: 0 0 10px rgba(0,0,0,0.1); }
        label { display: block; margin: 10px 0 5px; }
        input[type="text"], input[type="password"] { width: 100%; padding: 10px; margin-bottom: 10px; border: 1px solid #ccc; border-radius: 5px; }
        input[type="submit"] { background-color: #007BFF; color: white; border: none; padding: 10px; border-radius: 5px; cursor: pointer; }
        input[type="submit"]:hover { background-color: #0056b3; }
    </style>
</head>
<body>
<h1>Добавить пользователя</h1>
<form action="saveUser" method="post">
    <label>Имя:</label>
    <input type="text" name="firstName" required/>
    <label>Фамилия:</label>
    <input type="text" name="lastName" required/>
    <label>Имя пользователя:</label>
    <input type="text" name="username" required/>
    <label>Пароль:</label>
    <input type="password" name="password" required/>
    <input type="submit" value="Добавить"/>
</form>
<a href="index.jsp">Домой</a>
</body>
</html>