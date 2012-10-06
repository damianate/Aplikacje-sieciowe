<%@page contentType="text/html" pageEncoding="windows-1250"%>
     <%@page import="java.util.Random"%>
     <%@page import = "java.util.*" session="true"%>
     <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
     <html>
         <head>
             <meta http-equiv="Content-Type" content="text/html; charset=windows-
                                                                             1250">
             <title>JSP Page</title>
         </head>
         <body>
             <jsp:include page="header.jsp?version=1"/>
             <BR>
             <form method="POST">
                 <input type="text" name="c_numbers" value="10" />
                 <input type="submit" value="Sortuj" />
             </form><BR>
             <%! int temp, i;%>
             <%! boolean change;%>
             <%! int data[];%>
             <%! int size;%>
             <%
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
             %> Posortowane liczby:
             <%
             for (int i = 0; i < size; i++) {
             %> <%= data[i]%> <%
             }
             %>
             
             <%
           Integer sessCounter =
                   (Integer) session.getAttribute("sessCounter");
           if (sessCounter == null) {
               sessCounter = new Integer(1);
            
} else {
               sessCounter = new Integer(sessCounter.intValue() + 1);
           }
           session.setAttribute("sessCounter", sessCounter);
   %>
   ID sesji: <%=session.getId()%>
   <BR>
   Ta sesja zaczê³a siê: <%=new Date(session.getCreationTime())%>
   <BR>
   Odwiedzi³eœ od tego czasu tê stronê: ${sessCounter} raz(y)
   <BR><BR>
   Teraz wpisa³eœ: ${param.c_numbers}
   <BR>
   Ostatnio wpisa³eœ: ${sessionScope.userText}
   <BR>
   <% session.setAttribute("userText", request.getParameter("c_numbers") );
 %>
            
         </body>
     </html>