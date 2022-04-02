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
import za.ac.tut.processor.Processor;
import za.ac.tut.student.Student;

/**
 *
 * @author tresorkl
 */
public class StudentPageServlet extends HttpServlet {

    
     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //the current student info must come from another servlet
        Processor processor = new Processor();
        Student currentStudent =processor.getCurrentStudent(1111);
             
             request.setAttribute("currentStudent", currentStudent);
        
        RequestDispatcher Disp = request.getRequestDispatcher("StudentPage.jsp");
            Disp.forward(request, response);
        
    }

  

}
