<%-- 
    Document   : Question4
    Created on : 07 Mar 2022, 23:36:09
    Author     : tresorkl
--%>

<%@page import="za.ac.tut.question.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />

    <title>Document</title>
    <link rel="stylesheet" href="questions.css" />
  </head>
  <body>
    <%
      
       Question question4= (Question)request.getAttribute("question4");

         

      %>
    <div class="container">
     
       <form action="FinalMarkServlet.do" method="post">
        <label for=""><%= question4.getNumOne() %> / <%= question4.getNumTwo() %> </label><br />
        <input type="number" name="response4" /><br />
        
             <button type="submit">DONE</button>
        </form>
    </div>
    </div>
  </body>
</html>
