<%-- 
    Document   : FinalMarks
    Created on : 07 Mar 2022, 23:36:27
    Author     : tresorkl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
         int finalMark = (int)request.getAttribute("finalMark");
        
        %>
        <h1>THE FINAL MARK IS <%=finalMark%></h1>
        <form action="StudentPageServlet.do" method="post">
            <input type="submit" value="GO BACK TO MAIN PAGE"/>
        </form>
    </body>
</html>
