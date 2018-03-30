<%-- 
    Document   : java16_2
    Created on : 2018/03/27, 17:13:08
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
                //request.setCharacterEncoding("UTF-8");
                out.print(request.getParameter("Name"));
                out.print(request.getParameter("gender"));
                out.print(request.getParameter("syumi"));
                %>
        </h1>
    </body>
</html>
