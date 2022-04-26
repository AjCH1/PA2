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
public class productServlet extends HttpServlet {

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
            out.println("<title>Servlet productServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet productServlet at " + request.getContextPath() + "</h1>");
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
      
      out.println(" <div id=\"nav-placeholder\">\n" +
"      <header>\n" +
"        <ul>\n" +
"          <a href=\"productServlet\"><h1>E-Commerce</h1></a>\n" +
"          <li><a href=\"AboutServlet\">About</a></li>\n" +
"          <li><a href=\"productServlet\">Products</a></li>\n" +
"        </ul>\n" +
"      </header>\n" +
"    </div>\n" +
"\n" +
"    <div id = \"names\">\n" +
"      Group 12:&#160Ashley J. Chen,&#160 Yuxi Ge,&#160 Yilin Li \n" +
"    </div>\n" +
"\n" +
"    <div id = \"categoryHeader\">\n" +
"      <h3>Choose Category</h3>\n" +
"      \n" +
"      <select id = \"categorySelector\" name = \"category\">\n" +
"        <option value=\"none\" class = \"category\">None</option>\n" +
"        <option value=\"Black\" class = \"category\">Black</option>\n" +
"        <option value=\"White\" class = \"category\">White</option>\n" +
"        <option value=\"Red\" class = \"category\">Red</option>\n" +
"        <option value=\"Other\" class = \"category\">Other</option>\n" +
"      </select>\n" +
"             \n" +
"    </div>");
      out.println("  <div class = \"row\">");
      
      
      out.println("  <div class = \"column\">\n" +
"    <a href = \"Shoes/Nike Air Max 270.html\" id = \"Black\" class=\"productCard\">\n" +
"        <img src=\"images/shoe2.webp\" alt=\"Nike Air Max 270.html\" style=\"width: 50%\">\n" +
"        <div class=\"productBoxContainer\">\n" +
"          <div class = \"productBoxText\"> \n" +
"            <div class = \"productBoxCategory\">Black</div>\n" +
"            <h4><b>Air Jordans 5</b></h4> \n" +
"            <h5 style = \"color: rgb(128, 128, 128);\">Nike</h5> \n" +
"            <h4><b>$160.00</b></h4>  \n" +
"        </div>\n" +
"\n" +
"        <div id = \"rating\">\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star\"></span>\n" +
"\n" +
"          <div id = \"rating-review\">13299 reviews</div>\n" +
" \n" +
"        </div>\n" +
"      </div>\n" +
"    </a>\n" +
"    </div>\n" +
"\n" +
"\n" +
"  <div class = \"column\">\n" +
"    <a href = \"Shoes/Air Force 1.html\" id = \"White\" class=\"productCard\">\n" +
"        <img src=\"images/Air Force 1.webp\" alt=\"Air Force 1\" style=\"width:50%\">\n" +
"        <div class=\"productBoxContainer\">\n" +
"          <div class = \"productBoxText\"> \n" +
"            <div class = \"productBoxCategory\">White</div>\n" +
"            <h4><b>Air Force 1</b></h4> \n" +
"            <h5 style = \"color: rgb(128, 128, 128);\">Nike</h5> \n" +
"            <h4><b>$100.00</b></h4>  \n" +
"        </div>\n" +
"\n" +
"        <div id = \"rating\">\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"          <span class=\"fa fa-star checked\"></span>\n" +
"\n" +
"          <div id = \"rating-review\">73462 reviews</div>\n" +
" \n" +
"        </div>\n" +
"      </div>\n" +
"    </a>\n" +
"    </div>\n" +
"\n" +
"    <div class = \"column\">\n" +
"      <a href = \"Shoes/Nike Air Vapormax 2021.html\" id = \"Other\" class=\"productCard\">\n" +
"          <img src=\"images/shoe3.webp\" alt=\"Nike Air Vapormax 2021\" style=\"width: 50%\">\n" +
"          <div class=\"productBoxContainer\">\n" +
"            <div class = \"productBoxText\"> \n" +
"              <div class = \"productBoxCategory\">Other</div>\n" +
"              <h4><b>Nike Air Vapormax 2021</b></h4> \n" +
"              <h5 style = \"color: rgb(128, 128, 128);\">Nike</h5> \n" +
"              <h4><b>$210.00</b></h4>  \n" +
"          </div>\n" +
"  \n" +
"          <div id = \"rating\">\n" +
"            <span class=\"fa fa-star checked\"></span>\n" +
"            <span class=\"fa fa-star checked\"></span>\n" +
"            <span class=\"fa fa-star checked\"></span>\n" +
"            <span class=\"fa fa-star checked\"></span>\n" +
"            <span class=\"fa fa-star\"></span>\n" +
"  \n" +
"            <div id = \"rating-review\">26171 reviews</div>\n" +
"   \n" +
"          </div>\n" +
"        </div>\n" +
"      </a>\n" +
"      </div>");
      
      out.println("</div>");
      
      
      out.println("<script>    $(function(){\n" +
" \n" +
"    \n" +
"      $(\"#categorySelector\").change(function(){\n" +
"        var value = $(this).val(); //get value of selected dropdown item\n" +
"\n" +
"        if(value == \"none\")\n" +
"        { \n" +
"          $(\".productCard\").show();\n" +
"        }\n" +
"        else{\n" +
"          $(\".productCard\").hide();\n" +
"          $('[id = ' + value + ']').show();  \n" +
"        }\n" +
"      })\n" +
"      \n" +
"    });"
              + "</script>");
      
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
