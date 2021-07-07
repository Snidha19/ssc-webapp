<html>
<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
        // background-color: mistyrose;
        background: linear-gradient(to bottom, mistyrose, lightsalmon);
        margin: 0;
        padding: 0;
    }

    h2 {
        color: black;
        text-align: center;
        margin-top: 150px;
        font-size: 40px;
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

    .container {
        padding: 16px;
        background-color: snow;
        width: 600px;
        height: 300px;
        border-radius:20px;
        margin: 0 auto 0 auto;
        padding:20px 0px 70px 0px;
        border-color: snow;
        margin-top: 10px;
        justify-content: space-evenly;
    }

    button {
        background-color: mistyrose;
        color: black;
        padding: 20px 20px;
        margin: 8px 0;
        margin-left: 100px;
        border: none;
        cursor: pointer;
        width: 460px;
        margin-left: 70px;
        border-radius:20px;
        font-size: 20px;
    }

    button:hover {
        opacity: 0.8;
    }

    p{
        text-align: center;
        margin-top: 20px;
    }

</style>
    <body>
        <h2>Login</h2>
        <form action="/login"  method="post">
        <div class="container">
            <br>
            <input type="text" placeholder="Enter Username" name="username" required>
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>
            <br/>
            <p>${error}</p>
            <br/>
            <button type="submit"><b>Sign in</b></button>
        </div>
        </form>
    </body>
</html>
