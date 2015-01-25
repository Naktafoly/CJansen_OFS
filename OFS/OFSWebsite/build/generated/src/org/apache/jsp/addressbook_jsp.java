package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addressbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>OFSAddressbook</title>\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css\"/>\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css\"/>\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/main.css\"/>                       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"title\">Adresboek</h1>\n");
      out.write("                        \n");
      out.write("        <div class=\"addresbook\">\n");
      out.write("            <form action=\"AddressbookController\" role=\"form\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"Naam\" class=\"col-sm-2 control-label\">Naam: </label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"text\" name=\"naam\" class=\"form-control\" id=\"Naam\" placeholder=\"naam\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                </div>                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"Adres\" class=\"col-sm-2 control-label\">Adres: </label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"text\" name=\"adres\" class=\"form-control\" id=\"Adres\" placeholder=\"adres\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"Telefoon\" class=\"col-sm-2 control-label\">Telefoon: </label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"text\" name=\"telefoon\" class=\"form-control\" id=\"Telefoon\" placeholder=\"telefoon\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                </div>    \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label for=\"E-Mail\" class=\"col-sm-2 control-label\">E-Mail: </label>\n");
      out.write("                    <div class=\"col-sm-5\">\n");
      out.write("                        <input type=\"text\" name=\"e-mail\" class=\"form-control\" id=\"E-Mail\" placeholder=\"e-mail\">\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                </div>    \n");
      out.write("            </form>            \n");
      out.write("            <div>\n");
      out.write("                <form class=\"form-group\">                \n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Opslaan</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Update</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Verwijderen</button>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\"><<</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Zoeken</button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">>></button>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-default\">Velden Leegmaken</button>                    \n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <form class=\"form-group\">                \n");
      out.write("                    <a onclick=\"href='/OFSWebsite/index.html'\" class=\"btn btn-default\">Hoofdmenu</a>                \n");
      out.write("                </form>\n");
      out.write("            </div>              \n");
      out.write("        </div>\n");
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
