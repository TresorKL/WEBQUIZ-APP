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
public class Question2 extends HttpServlet {

    
 
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // generate random numbers
       Random rn = new Random();
       int numOne = rn.nextInt(400-50+50)+50;
       int numTwo = rn.nextInt(50-1+1)+1;
       char operation = '-';
       
       // instatiate question object
       Question question2= new Question(numOne,numTwo,operation);
       
       // create a session
       HttpSession session = request.getSession();
      //forward question 2 to our session
       session.setAttribute("question2", question2);
       
          // get and send response one to the next servlet
          String response1 = request.getParameter("response1");
          session.setAttribute("response1", response1);
          
          
          request.setAttribute("question2", question2);
       
        RequestDispatcher Disp = request.getRequestDispatcher("Question2.jsp");
        Disp.forward(request, response);
       
    }

     
}
