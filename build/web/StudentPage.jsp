<%-- 
    Document   : StudentPage
    Created on : 07 Mar 2022, 23:57:38
    Author     : tresorkl
--%>

<%@page import="za.ac.tut.student.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />

    <title>Document</title>
    <link rel="stylesheet" href="studentPage.css" />
  </head>
  <body>
      <%
       Student currentStudent = (Student)request.getAttribute("currentStudent");
        
         
      %>
    <div class="container">
      <h3> NAME:<%= currentStudent.getName() %> </h3>
      <h3> STUDENT ID <%= currentStudent.getStudentNumber() %></h3>
      
      <form  action="Question1.do" method="post">
          
          <button formaction="IndexServlet.do" >LOGOUT</button>
          <button type="submit">START QUIZ</button>
          
      </form>
      
    </div>
  </body>
</html>
