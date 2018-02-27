<%-- 
    Document   : java3-1
    Created on : 2018/02/27, 14:06:15
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
                int num1 =2;
                final int num2 =4;
                out.print(num1+num2);
                out.print(num1-num2);
                out.print(num1*num2);
                out.print(num1/num2);
                out.print(num1%num2);
                %>
        </h1>
    </body>
</html>
