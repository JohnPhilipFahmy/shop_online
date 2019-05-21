package org.apache.jsp.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import orm.User;
import bl.classses.ItemBL;
import orm.Item;
import java.util.List;

public final class DifAndChoosePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>choice items </title>\n");
      out.write("        <style>\n");
      out.write("            body{width: 1000px;\n");
      out.write("                 height: 1300px;\n");
      out.write("                 background: linear-gradient(to bottom,black,white ,black ); \n");
      out.write("                 float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            #mainNiv{width: 1100px;\n");
      out.write("                     height: 90px;\n");
      out.write("                     background: linear-gradient(to bottom,black,white ,black ); \n");
      out.write("                     margin-left: auto;\n");
      out.write("                     margin-right: auto;\n");
      out.write("\n");
      out.write("                     left: 90px;\n");
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
      out.write("                float: left;\n");
      out.write("                width: auto;\n");
      out.write("                height: 350px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                position: absolute;\n");
      out.write("                top:100px;\n");
      out.write("                left: 200px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #search{\n");
      out.write("                float: left;\n");
      out.write("                width: auto;\n");
      out.write("                height: 350px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                position: absolute;\n");
      out.write("                top:140px;\n");
      out.write("                left: 870px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            #showItem_table{\n");
      out.write("                float: left;\n");
      out.write("                width: auto;\n");
      out.write("                height: 350px;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                position: absolute;\n");
      out.write("                top:180px;\n");
      out.write("                left: 100px;\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("            #Quantity{border-radius: 70%;}\n");
      out.write("            table, th, td {\n");
      out.write("\n");
      out.write("                border: 1px solid black;\n");
      out.write("                border-spacing: 5px;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                padding: 15px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #f1f1c1;\n");
      out.write("            }\n");
      out.write("            #msg{\n");
      out.write("                background-color: black;\n");
      out.write("                width: 100px;;\n");
      out.write("\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("\n");
      out.write("                top:100px;\n");
      out.write("                left: 20px;\n");
      out.write("            }\n");
      out.write("            #go_to_cart{\n");
      out.write("\n");
      out.write("                width: 100px;;\n");
      out.write("\n");
      out.write("                margin-left: 700px;\n");
      out.write("                margin-right: auto;\n");
      out.write("                margin-top:  10px;\n");
      out.write("                margin-bottom:   10px;\n");
      out.write("                top:100px;\n");
      out.write("                left: 20px;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav id=\"mainNiv\">\n");
      out.write("            <ul id=\"navmenu\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <li class=\"ourPage\"><a href=\"../about.html\" target=\"_blank\">ABOUT</a></li>\n");
      out.write("\n");
      out.write("                <li class=\"ourPage\"><a href=\"../contact.html\" target=\"_blank\">CONTACT</a></li>\n");
      out.write("                <li class=\"ourPage\"><a href=\"../../my_orders\" target=\"_blank\">My Orders</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            ");

                HttpSession session1 = request.getSession();
               
                List<Item> items1 = (List<Item>) session1.getAttribute("item");
                session1.setAttribute("item", items1);

                String msg = "";
                String validate = request.getParameter("validate");
                if (validate != null && validate.equals("false")) {
                    msg = "Plz select items ";

                }
                ItemBL itemBL = new ItemBL();
                List<Item> items = itemBL.finaAll();
                HttpSession session2 = request.getSession();
                List<Item> items2 = (List<Item>) session2.getAttribute("items");

                User user = (User) session1.getAttribute("user");
                System.out.println("user id is is difPage" + user.getUserId());

                session1.setAttribute("user", user);
            
      out.write("\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div id=\"search\" >   <form action=\"/Shop/search_servlet\">\n");
      out.write("                <input type=\"hidden\" name=\"jspName\" value=\"dif\"  />\n");
      out.write("                <input type=\"text\" name=\"search\" value=\"search\" />\n");
      out.write("                <input type=\"submit\" value=\"search\" />\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div  id=\"showItem_table\">\n");
      out.write("            <div id=\"msg\">  <span style=\"color: red\" >");
      out.print( msg);
      out.write(" </span></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"go_to_cart\">\n");
      out.write("                <form action=\"../User/Cart.jsp\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" id=\"cart\" value=\"cart\" name=\"Quantity\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table >\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Type</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Offer</th>\n");
      out.write("                    <th>Price after offer</th>\n");
      out.write("                    <th>Offer start</th>\n");
      out.write("                    <th>Offer end</th>\n");
      out.write("                    <th>Quantity </th>\n");
      out.write("                    <th>add to cart</th>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    if (items2 != null) {
                        for (Item item : items2) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <form action=\"../../addToCartAction\">\n");
      out.write("                    <th>");
      out.print( item.getItemId());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getItemTybe());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getItemName());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getPrice());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.isOffer());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getPriceAfterOffer());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getOfferStart());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getOfferEnd());
      out.write("</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <th>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" id=\"Quantity\" value=\"-\" name=\"Quantity\" onclick=\"reduction()\"/>\n");
      out.write("                        <input type=\"text\" id='num");
      out.print( item.getItemId());
      out.write("' name=\"count\" value=\"1\" >\n");
      out.write("                        <input type=\"button\" id=\"Quantity\" value=\"+\" name=\"Quantity\" onclick=\"add('num");
      out.print( item.getItemId());
      out.write("')\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </th> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <th> \n");
      out.write("                        <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print( item.getItemId());
      out.write("\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"itemName\" value=\"");
      out.print( item.getItemName());
      out.write("\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"itemPrice\" value=\"");
      out.print( item.getPrice());
      out.write("\"/>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"add to cart\"  />\n");
      out.write("                    </th>\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                ");

                    }
                } else {

                    for (Item item : items) {

                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <form action=\"../../addToCartAction\">\n");
      out.write("                    <th>");
      out.print( item.getItemId());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getItemTybe());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getItemName());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getPrice());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.isOffer());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getPriceAfterOffer());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getOfferStart());
      out.write("</th>\n");
      out.write("                    <th>");
      out.print( item.getOfferEnd());
      out.write("</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <th>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" id=\"Quantity\" value=\"-\" name=\"Quantity\" onclick=\"reduction()\"/>\n");
      out.write("                        <input type=\"text\" id='num");
      out.print( item.getItemId());
      out.write("' name=\"count\" value=\"1\" >\n");
      out.write("                        <input type=\"button\" id=\"Quantity\" value=\"+\" name=\"Quantity\" onclick=\"add('num");
      out.print( item.getItemId());
      out.write("')\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </th> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    <th> \n");
      out.write("                        <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print( item.getItemId());
      out.write("\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"itemName\" value=\"");
      out.print( item.getItemName());
      out.write("\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"itemPrice\" value=\"");
      out.print( item.getPrice());
      out.write("\"/>\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" value=\"add to cart\"  />\n");
      out.write("                    </th>\n");
      out.write("                </form>\n");
      out.write("                </tr>\n");
      out.write("                ");

                        }
                    }


                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script >\n");
      out.write("            function add(mId) {\n");
      out.write("\n");
      out.write("                var x = document.getElementById(mId);\n");
      out.write("                x.value = (x.value) - (-1);\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            function reduction() {\n");
      out.write("                var x = document.getElementById(\"num\");\n");
      out.write("                if (x.value > 0) {\n");
      out.write("\n");
      out.write("                    x.value = (x.value) - 1;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
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
