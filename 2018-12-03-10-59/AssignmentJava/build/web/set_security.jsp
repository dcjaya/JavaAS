<%-- 
    Document   : set_security
    Created on : Dec 3, 2018, 10:47:17 AM
    Author     : Chami
--%>

<%
            if(request.getSession().getAttribute("user") == null){
            
            response.sendRedirect("index.jsp");
            
            }

%>
