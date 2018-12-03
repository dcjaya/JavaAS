package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_005fnew_005femploye_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add New Employee</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container container-fluid\" style=\"padding-top: 30px\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"col-lg-6\">\n");
      out.write("                        <form action=\"AddNewEmploye\" id=\"employeForm\" method=\"POST\">\n");
      out.write("                            <fieldset>\n");
      out.write("                                <div>\n");
      out.write("                                    <h3>Add New Employee</h3>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                ");
if (session.getAttribute("error_msg") != null) {
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">\n");
      out.write("                                    ");
      out.print(session.getAttribute("error_msg").toString());
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                ");
 session.setAttribute("error_msg", null);
                                    }
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Initials</label>\n");
      out.write("                                    <input id=\"initials\" class=\"form-control\" type=\"text\" name=\"initials\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Full Name</label>\n");
      out.write("                                    <input id=\"full_name\" class=\"form-control\" type=\"text\" name=\"fullname\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Contact No</label>\n");
      out.write("                                    <input id=\"contact_no\" class=\"form-control\" type=\"number\" name=\"contactno\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label>Designation</label>\n");
      out.write("                                    <input id=\"designatoin\" class=\"form-control\" type=\"text\" name=\"designation\">\n");
      out.write("                                </div>\n");
      out.write("                                <button id=\"save_employe\" type=\"button\" class=\"btn btn-primary\">Save</button>                                \n");
      out.write("                            </fieldset>    \n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\"#save_employe\").click(function () {\n");
      out.write("                    if ($(\"#initials\").val() == \"\" || $(\"#full_name\").val() == \"\" || $(\"#contact_no\").val() == \"\" || $(\"#designatoin\").val() == \"\") {\n");
      out.write("                        alert(\"Sorry.!. All fields are mandatory\");\n");
      out.write("                    } else {\n");
      out.write("                        $(\"#employeForm\").submit();\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
