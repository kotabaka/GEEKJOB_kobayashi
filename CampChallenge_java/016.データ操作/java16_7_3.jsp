<%-- 
    Document   : java16_7_3
    Created on : 2018/03/30, 15:26:04
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
                 request.setCharacterEncoding("UTF-8");
            HttpSession name = request.getSession();
            if(name.getAttribute("name")!=null){
            out.println(name.getAttribute("name"));}else{
            name.setAttribute("name",request.getParameter("Name"));
            out.println(request.getParameter("Name"));}
            
            HttpSession gender = request.getSession();
            if(name.getAttribute("gender")!=null){
            out.println(name.getAttribute("gender"));}else{
            gender.setAttribute("gender",request.getParameter("Gender"));
            out.println(request.getParameter("Gender"));}
            
            HttpSession syumi = request.getSession();
            if(name.getAttribute("syumi")!=null){
             out.println(name.getAttribute("syumi"));}else{
            syumi.setAttribute("syumi", request.getParameter("Syumi"));
            out.println(request.getParameter("Syumi"));}
                %>
        </h1>
    </body>
</html>
