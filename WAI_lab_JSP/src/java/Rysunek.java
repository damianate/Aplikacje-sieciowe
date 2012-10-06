/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author szu
 */ 
public class Rysunek extends HttpServlet  implements KeyListener {
int x=10;
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,
                     HttpServletResponse response)
                     throws ServletException, IOException {
        
/* Przeglądarki nie wysyłają informacji w jakim kodowaniu przesyłają dane
z formularzy, więc najczęściej trzeba wymusić kodowanie */
    request.setCharacterEncoding("UTF-8");
    /* Tworzymy pole do rysowania. Wielkość 500x500 pikseli. 24 bity
    kolorów z przezroczystością. */
    BufferedImage graph = new BufferedImage(500, 500,
                                             BufferedImage.TYPE_INT_ARGB);
    /* Pobieramy obiekt służący do rysowania. */
    Graphics2D g2d = (Graphics2D) graph.getGraphics();
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                           RenderingHints.VALUE_ANTIALIAS_ON);
    /* Ustawienie koloru */
    g2d.setColor(Color.ORANGE);
    /* Rysujemy wypełniony kwadrat. */
    g2d.fillRect(x, 10, 25, 25);
    g2d.setColor(new Color(124, 12, 167));
    /* Przykład rysowania linii */
    g2d.drawLine(30, 35, 40, 50);
    /*Ustawiamy czcionkę na szeryfową, pochyloną o wielkości 12 punktów*/
    Font czcionka = new Font("Serif", Font.ITALIC, 12);
    g2d.setFont(czcionka);
    /* Rysujemy napis w prosty sposób, pobierając go jako parametr (np. z
    formularza) */
    g2d.drawString(x+"", 100, 100);
    /* Tworzymy obiekt tekstowy o większych możliwościach:
       - pierwszy argument to napis;
       - drugi to czcionka;
       - trzeci to tzw. Kontekst:
          - przekształcenie użyte do rysowania: tu brak przekształcenia;
          - czy czcionka ma być wykładzona;
          - czy używać liczb zmiennoprzecinkowych do obliczeń. */
TextLayout tekst = new TextLayout("Inny napis " + new Date(), czcionka,
                                 new FontRenderContext(null, true, false));
    /* Rysujemy tak utworzony obiekt */
    tekst.draw(g2d, 250, 250);
    /* Tak utworzony obiekt tekstowy ma zaletę: możemy odczytać jego
    wielkość, położenie linii bazowej itp., co może pomóc w rysowaniu */
    //tekst.getBounds();
    //tekst.getBaseline();
    /* Możliwe jest też rysowanie innych rysunków, jeśli potrzeba to z
       użyciem przekształcenia (obrót, przesunięcie, skalowanie itd.) */
    //g2d.drawRenderedImage(innyRysunek,
          //                 AffineTransform.getTranslateInstance(0, 32));
    OutputStream out;
    response.setContentType("image/png");
    try {
        String type=request.getParameter("type");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        ImageIO.write(graph, "PNG", buffer);
        response.setContentLength(buffer.size());
        out = response.getOutputStream();
        out.write(buffer.toByteArray());
    } catch (Exception ex) {
        throw new ServletException(ex);
    }
    out.close();
}

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
      if ( c != KeyEvent.CHAR_UNDEFINED ) {
         x = x + 1;
         e.consume();
      }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
