<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%@page import="javax.servlet.http.Cookie" %>
<%
    HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
        
        
    <form action="insertconfirm" method="POST">
        名前:
        <% if(session.getAttribute("name")!=null){%>
        <input type="text" name="name" value="<%=session.getAttribute("name")%>" >
        <%}else{%>
        <input type="text" name="name"><%}%>
        <br><br>

        生年月日:
        <% if (session.getAttribute("year") != null) {%>
        <select name="year">
            <option value=""><%=session.getAttribute("year")%></option>
            <%
                for (int i = 1950; i <= 2010; i++) {%>
            <option value="<%=i%>"> <%=i%> </option>
            <% } %>
            <% } else {%>
            <select name="year">
                <option value="">----</option>
                <%
                for (int i = 1950; i <= 2010; i++) {%>
                <option value="<%=i%>"> <%=i%> </option>
                <% }
                } %>

            </select>年
            <% if (session.getAttribute("month") != null) {%>
            <select name="month" >
                <option value=""><%=session.getAttribute("month")%></option>
                <%
                for (int i = 1; i <= 12; i++) {%>
                <option value="<%=i%>"><%=i%></option>
                <% } %>
                <% } else {%>
                <select name="month" >
                    <option value="">----</option>
                    <%
                for (int i = 1; i <= 12; i++) {%>
                    <option value="<%=i%>"><%=i%></option>
                    <% }
                } %>
                </select>月
                <% if (session.getAttribute("day") != null) {%>
                <select name="day">
                    
                    <option value=""><%=session.getAttribute("day")%></option>
                    <%
                for (int i = 1; i <= 31; i++) {%>
                    <option value="<%=i%>"><%=i%></option>
                    <% } %>
                    <% } else {%>
                    <select name="day">
                        <option value="">--</option>
                        <%
                for (int i = 1; i <= 31; i++) {%>
                        <option value="<%=i%>"><%=i%></option>
                        <% }
                } %>
                    </select>日
                    <br><br>

        種別:
        <br>
        <input type="radio" name="type" value="1" checked>エンジニア<br>
        <input type="radio" name="type" value="2">営業<br>
        <input type="radio" name="type" value="3">その他<br>
        <br>

        電話番号:
        <% if(session.getAttribute("tell")!=null){%>
        <input type="text" name="tell" value="<%=session.getAttribute("tell")%>">
         <% }else{%>
        <input type="text" name="tell" value=""><%}%>
        <br><br>

        自己紹介文
        <br>
        <% if(session.getAttribute("comment")!=null){%>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%=session.getAttribute("comment")%></textarea>
        <% }else{%>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"></textarea><%}%>
        <br><br>

        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
