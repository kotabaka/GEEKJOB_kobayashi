<%-- 
    Document   : java18_13_5
    Created on : 2018/04/06, 17:39:11
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
                String getname =request.getParameter("itemID");
                String getpass =request.getParameter("itemname");
                 
            Connection db_con = null;
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zaikosystem", "KOBAYASHIKENTO", "3649");
             out.println("接続できました");
             out.println("GetCatalog:" + db_con.getCatalog());

             PreparedStatement sql = null;
             ResultSet rs = null;
            
             sql = db_con.prepareStatement("SELECT * from iteminfo");
             rs = sql.executeQuery();
             
              while (rs.next()) {
                 int id = rs.getInt("itemID");
                 String name = rs.getString("name");

                 out.println(id + name);

            }

            rs.close();

        } catch (Exception e_con) {
            out.println(e_con.getMessage());
        }

                %>
        </h1>
    </body>
</html>
