/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package product;

import java.io.IOException;
import java.io.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.OutputStream;
import javax.servlet.ServletOutputStream;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;


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
        

    
            //SPECIFY FOLLOWING TO CONNECT TO MYSQL
            String uid = "root";
            String password = "password";
            String driver = "com.mysql.jdbc.Driver";         
            String connection = "jdbc:mysql://127.0.0.1/pa2";
            
          try
    {
         response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name") ;
        PrintWriter out = response.getWriter();
        
          // RequestDispatcher rd=request.getRequestDispatcher("productListServlet");  
       //rd.forward(request, response);  
    

      out.println("<!doctype html>\n" +
"<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"author\" content=\"\">\n" +
"    <meta name=\"description\" content=\"E-Commerce Website\">\n" +
"    <meta name = \"viewport\" content = \"width=device-width, initial-scale = 1.0\">\n" +
"    <link rel=\"stylesheet\" href=\"//use.fontawesome.com/releases/v5.4.2/css/all.css\">\n" +
"    <link rel=\"stylesheet\" href=\"style.css\">\n" +
"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n" +
"    <title>E-Commerce Website</title>\n" +
"</head>");
 
   
      out.println("<div id=\"nav-placeholder\">\n" +
"      <header>\n" +
"        <ul>\n" +
"          <a href=\"index.html\"><h1>E-Commerce</h1></a>\n" +
"          <li><a href=\"about.html\">About</a></li>\n" +
"          <li><a href=\"index.html\">Products</a></li>\n" +
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

         out.println("<div class = \"row\">");

                   try {

            Class.forName(driver);
            Connection con = DriverManager.getConnection
                        (connection, uid, password);
    
              // Execute SQL query
         Statement stmt = con.createStatement();
         String sql;
         sql = "SELECT * FROM Shoe";
         ResultSet rs = stmt.executeQuery(sql);
         
         while(rs.next()){
            //Retrieve by column name
           String shoeName = rs.getString("Name");
           Double price = rs.getDouble("Price");
           String description = rs.getString("Description");
           String category = rs.getString("Category");
           String brand = rs.getString("Brand");
           String image = rs.getString("Image");
           int rating = rs.getInt("Rating");
           
        
           /*
           out.println("<div class = \"column\">"); //column
          
             out.println("    <a href =\"\" id = "+category+" class=\"productCard\">\n" +
"        <img src=  " + image + " alt=" + image + "style=\"width: 50%\">\n" +
"        <div class=\"productBoxContainer\">\n" +
"          <div class = \"productBoxText\"> \n" +
"            <div class = \"productBoxCategory\">" + category + "</div>\n" +
"            <h4><b>" + shoeName +"</b></h4> \n" +
"            <h5 style = \"color: rgb(128, 128, 128);\">" + brand + "</h5> \n" +
"            <h4><b>$" + price + "0</b></h4>  \n" );
          
             
             out.println("</a>"); //a href
             out.println("</div>"); //column
          */
          

           
           out.println(" <!--template-->\n" +
"    <div class = \"column\">\n" +
"    <a href = \"Shoes/Nike Air Max 270.html\" id = \"Black\" class=\"productCard\">\n" +
"        <img src=\"images/shoe2.webp\" alt=\"Nike Air Max 270.html\" style=\"width: 50%\">\n" +
"        <div class=\"productBoxContainer\">\n" +
"          <div class = \"productBoxText\"> \n" +
"            <div class = \"productBoxCategory\">Black</div>\n" +
"            <h4><b>Air Jordans 5</b></h4> \n" +
"            <h5 style = \"color: rgb(128, 128, 128);\">Nike</h5> \n" +
"            <h4><b>$160.00</b></h4>  \n" +
"        </div>\n" +

                   " <!-- Rating Stars Box -->\n" +
"      <div class=\"rate\">\n" +
"        <input type=\"radio\" id=\"star5\" class=\"star\" name=\"rate\" value=\"5\" />\n" +
"        <label for=\"star5\">5 stars</label>\n" +
"        <input type=\"radio\" id=\"star4\" class=\"star\" name=\"rate\" value=\"4\" />\n" +
"        <label for=\"star4\">4 stars</label>\n" +
"        <input type=\"radio\" id=\"star3\" class=\"star\" name=\"rate\" value=\"3\" />\n" +
"        <label for=\"star3\">3 stars</label>\n" +
"        <input type=\"radio\" id=\"star2\" class=\"star\" name=\"rate\" value=\"2\" />\n" +
"        <label for=\"star2\">2 stars</label>\n" +
"        <input type=\"radio\" id=\"star1\" class=\"star\" name=\"rate\" value=\"1\" />\n" +
"        <label for=\"star1\">1 star</label>\n" +
"      </div>  " +
                   
                   
"      </div>\n" +
"    </a>\n" +
"    </div>\n" +
"  <!--template-->");
           
    
           
 
         }
                  
          out.println("</div>");
         //SCRIPTS
   
            out.println("  <script>\n" +
"    $(function(){\n" +
" \n" +
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
"\n" +
"      //get star value\n" +
"      $('input[name=\"rate').click(function(e){\n" +
"        var starValue = $('input[name=\"rate\"]:checked').val();\n" +
"        console.log(starValue);\n" +
"        var itemName =  $('input[name=\"rate\"]:checked').attr('id');\n" +
"        console.log(itemName);\n" +
"      });        \n" +
"    });\n" +
"\n" +
"    </script>");
            
 
         
       } catch  (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
     
      
 
      
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
