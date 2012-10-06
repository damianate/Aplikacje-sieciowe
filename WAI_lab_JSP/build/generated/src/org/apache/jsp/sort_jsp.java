package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sort_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html;charset=windows-1250");
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
      out.write("      <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("      \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("      <html>\n");
      out.write("<head> \n");
      out.write("    </head>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        body{\n");
      out.write("            background-color:red;\n");
      out.write("        }\n");
      out.write("        #wrapper{\n");
      out.write("        width: 903px; /* content width + .right border */\n");
      out.write("        height: 200px;\n");
      out.write("\tmargin: 50px auto 0;\n");
      out.write("\topacity: 0.95;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html\">\n");
      out.write("          <body>\n");
      out.write("    \n");
      out.write("              <div id=\"wrapper\"  >\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("     \n");
      out.write("          </body>\n");
      out.write("      </html>");
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
