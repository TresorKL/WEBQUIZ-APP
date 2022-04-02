/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.question.Question;

/**
 *
 * @author tresorkl
 */
public class Question3 extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     Random rn = new Random();
       int numOne = rn.nextInt(100-1+1)+1;
       int numTwo = rn.nextInt(50-1+1)+1;
       char operation = '*';
       
       // instatiate question object
       Question question3= new Question(numOne,numTwo,operation);
        
        // create a session
       HttpSession session = request.getSession();
      
       session.setAttribute("question3", question3);
       
       // get and send response one to the next servlet
          String response1 = (String)session.getAttribute("response1");
          String response2 = request.getParameter("response2");
          
          
          session.setAttribute("response1", response1);
          session.setAttribute("response2", response2);
        
       
        
        request.setAttribute("question3", question3);
        
        
       
        RequestDispatcher Disp = request.getRequestDispatcher("Question3.jsp");
        Disp.forward(request, response);
       
    }

     
}
