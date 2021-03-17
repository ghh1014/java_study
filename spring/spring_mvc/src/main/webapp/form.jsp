<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick9" method="post">
    <input type="text" name="userList[0].userName"/><br/>
    <input type="text" name="userList[0].age"/><br/>
    <input type="text" name="userList[1].userName"/><br/>
    <input type="text" name="userList[1].age"/><br/>
    <input type="submit">
</form>
</body>
</html>
