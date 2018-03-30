<%-- 
    Document   : java16_4
    Created on : 2018/03/30, 11:41:41
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
                out.println("クエリストリング"+"http://localhost:8080/java16/java16_4.jsp?total=3000&count=5&type=2");
              
               //type2=「生鮮食品」
               out.println("購入した商品は生鮮食品です");
               //total=購入総額、count=購入した商品の数量
               int i =(3000/5);
               out.println("購入した商品の単価は"+i+"円です");
               //ポイント計算。3000円以上で4％
               double p=(3000*0.04);
               out.println("今回付与されたポイントは"+p+"ポイントです");
            %>

        </h1>

    </body>
</html>
