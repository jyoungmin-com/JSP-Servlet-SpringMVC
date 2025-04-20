<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WRITE BOARD</title>
</head>
<body>
<h1>Write a board</h1>

<form method="post" action="/board/saveBoard">
    <p>ID: <input type="text" name="id" required /></p>
    <p>Title: <input type="text" name="title" required /></p>
    <p>Writer: <input type="text" name="author" required /></p>
    <p>Content:</p>
    <p><textarea name="body" rows="10" cols="50" required></textarea></p>
    <button type="submit">Save</button>
</form>

<a href="/board/list">Back</a>

</body>
</html>