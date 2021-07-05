<%@ page import="io.muic.ooc.webapp.service.User" %>
<%@ page import="java.util.List" %>
<%@ page import="io.muic.ooc.webapp.service.DBService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<head>
</head>
<h2>Welcome, ${currentUser.getUsername()}</h2>
<table>
    <tr>
        <th>Username</th>
        <th>Firstname</th>
        <th>LastName</th>
    </tr>
    <%
        DBService database=new DBService();
        List<User> userList =  database.getUserList();
        for (User u: userList){
            String username = u.getUsername();
            String firstname = u.getFirstname();
            String lastname = u.getLastname();

    %>
        <tr>
            <td><%=username%></td>
            <td><%=firstname%></td>
            <td><%=lastname%></td>
            <td>
                <form method="get" action="/delUser">
                    <button type="submit" onclick="return confirm('Are you sure you want to delete this user?');" name="username" value="<%=username%>">delete</button>
                </form>
            </td>
            <td>
                <form method="get" action="/editUser">
                    <button type="submit" name="username" value="<%=username%>">edit</button>
                </form>
            </td>
        </tr>
    <%
    }
        %>
</table>
<p> ${delError}</p>
<button type="submit"><a href="/addUser">Add User</a></button>
<button type="submit"><a href="/logOut">Logout</a></button>
<br>

<h3>User Profile </h3>
<p>
    Username: ${currentUser.getUsername()}<br>
    Firstname: ${currentUser.getFirstname()}<br>
    Lastname: ${currentUser.getLastname()}
</p>

</body>
</html>