<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>BOARD LIST</title>
</head>
<body>
<h1>Board List</h1>
<a href="/board/write">Write board</a>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Author</th>
        <th>Title</th>
        <th>Date</th>
        <th>GO</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="board" items="${boards}">
        <tr>
            <td>${board.id}</td>
            <td>${board.author}</td>
            <td>${board.title}</td>
            <td>${board.date}</td>
            <td><a href="/board/view?id=${board.id}">GO</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>