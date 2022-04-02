<%-- 
    Document   : Question1
    Created on : 07 Mar 2022, 23:35:19
    Author     : tresorkl
--%>

<%@page import="za.ac.tut.question.Question"%>
<%@page import="java.util.Random"%>
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
      
        Question question1= (Question)request.getAttribute("question1");

    

      %>
    <div class="container">
      <form action="Question2.do" method="post">
        <label for=""><%=question1.getNumOne() %> + <%=question1.getNumTwo() %></label><br />
        <input type="number" name="response1" /><br />
        
             <button type="submit">SUBMIT</button>
       </form>
    </div>
  </body>
</html>

