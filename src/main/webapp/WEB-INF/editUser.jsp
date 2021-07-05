<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<title>
    Edit User Information
</title>
<p>${error}</p>
<form action="/editUser" method="post">
    <input type="text" placeholder="Enter Username" name="username"  value="${user.getUsername()}"><br>
    <input type="password" placeholder="Enter Password" name="password" value=""required><br>
    <input type="text" placeholder="Enter Firstname" name="firstname" value="${user.getFirstname()}" ><br>
    <input type="text" placeholder="Enter Lastname" name="lastname"  value="${user.getLastname()}"><br>
    <input type="submit" value="Edit">
</form>
</body>
</html>
