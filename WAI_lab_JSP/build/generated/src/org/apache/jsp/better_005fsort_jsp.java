package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import java.util.*;

public final class better_005fsort_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 int temp, i;
 boolean change;
 int data[];
 int size;
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
      out.write("     \n");
      out.write("     \n");
      out.write("     <!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("     \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("     <html>\n");
      out.write("         <head>\n");
      out.write("             <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-\n");
      out.write("                                                                             1250\">\n");
      out.write("             <title>JSP Page</title>\n");
      out.write("         </head>\n");
      out.write("         <body>\n");
      out.write("             ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp?version=1", out, false);
      out.write("\n");
      out.write("             <BR>\n");
      out.write("             <form method=\"POST\">\n");
      out.write("                 <input type=\"text\" name=\"c_numbers\" value=\"10\" />\n");
      out.write("                 <input type=\"submit\" value=\"Sortuj\" />\n");
      out.write("             </form><BR>\n");
      out.write("             ");
      out.write("\n");
      out.write("             ");
      out.write("\n");
      out.write("             ");
      out.write("\n");
      out.write("             ");
      out.write("\n");
      out.write("             ");

             if (request.getParameter("c_numbers") != null) {
                size = Integer.parseInt(request.getParameter("c_numbers"));
} else {
                 size = 10;
             }
             data = new int[size];
             Random generator = new Random();
             for (int i = 0; i < size; i++) {
                 data[i] = generator.nextInt(100);
             }
; do {
                 change = false;
                 i = size - 1;
                 do {
                     i--;
                     if (data[i + 1] < data[i]) {
                         temp = data[i];
                         data[i] = data[i + 1];
                         data[i + 1] = temp;
                         change = true;
                     }
                 } while (i != 0);
             } while (change);
             
      out.write(" Posortowane liczby:\n");
      out.write("             ");

             for (int i = 0; i < size; i++) {
             
      out.write(' ');
      out.print( data[i]);
      out.write(' ');

             }
             
      out.write("\n");
      out.write("             \n");
      out.write("             ");

           Integer sessCounter =
                   (Integer) session.getAttribute("sessCounter");
           if (sessCounter == null) {
               sessCounter = new Integer(1);
            
} else {
               sessCounter = new Integer(sessCounter.intValue() + 1);
           }
           session.setAttribute("sessCounter", sessCounter);
   
      out.write("\n");
      out.write("   ID sesji: ");
      out.print(session.getId());
      out.write("\n");
      out.write("   <BR>\n");
      out.write("   Ta sesja zaczęła się: ");
      out.print(new Date(session.getCreationTime()));
      out.write("\n");
      out.write("   <BR>\n");
      out.write("   Odwiedziłeś od tego czasu tę stronę: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessCounter}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" raz(y)\n");
      out.write("   <BR><BR>\n");
      out.write("   Teraz wpisałeś: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.c_numbers}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("   <BR>\n");
      out.write("   Ostatnio wpisałeś: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.userText}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("   <BR>\n");
      out.write("   ");
 session.setAttribute("userText", request.getParameter("c_numbers") );
 
      out.write("\n");
      out.write("             ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Rysunek" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("...", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("...", request.getCharacterEncoding()), out, false);
      out.write("\n");
      out.write("         </body>\n");
      out.write("     </html>");
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
