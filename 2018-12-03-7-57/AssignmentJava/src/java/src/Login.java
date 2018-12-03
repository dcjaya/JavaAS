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
import model.User;

/**
 *
 * @author Chami
 */
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if(username.equals("manager") && password.equals("mA123#")){
                request.getSession().setAttribute("admin", "Admin");
                response.sendRedirect("admin.jsp");
            }else{
                model.User user = new User();
                POJOs.Users result = user.loginUser(username,password);
                
                if(result == null){
                request.getSession().setAttribute("log_msg", "Sory.! you'r password not match");
                response.sendRedirect("index.jsp");
                
                }else{
                request.getSession().setAttribute("user", result);
                response.sendRedirect("view_all_employe.jsp");
                }
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
}

   

}
