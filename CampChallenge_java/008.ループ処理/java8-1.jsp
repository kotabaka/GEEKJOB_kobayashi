<%-- 
    Document   : java8-1
    Created on : 2018/03/06, 15:01:07
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
             long num =8;
             for(int i =1;i<=19;i++){num=num*8;}
             out.print(num);
             %>
    </body>
</html>
