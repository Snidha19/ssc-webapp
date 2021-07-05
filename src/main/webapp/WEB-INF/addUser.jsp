<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<head>
</head>
<h2>Welcome, ${username}</h2>
<p>${error}</p>
<form action="/addUser" method="post">
    <input type="text" placeholder="Enter Username" name="username" required><br>
    <input type="password" placeholder="Enter Password" name="password" required><br>
    <input type="text" placeholder="Enter Firstname" name="firstname" required><br>
    <input type="text" placeholder="Enter Lastname" name="lastname" required><br>
    <input type="submit" value="Add User">
</form>
</body>
</html>
