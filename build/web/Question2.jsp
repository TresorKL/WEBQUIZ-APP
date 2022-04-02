<%-- 
    Document   : Question2
    Created on : 07 Mar 2022, 23:35:36
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
      
       Question question2= (Question)request.getAttribute("question2");

       
      %>
    <div class="container">
     
       <form action="Question3.do" method="post">
        <label ><%= question2.getNumOne() %> - <%= question2.getNumTwo() %> </label><br />
        <input type="number" name="response2" /><br />
        
             <button type="submit">SUBMIT</button>
        
       
      </form>
      
    </div>
  </body>
</html>
