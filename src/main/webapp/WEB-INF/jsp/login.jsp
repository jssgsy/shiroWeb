<%--
  Created by IntelliJ IDEA.
  User: Univ
  Date: 16/6/17
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${error}
<form action="/login" method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="text" name="password"/><br>
    <input type="submit" />
</form>
</body>
</html>
