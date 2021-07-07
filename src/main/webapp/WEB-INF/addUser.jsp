<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
        background: linear-gradient(to bottom, mistyrose, lightsalmon);
        margin: 0;
        padding: 0;
    }

    .container {
        padding: 16px;
        background-color: snow;
        width: 600px;
        height: 420px;
        border-radius:20px;
        margin: 0 auto 0 auto;
        padding:20px 0px 70px 0px;
        border-color: snow;
        margin-top: 200px;
        justify-content: space-evenly;
    }

    input{
        background:#ecf0f1;
        border: #ccc 1px solid;
        border-bottom: #ccc 2px solid;
        padding: 20px;
        margin-left: 50px;
        width: 500px;
        margin-top:20px;
        font-size:1em;
        border-radius:4px;
    }

    label {
        color: black;
        text-align: center;
        margin-top: 150px;
        margin-left: 230px;
        font-size: 20px;
    }

    button {
        background-color: mistyrose;
        color: black;
        padding: 20px 20px;
        margin: 8px 0;
        margin-left: 70px;
        margin-top: 10px;
        border: none;
        cursor: pointer;
        width: 460px;
        border-radius:20px;
        font-size: 20px;
    }

    button:hover {
        opacity: 0.8;
    }

    p{
        text-align: center;
        margin-top: 10px;
    }

</style>
<body>
<form action="/addUser" method="post">
    <div class="container">
        <label><b> Add New User </b></label>
        <input type="text" placeholder="Enter Username" name="username" required><br>
        <input type="password" placeholder="Enter Password" name="password" required><br>
        <input type="text" placeholder="Enter Firstname" name="firstname" required><br>
        <input type="text" placeholder="Enter Lastname" name="lastname" required><br>
        <p>${error}</p>
        <button type="submit"><b>Add</b></button>
    </div>
</form>
</body>
</html>
