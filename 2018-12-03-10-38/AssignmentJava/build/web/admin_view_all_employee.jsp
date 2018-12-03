<%-- 
    Document   : admin_view_all_employee
    Created on : Dec 3, 2018, 5:56:36 AM
    Author     : Chami
--%>

<%@page import="POJOs.Employees"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Employee</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-2.1.4m.in.js"></script>
    </head>
    <body>
        <div class="container container-fluid" style="padding-top: 30px">
            <div class="panel panel-default">
                <div class="panel panel-heading">
                    <h3>Show All Employee</h3>
                </div>
                <% if (session.getAttribute("success_msg") != null) {%>
                <div class="alert alert-success">
                    <%=session.getAttribute("success_msg").toString()%>
                </div>
                <% session.setAttribute("success_msg", null);
                    }%>

                <% if (session.getAttribute("error_msg") != null) {%>
                <div class="alert alert-success">
                    <%=session.getAttribute("error_msg").toString()%>
                </div>
                <% session.setAttribute("error_msg", null);
                    }%>
                <div class="panel panel-body">
                    <% model.Employee em = new Employee();
                        ArrayList<POJOs.Employees> al = em.searchAllEmployees();
                        if (al.size() != 0) {
                    %>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Initials</th>
                                <th>Full Name</th>
                                <th>Contact No</th>
                                <th>Designation</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Employees li : al) {%>
                            <tr>
                                <td><%=li.getInitials()%></td>
                                <td><%=li.getFullName()%></td>
                                <td><%=li.getContactNo()%></td>
                                <td><%=li.getDesignation()%></td>
                                <td><form action="DeleteEmployee" method="POST">
                                        <input type="hidden" value="<%=li.getIdemployees()%>" name="empId">
                                        <a href="">
                                            <button type="submit" name="delete" class="btn btn-danger">Delete</button>
                                        </a>
                                    </form>
                                </td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                    <% }%>
                </div>
            </div>
        </div>
    </body>
</html>
