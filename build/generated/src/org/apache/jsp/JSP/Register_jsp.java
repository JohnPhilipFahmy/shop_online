package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{width: 1000px;\n");
      out.write("                 height: 700px;\n");
      out.write("                 background: linear-gradient(to bottom,black,white ,black );  }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #mainNiv{width: 1100px;\n");
      out.write("                     height: 90px;\n");
      out.write("                     background: linear-gradient(to bottom,black,white ,black ); \n");
      out.write("                     margin-left: auto;\n");
      out.write("                     margin-right: auto;\n");
      out.write("\n");
      out.write("                     left: 120px;\n");
      out.write("                     position: absolute;\n");
      out.write("                     bottom:500px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .ourPage{\n");
      out.write("                float: left;\n");
      out.write("                list-style-type: none;\n");
      out.write("\n");
      out.write("\n");
      out.write("                margin: 10px;}\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("                display: white;\n");
      out.write("                color: black;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size:30px; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover {\n");
      out.write("                background-color:white;\n");
      out.write("                border-radius:  90px 90px 90px 90px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            li {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            #bage\n");
      out.write("            {\n");
      out.write("                width: auto;\n");
      out.write("                height: 350px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                position: absolute;\n");
      out.write("                top:100px;\n");
      out.write("                left: 200px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #firstName{bottom:100px;}\n");
      out.write("            #firstNameInput{margin-left:30px;\n");
      out.write("                            margin-top: 80px;}\n");
      out.write("\n");
      out.write("            #lastName{margin-left:0px;}\n");
      out.write("            #lastNameInput{margin-left:33px;}\n");
      out.write("\n");
      out.write("            #GenderInput{margin-left:48px;}\n");
      out.write("            .Gender{margin-left:0px}\n");
      out.write("\n");
      out.write("            #EmailInput{margin-left:55px;}\n");
      out.write("\n");
      out.write("            #passwordInput{margin-left:30px;}\n");
      out.write("\n");
      out.write("            #addressInput{margin-left:46px;}\n");
      out.write("            #button{margin-left:200px; }\n");
      out.write("            #userTybe{margin-left:30px;}\n");
      out.write("\n");
      out.write("        </style>\n");

String validate=request.getParameter("validate");
String msg="'";
if(validate!=null&&validate.equals("false")){
msg="error in data please try agin";
}

      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav id=\"mainNiv\">\n");
      out.write("            <ul id=\"navmenu\">\n");
      out.write("                <li class=\"ourPage\"><a href=\"mainPage.html\" >HOME</a></li>\n");
      out.write("\n");
      out.write("                <li class=\"ourPage\"><a href=\"#ABOUT\" target=\"_blank\">ABOUT</a></li>\n");
      out.write("\n");
      out.write("                <li class=\"ourPage\"><a href=\"contact.html\" target=\"_blank\">CONTACT</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"bage\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <form method=\"POST\" action=\"../RegisterCheak\">\n");
      out.write("\n");
      out.write("                <label for=\"text\" id=\"firstName\">first Name:-</label>\n");
      out.write("                <input type=\"text\" id=\"firstNameInput\" name=\"firstName\" ><br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label for=\"text\" id=\"lastName\">last Name:-</label>\n");
      out.write("                <input type=\"text\" id=\"lastNameInput\" name=\"lastName\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"text\" id=\"PhoneNumber\">Phone Number:-</label>\n");
      out.write("                <input type=\"text\" id=\"PhoneNumberInput\" name=\"PhoneNumber\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <label for=\"text\" id=\"Email\">Email:-</label>\n");
      out.write("                <input type=\"text\" id=\"EmailInput\" name=\"Email\" >\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"text\" id=\"password\"> Password:-</label>\n");
      out.write("                <input type=\"password\" id=\"passwordInput\" name=\"password\" />\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"address\" id=\"address\">address- </label>\n");
      out.write("                <input type=\"text\" name=\"address\" id=\"addressInput\">\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <label for=\"text\" class=\"userTybe\"> User type:- </label>\n");
      out.write("                <select name=\"userTybe\" id=\"userTybe\" >\n");
      out.write("                    <option>customer</option>\n");
      out.write("                    <option>manager</option>\n");
      out.write("                    <option>delivery</option>\n");
      out.write("                </select>\n");
      out.write("                <br><br>\n");
      out.write("                <label for=\"text\" class=\"Gender\">  Gender:- </label>\n");
      out.write("                <select  id=\"GenderInput\" name=\"Gender\" >\n");
      out.write("                    <option >Male</option>\n");
      out.write("                    <option >Female</option>\n");
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <input type=\"Submit\" id=\"button\" name=\"button\" value=\"Sign Up\">\n");
      out.write("                ");
      out.print( msg);
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
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
