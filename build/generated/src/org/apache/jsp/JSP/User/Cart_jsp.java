package org.apache.jsp.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import orm.User;
import java.util.List;
import orm.Item;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body{width: 1000px;\n");
      out.write("                 height: 1300px;\n");
      out.write("                 background: linear-gradient(to bottom,black,white ,black ); \n");
      out.write("            }\n");
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
      out.write("            #showItem_table{\n");
      out.write("                width: auto;\n");
      out.write("                height: 350px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                position: absolute;\n");
      out.write("                top:150px;\n");
      out.write("                left: 360px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #Quantity{border-radius: 70%;}\n");
      out.write("            table, th, td {\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-spacing: 5px;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                padding: 15px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #f1f1c1;\n");
      out.write("            }\n");
      out.write("            #totalText{ width: auto;\n");
      out.write("\n");
      out.write("                        margin-left: auto;\n");
      out.write("                        margin-right: auto;\n");
      out.write("                        position: absolute;\n");
      out.write("                        top:350px;\n");
      out.write("                        left: 800px;}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script type=\"text/javascript\" src=\"../../JS/cart-js.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

           
            HttpSession session1 = request.getSession();
          
            List<Item> items1 = (List<Item>) session1.getAttribute("item1");
           session1.setAttribute("item", items1);
        
        
   User user = (User) session1.getAttribute("user");
                System.out.println("user id is is cart" + user.getUserId());

                session1.setAttribute("user", user);
                int userId =user.getUserId();
        
      out.write("\n");
      out.write("\n");
      out.write("        <nav id=\"mainNiv\">\n");
      out.write("            <ul id=\"navmenu\">\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <li class=\"ourPage\"><a href=\"../about.html\" target=\"_blank\">ABOUT</a></li>\n");
      out.write("                <a href=\"itemShow_Page.jsp\"></a>\n");
      out.write("\n");
      out.write("                <li class=\"ourPage\"><a href=\"../contact.html\" target=\"_blank\">CONTACT</a></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div  id=\"showItem_table\">\n");
      out.write("\n");
      out.write("            <table >\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <th>Id</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("\n");
      out.write("                    <th>Price</th>\n");
      out.write("\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Total Price</th>\n");
      out.write("                    <th>Remove from cart</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    for (Item item : items1) {
                     if (item.getItemId()!=0){
                     System.out.println("john");
                     
                     

                
      out.write("\n");
      out.write("                ");
  
                    int price = Integer.parseInt(item.getPrice());
                    int quantity = Integer.parseInt(item.getQuantity());
                    int Total = price * quantity;

                
      out.write("\n");
      out.write("           \n");
      out.write("                <tr>\n");
      out.write("                         \n");
      out.write("                    <th>");
      out.print( item.getItemId());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getItemName());
      out.write("</th>  \n");
      out.write("                    <th>");
      out.print( item.getPrice());
      out.write("</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <th>");
      out.print( item.getQuantity());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print(Total);
      out.write("</th>\n");
      out.write("                    <form action=\"../../CartInfoCheak\">\n");
      out.write("                    <th>\n");
      out.write("                    <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print( item.getItemId());
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"userId\" value=\"");
      out.print( userId);
      out.write("\"/>\n");
      out.write("                    <input type=\"submit\" id=\"addToCart\" value=\"Remove from cart\" name=\"removeFromCart\" />\n");
      out.write("                    </th>\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                ");


                    }}
session1.setAttribute("item",items1);
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table> \n");
      out.write("\n");
      out.write("\n");
      out.write("                <form action=\"../../order\">\n");
      out.write("                    deliver order at  : <input type=\"date\" name=\"bday\"   >\n");
      out.write("                    <input type=\"time\" name=\"bTime\"   >\n");
      out.write("<input type=\"submit\" id=\"orders\" value=\"confirm order\"  />\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
