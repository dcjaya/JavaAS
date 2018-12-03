<%-- 
    Document   : view_all_employe
    Created on : Dec 3, 2018, 6:04:20 AM
    Author     : Chami
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Employee"%>
<%@page import="POJOs.Employees"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View All Employee</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-2.1.4.min.js"></script>
    </head>
    <body>
        <div class="container container-fluid" style="padding-top: 30px">
            <div class="panel panel-default">
                <div class="panel panel-heading">
                    <h3>Show All Employee</h3>
                </div>
                <div class="panel panel-body">
                    <div class="row">
                        <div class="col-lg-12" style="text-align: right">
                            <a href="LogOut"><button class="btn btn-primary">Logout</button></a>
                        </div>
                    </div>
                    <% model.Employee employees = new Employee();
                        ArrayList<POJOs.Employees> em = employees.searchAllEmployees();
                        if (em.size() != 0) {
                    %>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Initials</th>
                                <th>Full Name</th>
                                <th>Contact</th>
                                <th>Designation</th>
                            </tr>
                        </thead>
                        <tbody>
                            <% for (Employees li : em) {%>
                            <tr>
                                <td><%=li.getInitials()%></td>
                                <td><%=li.getFullName()%></td>
                                <td><%=li.getContactNo()%></td>
                                <td><%=li.getDesignation()%></td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                    <% } else { %>
                    <h3>No Employees to show</h3>
                    <% }%>
                </div>
            </div>
        </div>
    </body>
</html>
