<%-- 
    Document   : java8-4
    Created on : 2018/03/07, 17:27:07
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
                float data =1000;
                while(data>=100){data=data/2;}
                out.print(data);
                %>
        </h1>
    </body>
</html>
