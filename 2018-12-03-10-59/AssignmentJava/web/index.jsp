<%-- 
    Document   : index
    Created on : Dec 3, 2018, 4:56:36 AM
    Author     : Chami
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="css/bootstrap.css" rel="stylesheet">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery-2.1.4.min.js"></script>
    </head>
    <body>
        <div class="container container-fluid" style="padding-top: 80px">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel panel-heading">
                            <h3>Login</h3>
                        </div>
                        <div class="panel panel-body">
                            <form action="Login" id="loginForm" method="POST">
                                <fieldset>
                                    <div class="form-group">
                                        <input id="username" class="form-control" type="text" name="username" placeholder="username:-ex:Manager,Accountan,Developer" autofocus>
                                    </div>
                                    <div class="form-group">
                                        <input id="password" class="form-control" type="password" name="password" placeholder="password">
                                    </div>
                                    <button id="login_controle" type="button" class="btn btn-lg btn-primary">Login Control</button>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        <script>
            $(document).ready(function (){
                $('#login_controle').click(function (){
                    if($('#username').val() == "" || $('#password').val() == ""){
                        alert("Sorry.!. All fields are mandatory");
                    }else{
                        $('#loginForm').submit();
                    }
                });
            });
        </script>
        
    </body>
</html>
