<%-- 
    Document   : add_new_employe
    Created on : Dec 3, 2018, 5:42:51 AM
    Author     : Chami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Employee</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-2.1.4.min.js"></script>
    </head>
    <body>
        <div class="container container-fluid" style="padding-top: 30px">
            <div class="row">
                <div class="col-lg-12">
                    <div class="col-lg-6">
                        <form action="AddNewEmploye" id="employeForm" method="POST">
                            <fieldset>
                                <div>
                                    <h3>Add New Employee</h3>
                                </div>

                                <%if (session.getAttribute("error_msg") != null) {%>
                                <div class="alert alert-danger">
                                    <%=session.getAttribute("error_msg").toString()%>
                                </div>
                                <% session.setAttribute("error_msg", null);
                                    }%>

                                <div class="form-group">
                                    <label>Initials</label>
                                    <input id="initials" class="form-control" type="text" name="initials">
                                </div>
                                <div class="form-group">
                                    <label>Full Name</label>
                                    <input id="full_name" class="form-control" type="text" name="fullname">
                                </div>
                                <div class="form-group">
                                    <label>Contact No</label>
                                    <input id="contact_no" class="form-control" type="number" name="contactno">
                                </div>
                                <div class="form-group">
                                    <label>Designation</label>
                                    <input id="designatoin" class="form-control" type="text" name="designation">
                                </div>
                                <button id="save_employe" type="button" class="btn btn-primary">Save</button>                                
                            </fieldset>    
                        </form>
                    </div>
                    <div class="col-lg-6"></div>
                </div>
            </div>
        </div>

        <script>
            $(document).ready(function () {
                $("#save_employe").click(function () {
                    if ($("#initials").val() == "" || $("#full_name").val() == "" || $("#contact_no").val() == "" || $("#designatoin").val() == "") {
                        alert("Sorry.!. All fields are mandatory");
                    } else {
                        $("#employeForm").submit();
                    }
                });
            });
        </script>

    </body>
</html>
