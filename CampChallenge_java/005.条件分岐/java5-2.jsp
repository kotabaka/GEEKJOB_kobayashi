<%-- 
    Document   : java5-2
    Created on : 2018/03/02, 13:12:01
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
                char moji='い';
                switch (moji){
                    case 'A' :out.print("英語");
                    break;
                    case 'あ':out.print("日本語");
                }
            %>
        </h1>
    </body>
</html>
