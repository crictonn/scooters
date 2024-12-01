<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Главная страница</title>
    <style>
        body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 20px; }
        h1 { color: #333; }
        ul { list-style-type: none; padding: 0; }
        li { margin: 10px 0; }
        a { text-decoration: none; color: #007BFF; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>
<h1>Действия с записями</h1>
<h2>Пользователи</h2>
<ul>
    <li><a href="addUser.jsp">Добавить пользователя</a></li>
    <li><a href="getAllUsers">Просмотреть всех пользователей</a></li>
    <li><a href="deleteUser.jsp">Удалить пользователя</a></li>
</ul>

<h2>Компании</h2>
<ul>
    <li><a href="lazy.jsp">Добавить компанию</a></li>
    <li><a href="lazy.jsp">Просмотреть все компании</a></li>
    <li><a href="lazy.jsp">Удалить компанию</a></li>
</ul>

<h2>Самокаты</h2>
<ul>
    <li><a href="lazy.jsp">Добавить самокат</a></li>
    <li><a href="lazy.jsp">Просмотреть все самокаты</a></li>
    <li><a href="lazy.jsp">Удалить самокат</a></li>
</ul>
</body>
</html>