<%-- 
    Document   : java18_10_2
    Created on : 2018/04/06, 13:20:59
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
                String getid =request.getParameter("id");
                        
            Connection db_con = null;
         try {
             Class.forName("com.mysql.jdbc.Driver").newInstance();
             db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db", "KOBAYASHIKENTO", "3649");
             out.println("接続できました");
             out.println("GetCatalog:" + db_con.getCatalog());

             PreparedStatement sql = null;
             ResultSet rs = null;
             sql = db_con.prepareStatement("DELETE from profiles where profilesID =?");
             sql.setString(1,getid);
            
             int i = sql.executeUpdate();
             out.println(i + "行が削除されました");
             
             
             sql = db_con.prepareStatement("SELECT * from profiles");
             rs = sql.executeQuery();
             while (rs.next()) {
                 int id = rs.getInt("profilesID");
                 String name = rs.getString("name");
                 String tel = rs.getString("tel");
                 int age = rs.getInt("age");
                 Date date = rs.getDate("birthday");

                 out.println(id + name + tel + age + date);

            }
            rs.close();

        } catch (Exception e_con) {
            out.println(e_con.getMessage());
        }
                %>
        
        </h1>
    </body>
</html>
