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
            String uid = "root"; //user is "root"
            String password = "password"; //password
            String driver = "com.mysql.jdbc.Driver";   //Driver is version 8.0.29      
            String connection = "jdbc:mysql://127.0.0.1/pa2"; //Load SQL Script
            
          try
    {
         response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name") ;
        PrintWriter out = response.getWriter();
      
 
 out.println("<!doctype html>\n" +
"<html lang=\"en\">");
      
      out.println("<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"author\" content=\"\">\n" +
"    <meta name=\"description\" content=\"E-Commerce Website\">\n" +
"    <meta name = \"viewport\" content = \"width=device-width, initial-scale = 1.0\">\n" +
"    <link rel=\"stylesheet\" href=\"//use.fontawesome.com/releases/v5.4.2/css/all.css\">\n" +
"    <link rel=\"stylesheet\" href=\"style.css\">\n" +
"    <link href = \"header.html\" rel = \"import\"/>\n" +
"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js\"></script>\n" +
"    <title>E-Commerce Website</title>\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.css\">\n" +
"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.js\"></script>\n" +
"\n" +
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
            int shoeID = rs.getInt("ID");
           String shoeName = rs.getString("Name");
           Double price = rs.getDouble("Price");
           String description = rs.getString("Description");
           String category = rs.getString("Category");
           String brand = rs.getString("Brand");
           String image = rs.getString("Image");
           int rating = rs.getInt("Rating");
           
         
          
           
           
           out.println("<!--template-->\n" +
"    <div class = \"column\">\n" +
"      <a href = \"\" id = "+category+ "  class=\"productCard\">\n" +
"          <img src= " + image + " alt=" + image + " style=\"width: 50%\">\n" +
"          <div class=\"productBoxContainer\">\n" +
"            <div class = \"productBoxText\"> \n" +
"              <div class = \"productBoxCategory\">" + category + "</div>\n" +
"              <h4><b>" + shoeName +"</b></h4> \n" +
"              <h5 style = \"color: rgb(128, 128, 128);\">" + brand + "</h5> \n" +
"              <h4 id = ><b>$" + price + "</b></h4>  \n" +
"            </div>\n" +
"            </div>\n" +
"        </a>\n" +
"\n" +
"        <div class=\"star-rating\" id = "+category+">                                                            <!--star rating-->\n" +
"          <div id="+shoeID+" data-rating="+rating+" data-rateyo-read-only=\"false\" class=\"rateYo\" name = "+shoeID+">                                         \n" +
"        </div>\n" +
"        </div>\n" +
"    \n" +
"      </div>\n" +
"    <!--template-->");
       

 
         }
       
                  
          out.println("</div>"); //row
         //SCRIPTS
   
       out.println("<script>");
       
      
       out.println("  $(function(){\n" +
" \n" +
"      $(\"#categorySelector\").change(function(){\n" +
"        var value = $(this).val(); //get value of selected dropdown item\n" +
"        if(value == \"none\")\n" +
"        { \n" +
"          $(\".productCard\").show();\n" +
"          $(\".star-rating\").show();\n" +
"        }\n" +
"        else{\n" +
"          $(\".productCard\").hide();\n" +
"          $(\".star-rating\").hide();\n" +
"          $('[id = ' + value + ']').show();  \n" +
"        }\n" +
"      })        \n" +
"    });\n" +
"\n" +
"$(function(){\n" +
" // star rating  \n" +
" $(\".rateYo\").each(function (e) {\n" +
"    \n" +
"    var ChngRatevaluesEn = {1:'bad',2:'poor',3:'ok',4:'good',5:'super'};\n" +
"    var ChngRatevaluesAr = {1:'bad-Ar',2:'poor-Ar',3:'ok-Ar',4:'good-Ar',5:'super-Ar'};\n" +
" \n" +
"    var rating = $(this).attr(\"data-rating\");\n" +
"    var id = $(this).attr(\"id\");\n" +
"    $(this).rateYo({\n" +
"        onSet: function (rating) {\n" +
"\n" +
"\n" +
"            console.log(rating);\n" +
"            console.log(id);\n" +
"          },\n" +
"        rating: rating,\n" +
"        starWidth: \"20px\",\n" +
"        numStars: 5,\n" +
"        fullStar: true,\n" +
"        normalFill: \"#A0A0A0\",\n" +
"        spacing: \"5px\",\n" +
"        precision: 2,\n" +
"        // rtl: true,\n" +
"        // readOnly: true,\n" +
"    });\n" +
"  });\n" +
"});");
       
       
       out.println("</script>");
         
         
         
 
 
         
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
