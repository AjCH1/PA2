/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package product;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ajjst
 */
public class AboutServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AboutServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AboutServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        
        
        try
    {
        response.setContentType("text/html");
        String name = request.getParameter("name") ;
        PrintWriter out = response.getWriter();

      
      
      out.println("<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"author\" content=\"\">\n" +
"    <meta name=\"description\" content=\"E-Commerce Website\">\n" +
"    <meta name = \"viewport\" content = \"width=device-width, initial-scale = 1.0\">\n" +
"    <link rel=\"stylesheet\" href=\"//use.fontawesome.com/releases/v5.4.2/css/all.css\">\n" +
"    <link rel=\"stylesheet\" href=\"style.css\">\n" +
"    <link href = \"header.html\" rel = \"import\"/>\n" +
"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n" +
"    <title>E-Commerce Website</title>\n" +
"</head>");
      
      out.println("<body>\n" +
"  \n" +
"  <div id=\"nav-placeholder\">\n" +
"    <header>\n" +
"      <ul>\n" +
"        <a href=\"productServlet\"><h1>E-Commerce</h1></a>\n" +
"        <li><a href=\"AboutServlet\">About</a></li>\n" +
"        <li><a href=\"productServlet\">Products</a></li>\n" +
"      </ul>\n" +
"    </header>\n" +
"  </div>\n" +
"       \n" +
"      <div id=\"about\">     \n" +
"        <div id = \"aboutIntro\">\n" +
"          \n" +
"          <h3>About E-Commerce</h3>\n" +
"          <p style = \"margin-top: 10px; margin-bottom: 20px\">E-Commerce sells shoe products from all over the world. As a company, we are dedicated\n" +
"            to providing affordable quality shoes.\n" +
"          </p>\n" +
"        \n" +
"          <img src = \"images/commerce.jpg\" width = \"100%\" height = \"auto\" class=\"center\" alt=\"Freepik image\">\n" +
"          <a href='https://www.freepik.com/vectors/shopping-website'>Shopping website vector created by pch.vector - www.freepik.com</a>\n" +
"        </div>\n" +
"      \n" +
"\n" +
"        <div id = productList> \n" +
"        \n" +
"        <div id = \"categoryList\">\n" +
"        <h2 style = \"margin-bottom: 1%\">Our Shoe Products</h2>\n" +
"\n" +
"          <div class = \"column\">\n" +
"            <a href = \"Shoes/Air Force 1.html\" id = \"White\" class=\"productCard\">\n" +
"                <img src=\"images/Air Force 1.webp\" alt=\"Air Force 1\" style=\"width:50%\">\n" +
"                <div class=\"productBoxContainer\">\n" +
"                  <div class = \"productBoxText\"> \n" +
"                    <div class = \"productBoxCategory\">White</div>\n" +
"                    <h4><b>Air Force 1</b></h4> \n" +
"                    <h5 style = \"color: rgb(128, 128, 128);\">Nike</h5> \n" +
"                    <h4><b>$100.00</b></h4>  \n" +
"                </div>\n" +
"        \n" +
"                <div id = \"rating\">\n" +
"                  <span class=\"fa fa-star checked\"></span>\n" +
"                  <span class=\"fa fa-star checked\"></span>\n" +
"                  <span class=\"fa fa-star checked\"></span>\n" +
"                  <span class=\"fa fa-star checked\"></span>\n" +
"                  <span class=\"fa fa-star checked\"></span>\n" +
"        \n" +
"                  <div id = \"rating-review\">73462 reviews</div>\n" +
"         \n" +
"                </div>\n" +
"              </div>\n" +
"            </a>\n" +
"            </div>\n" +
"            \n" +
"            <div class = \"column\">\n" +
"              <a href = \"Shoes/LeBron 19.html\" id = \"Other\" class=\"productCard\">\n" +
"                  <img src=\"images/shoe4.webp\" alt=\"LeBron 19\" style=\"width: 50%\">\n" +
"                  <div class=\"productBoxContainer\">\n" +
"                    <div class = \"productBoxText\"> \n" +
"                      <div class = \"productBoxCategory\">Other</div>\n" +
"                      <h4><b>LeBron 19</b></h4> \n" +
"                      <h5 style = \"color: rgb(128, 128, 128);\">Nike</h5> \n" +
"                      <h4><b>$210.00</b></h4>  \n" +
"                  </div>\n" +
"            \n" +
"                  <div id = \"rating\">\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star\"></span>\n" +
"            \n" +
"                    <div id = \"rating-review\">63167 reviews</div>\n" +
"             \n" +
"                  </div>\n" +
"                </div>\n" +
"              </a>\n" +
"            </div>\n" +
"\n" +
"            <div class = \"column\">\n" +
"              <a href = \"Shoes/Zoom Freak 3.html\" id = \"Black\" class=\"productCard\">\n" +
"                  <img src=\"images/Zoom Freak 3.jpg\" alt=\"Zoom Freak 3\" style=\"width: 50%\">\n" +
"                  <div class=\"productBoxContainer\">\n" +
"                    <div class = \"productBoxText\"> \n" +
"                      <div class = \"productBoxCategory\">Black</div>\n" +
"                      <h4><b>Zoom Freak 3</b></h4> \n" +
"                      <h5 style = \"color: rgb(128, 128, 128);\">Nike</h5> \n" +
"                      <h4><b>$210.00</b></h4>  \n" +
"                  </div>\n" +
"            \n" +
"                  <div id = \"rating\">\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star checked\"></span>\n" +
"                    <span class=\"fa fa-star\"></span>\n" +
"            \n" +
"                    <div id = \"rating-review\">18900 reviews</div>\n" +
"             \n" +
"                  </div>\n" +
"                </div>\n" +
"              </a>\n" +
"            </div>\n" +
"      \n" +
"        <div id = \"management\">\n" +
"            <h1 style = \"margin-bottom: 1%;\">Management Team</h1>\n" +
"            <p style = \"font-size: x-large;\">Our management team includes experienced hard-working people.</p>\n" +
"            <div id=\"managementTeam\">\n" +
"          \n" +
"                 \n" +
"            <div class=\"managementCard\">\n" +
"              <img src=\"images/blankprofile.webp\" alt=\"avatar\" style=\"width:100%\">\n" +
"              <div class=\"container\">\n" +
"                <h4><b>Name</b></h4> \n" +
"                <p>Role</p> \n" +
"              </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"managementCard\">\n" +
"              <img src=\"images/blankprofile.webp\" alt=\"avatar\" style=\"width:100%\">\n" +
"              <div class=\"container\">\n" +
"                <h4><b>Name</b></h4> \n" +
"                <p>Role</p> \n" +
"              </div>\n" +
"            </div>\n" +
"\n" +
"            <div class=\"managementCard\">\n" +
"              <img src=\"images/blankprofile.webp\" alt=\"avatar\" style=\"width:100%\">\n" +
"              <div class=\"container\">\n" +
"                <h4><b>Name</b></h4> \n" +
"                <p>Role</p> \n" +
"              </div>\n" +
"            </div>\n" +
"               \n" +
"          </div>\n" +
"        </div>\n" +
"\n" +
"    \n" +
"\n" +
"</body>");
            out.flush();
    }
    catch(Exception ex)
    {
        ex.printStackTrace();    
    }
          
    }

    /**
     * Handles the HTTP <code>POST</code> method.
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

}
