/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

/**
 *
 * @author Chami
 */
public class AddNewEmploye extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        try {
            String initials = request.getParameter("initials");
            String fullname = request.getParameter("fullname");
            String contactno = request.getParameter("contactno");
            String designation = request.getParameter("designation"); 
            
            model.Employee employee = new Employee();
            
            boolean result = employee.saveEmploye(initials,fullname,contactno,designation);
            
            if(result){
            request.getSession().setAttribute("success_msg", "Employee save successfully.");
            response.sendRedirect("admin.jsp");
            }else{
            request.getSession().setAttribute("error_msg", "Sorry.! Employee not save.");
            response.sendRedirect("add_new_employe.jsp");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
}

   

}
