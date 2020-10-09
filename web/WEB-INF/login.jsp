<%-- 
    Document   : login
    Created on : Oct 8, 2020, 2:34:20 PM
    Author     : 839645
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="WEB-STYLE/base.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="main">
            <form action="login" method="POST">
                    <h1>Login</h1>
                <label for="username">
                    Username 
                    <input type="text" name="username" id="username" value="${username}"/>
                </label>
                
                <label for="password">
                    Password 
                    <input type="password" name="password" id="password" value="${password}"/>
                </label>
                
                <input type="submit" value="Login" />
            </form>
            <div class="error">${validationMessage}</div>
            <div style="text-align: center">
                ${message}
            </div>
        </div>
    </body>
</html>
