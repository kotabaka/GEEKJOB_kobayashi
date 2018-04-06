<%-- 
    Document   : java18_13_2
    Created on : 2018/04/06, 15:44:42
    Author     : guest1Day
--%>
<%@page import="java.sql.*;" %>
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
                String getname =request.getParameter("textname");
                String getpass =request.getParameter("pass");
                 
            Connection db_con = null;
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaikosystem", "KOBAYASHIKENTO", "3649");
             out.println("接続できました");
             out.println("GetCatalog:" + db_con.getCatalog());

             PreparedStatement sql = null;
             ResultSet rs = null;
             sql = db_con.prepareStatement("SELECT * from userkanri where( name = ? AND pass = ?)IS NOT FALSE");
             sql.setString(1,getname);
             sql.setString(2,getpass);
             rs = sql.executeQuery();
             
             if(rs.next()==true){
                  response.sendRedirect("java18_13_3.html");
             }else{
                  response.sendRedirect("java18_13_1.html");
                  
             //while(rs.next()) {
                // String name = rs.getString("name");
                 //String pass= rs.getString("pass");
                 //if(getname.equals(name)&&getpass.equals(pass)){
                   //  response.sendRedirect("java18_13_3.jsp");
                 //}else{
                   //  response.sendRedirect("java18_13_1.html");
                 //}
             }   

                 //out.println(id + name + tel + age + date);

            
            rs.close();

        } catch (Exception e_con) {
            out.println(e_con.getMessage());
        }

                %>
        </h1>
    </body>
</html>
