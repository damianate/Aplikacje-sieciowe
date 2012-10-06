<%@page contentType="text/html" pageEncoding="windows-1250"%>
      <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
      "http://www.w3.org/TR/html4/loose.dtd">
      <table bgcolor="#aaaaaa">
<tr> <td>
                  <h1>JSP, sortowanie wersja
                      <% if (request.getParameter("version") != null) {
                  out.println(request.getParameter("version"));
              } else {
                  out.println(" ?");
              }
%> </h1>
</td> </tr>
</table>