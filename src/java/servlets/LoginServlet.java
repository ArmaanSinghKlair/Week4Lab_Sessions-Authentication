/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import util.*;
import model.*;
/**
 *
 * @author 839645
 */
public class LoginServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sess = request.getSession();
        // Check if logout
        if( request.getParameter("logout") != null){
            
            sess.invalidate();
            this.doGet(request, response);

        } else if( sess.getAttribute("username") != null ){
            response.sendRedirect("/home");

        } else {
          this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(this.validate(username) && this.validate(password)){
            
            User u = new AccountService(username,password).login(username, password);
            
            // check if login successful
            if( u != null){
                
                HttpSession sess = request.getSession();
                sess.setAttribute("username", u);
                response.sendRedirect("home");
                
            } else{
                request.setAttribute("username",username);
                request.setAttribute("password",password);
                request.setAttribute("validationMessage","Invalid Username or password.");
                this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

            }
        
        } else {
            request.setAttribute("username",username);
            request.setAttribute("password",password);
            request.setAttribute("validationMessage","All fields required.");
          this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
        
        
    }
    
    private boolean validate(String s){
        if(s == null || s.trim().equals("")){
            return false;
        } else{
            return true;
        }
    }

      /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
