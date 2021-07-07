<%@ page import="io.muic.ooc.webapp.service.User" %>
<%@ page import="java.util.List" %>
<%@ page import="io.muic.ooc.webapp.service.DBService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(to bottom, mistyrose, lightsalmon);
        margin: 0;
        padding: 0;
    }
    .user-profile {
        padding: 16px;
        background-color: lavenderblush;
        width: 400px;
        height: 100px;
        border-radius:20px;
        margin: 0 auto 0 auto;
        padding:20px 0px 70px 0px;
        border-color: snow;
        margin-top: 50px;
        justify-content: space-evenly;
    }

    .label1{
        align-self: center;
        margin-left: 140px;
        font-size: 25px;
    }

    .table1 {
        border-collapse: collapse;
        width: 80%;
        margin-left: 40px;
        margin-top: 30px;
    }

    thead {
        text-align: center;
    }

    .td1 {
        padding: 0.25rem;
        border: 1px;
        text-align: left ;
        border-bottom: 1px solid #ccc;
        font-size: 16px;
    }

    .td2 {
        padding: 0.25rem;
        border: 1px;
        text-align: right ;
        border-bottom: 1px solid #ccc;
        font-size: 16px;
    }

    .user-table {
        background-color: lavenderblush;
        width: 70%;
        height: 500px;
        border-radius:20px;
        margin: 0 auto 0 auto;
        border-color: snow;
        margin-top: 30px;
        justify-content: space-evenly;
    }

    .label2{
        margin-left: 850px;
        align-self: center;
        font-size: 25px;
        padding-top: 30px;
    }

    .button1 {
        background-color: lavenderblush;
        color: black;
        padding: 10px 10px;
        margin: 8px 0;
        margin-left: 400px;
        margin-top: 20px;
        border: none;
        cursor: pointer;
        width: 200px;
        border-radius:15px;
        font-size: 16px;
    }

    .button2 {
        background-color: lavenderblush;
        color: black;
        padding: 10px 10px;
        margin: 8px 0;
        margin-left: 600px;
        margin-top: 20px;
        border: none;
        cursor: pointer;
        width: 200px;
        border-radius:15px;
        font-size: 16px;
    }

    button:hover {
        opacity: 0.8;
    }


    th {
        text-align: center;
        padding-top: 30px;
        padding-bottom: 30px;
        border-bottom: 1px solid #ccc;
    }

    .tr {
        padding: 0.25rem;
        text-align: center ;
        font-size: 16px;
        border-bottom: 1px solid #ccc;
    }

    .button3 {
        background-color: lightsalmon;
        color: black;
        padding: 10px 10px;
        margin: 8px 0;
        margin-left: 60px;
        margin-top: 30px;
        border: none;
        cursor: pointer;
        border-radius:15px;
        font-size: 16px;
    }

    p{
        margin-left: 730px;
        align-self: center;
        font-size: 18px;
        padding-top: 20px;
    }

    form{
        float:left;
    }

    </style>
<body>
<head>
</head>
<div class ="user-profile">
    <label class="label1"> User Profile </label>
<table class="table1" >
    <tbody>
    <tr>
        <td class="td1"> Username </td>
        <td class="td2"> ${currentUser.getUsername()} </td>
    </tr>

    <tr>
        <td class="td1"> Firstname </td>
        <td class="td2"> ${currentUser.getFirstname()} </td>
    </tr>

    <tr>
        <td class="td1"> Lastname </td>
        <td class="td2"> ${currentUser.getLastname()} </td>
    </tr>
    </tbody>
</table>
</div>
<div class="label2">
    <label > User List </label>
</div>

<table class="user-table">
    <tr>
        <th>Username</th>
        <th>Firstname</th>
        <th>LastName</th>
        <th>&nbsp;</th>
        <th>&nbsp;</th>
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
            <td class="tr"><%=username%></td>
            <td class="tr"><%=firstname%></td>
            <td class="tr"><%=lastname%></td>
            <td class="tr">
                <form method="get" action="/delUser">
                    <button class="button3" type="submit" onclick="return confirm('Are you sure you want to delete this user?');" name="username" value="<%=username%>">delete</button>
                </form>
            </td>
            <td class="tr">
                <form method="get" action="/editUser">
                    <button class="button3" type="submit" name="username" value="<%=username%>">edit</button>
                </form>
            </td>
        </tr>
    <%
    }
        %>
</table>

<p>${delError}</p>
<form action="/addUser" method="get" >
    <button type="submit" class="button1">Add User</button>
</form>
<form action="/logOut" method="get">
<button type="submit" class="button2" action="/logOut">Logout</button>
</form>
</body>
</html>