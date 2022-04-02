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
public class Login extends HttpServlet {
 
     

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        // GETTING DATA
        String userIdStr= request.getParameter("userid");
        String passwordStr= request.getParameter("password");
        
        int userId = Integer.parseInt(userIdStr);
        int password =  Integer.parseInt(passwordStr);
        
        // Process data
        Processor processor = new Processor();
        
         boolean isStudentValid = processor.loginStudent(userId, password);
        
        boolean isAdminValid = processor.loginAdmin(userId, password);
        
         if(isStudentValid){
             
             Student currentStudent =processor.getCurrentStudent(userId);
             
             request.setAttribute("currentStudent", currentStudent);
        
            RequestDispatcher Disp = request.getRequestDispatcher("StudentPage.jsp");
            Disp.forward(request, response);
         }else if(isAdminValid){
             RequestDispatcher Disp = request.getRequestDispatcher("AdminPage.jsp");
             Disp.forward(request, response);
      }else{
            RequestDispatcher Disp = request.getRequestDispatcher("WarningPage.jsp");
           Disp.forward(request, response);
         }
    }

     
   

}
