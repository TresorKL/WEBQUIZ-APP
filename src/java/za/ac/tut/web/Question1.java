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
public class Question1 extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
       // generate radom numbers 
       Random rn = new Random();
       int numOne = rn.nextInt(100-1+1)+1;
       int numTwo = rn.nextInt(100-1+1)+1;
       char operation = '+';
       
       // instatiate question object
       Question question1= new Question(numOne,numTwo,operation);
       
       
       // create a session object
       HttpSession session = request.getSession();
       
       // send the question 1 to our session
       session.setAttribute("question1", question1);
       
       // send data to the jsp page
       request.setAttribute("question1", question1);
         
       
        RequestDispatcher Disp = request.getRequestDispatcher("Question1.jsp");
        Disp.forward(request, response);
    }
 
}
