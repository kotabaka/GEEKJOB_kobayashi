<%-- 
    Document   : java16_4.5
    Created on : 2018/03/30, 16:29:15
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
               //http://localhost:8080/java16/java16_4.5.jsp?total=148
               
               int total =148;
               int i =3;
               
               out.print(total+"=");
               while(total%2==0){
                   out.print(2+"*");
                   total/=2;                       
       }
           
           while (total != 1) {
               if (total % i == 0) {
                   out.println(i);
                   total /= i;
               } else {
                   i += 2;
               }
              
           }


            %>
        </h1>
    </body>
</html>
