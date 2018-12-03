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
public class DeleteEmployee extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String employeid = request.getParameter("empId");

            model.Employee employee = new Employee();
            boolean result = employee.deleteEmploye(employeid);

            if (result) {
                request.getSession().setAttribute("success_msg", "Employee Delete Successfully.");
                response.sendRedirect("admin_view_all_employee.jsp");
            } else {
                request.getSession().setAttribute("error_msg", "Employee Delete Successfully.");
                response.sendRedirect("admin_view_all_employee.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
