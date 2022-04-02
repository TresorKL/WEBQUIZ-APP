 
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
 
public class Question4 extends HttpServlet {

    
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     Random rn = new Random();
       int numOne = rn.nextInt(100-30+30)+30;
       int numTwo = rn.nextInt(20-1+1)+1;
       char operation = '+';
       
       // instatiate question object
       Question question4= new Question(numOne,numTwo,operation);
       HttpSession session = request.getSession();
       
        
           
       session.setAttribute("question4", question4);
       
       // get and send response one to the next servlet
          String response1 = (String)session.getAttribute("response1");
          String response2 = (String)session.getAttribute("response2");
          String response3 = request.getParameter("response3");
          
          
          session.setAttribute("response1", response1);
          session.setAttribute("response2", response2);
          session.setAttribute("response3", response3);

        
          request.setAttribute("question4", question4);
        
        
       
        RequestDispatcher Disp = request.getRequestDispatcher("Question4.jsp");
        Disp.forward(request, response);
       
    }

     
}
