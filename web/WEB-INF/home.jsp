<%-- 
    Document   : home
    Created on : Oct 8, 2020, 2:34:36 PM
    Author     : 839645
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link href="WEB-STYLE/base.css" rel="stylesheet" type="text/css" />

    </head>
    <body>
        
        <div class="main">
            <h1>Hello ${username}</h1>
            <p>This is your account home page.</p>
            
            <a href="login?logout">Logout</a>
        </div>
        
    </body>
</html>
