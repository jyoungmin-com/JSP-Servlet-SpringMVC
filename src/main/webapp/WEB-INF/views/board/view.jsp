<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>VIEW BOARD</title>
</head>
<body>
<h1>Details</h1>

<table border="1">
    <tr>
        <th>ID</th>
        <td>${board.id}</td>
    </tr>
    <tr>
        <th>Date</th>
        <td>${board.date}</td>
    </tr>
    <tr>
        <th>Author</th>
        <td>${board.author}</td>
    </tr>
    <tr>
        <th>Title</th>
        <td>${board.title}</td>
    </tr>
    <tr>
        <th>Content</th>
        <td>${board.body}</td>
    </tr>
</table>

<br/>
<a href="/board/list">Back</a>

</body>
</html>