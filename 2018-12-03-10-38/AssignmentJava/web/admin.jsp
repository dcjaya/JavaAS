<%-- 
    Document   : admin
    Created on : Dec 3, 2018, 5:20:12 AM
    Author     : Chami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Panel</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-2.1.4.min.js"></script>
    </head>
    <body>
        <div class="container container-fluid" style="padding-top: 30px">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-success">
                        <div class="panel panel-heading">
                            <h3>Admin Panel</h3>
                        </div>

                        <%if (session.getAttribute("success_msg") != null) {%>
                        <div class="alert alert-success">
                            <%=session.getAttribute("success_msg").toString()%>
                        </div>
                        <% session.setAttribute("success_msg", null); }%>

                        <div class="panel panel-body">
                            <div class="row">
                                <div class="col-lg-12" style="text-align: right">
                                    <a href="LogOut"><button class="btn btn-primary">Logout</button></a>
                                </div>
                            </div>
                            <div class="row" style="padding-top: 10px">
                                <div class="col-lg-12">
                                    <div class="col-lg-6">
                                        <div class="panel panel-primary">
                                            <a href="add_new_employe.jsp">
                                                <div class="panel panel-body">
                                                    <div><h3>Add New Employee</h3></div>
                                                </div>

                                            </a>
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="panel panel-primary">
                                            <a href="admin_view_all_employee.jsp">
                                                <div class="panel panel-body">
                                                    <div><h3>View All Employees</h3></div>
                                                </div>

                                            </a>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
