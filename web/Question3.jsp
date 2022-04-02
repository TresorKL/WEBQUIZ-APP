<%-- 
    Document   : Question3
    Created on : 07 Mar 2022, 23:35:56
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
      
       Question question3= (Question)request.getAttribute("question3");

         

      %>
    <div class="container">
       
       <form action="Question4.do" method="post">
        <label for=""><%= question3.getNumOne() %> * <%= question3.getNumTwo() %> </label><br />
        <input type="number" name="response3" /><br />
        
             <button type="submit">SUBMIT</button>
        
       
       
      </form>
    </div>
    </div>
  </body>
</html>
