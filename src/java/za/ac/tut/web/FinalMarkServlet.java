/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.processor.Processor;
import za.ac.tut.question.Question;

/**
 *
 * @author tresorkl
 */
public class FinalMarkServlet extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        Question[] questions =new Question[4];
        int[] responses =new int[4];
        
        HttpSession session = request.getSession();
        
       Question q1= (Question)session.getAttribute("question1");
       Question q2= (Question)session.getAttribute("question2");
       Question q3= (Question)session.getAttribute("question3");
       Question q4= (Question)session.getAttribute("question4");
       
       questions[0]= q1;
       questions[1]= q2;
       questions[2]= q3;
       questions[3]= q4;
       
       
          String response1 = (String)session.getAttribute("response1");
          String response2 = (String)session.getAttribute("response2");
          String response3 = (String)session.getAttribute("response3");
          int response4 = Integer.parseInt(request.getParameter("response4"));
          
          responses[0]=Integer.parseInt(response1);
          responses[1]=Integer.parseInt(response2);
          responses[2]=Integer.parseInt(response3);
          responses[3]=response4;
          
          Processor p = new Processor();
          
          int finalMark =p.determineFinalMark(questions, responses);
          
          request.setAttribute("finalMark",finalMark);
          
           
        
        RequestDispatcher Disp = request.getRequestDispatcher("FinalMarks.jsp");
        Disp.forward(request, response);
    }

    

}
