<%-- 
    Document   : java2-1
    Created on : 2018/02/27, 13:36:14
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
        <%
            String name = "私の名前は小林健人です。";
            out.print(name);
         %>
        
        </h1>
    </body>
</html>
