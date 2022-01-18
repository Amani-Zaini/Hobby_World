import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
@WebServlet("/forDb")
public class forDb extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
	
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    String url="jdbc:mysql://localhost:3306/contact_informaion";
    String name="root";
    String pass="3910191";
    
    try {
       
       Class.forName("com.mysql.jdbc.Driver");

       Connection conn = DriverManager.getConnection(url, name,pass );
       Statement stmt = conn.createStatement();
       ResultSet resultSet = stmt.executeQuery("SELECT * FROM Coaches order by City");
       
       out.print("<!DOCTYPE html>\r\n" + 
       		"<html>\r\n" + 
       		"<head>\r\n"
       		+ "<title>Coaches</title>" + 
       		"<style>\r\n"
       		+"body{\r\n" + 
     		"background-color:  #FFF0F5; \r\n" + 
     		"font-family: Arial, Helvetica, sans-serif;\r\n" + 
     		"}"+ 
       		"table {\r\n" + 
       		"  font-family: arial, sans-serif;\r\n" + 
       		"  border-collapse: collapse;\r\n" + 
       		"  width: 50%;\r\n"
       		+ "float:center;"
       		+ "align:center;"
       		+ "margin-top:10%;"
       		+  
       		"}\r\n" + 
       		"\r\n" + 
       		"td, th {\r\n" + 
       		"  border: 1px solid black;\r\n" + 
       		"  text-align: center;\r\n" + 
       		"  padding: 5px;\r\n" + 
       		"}\r\n" + 
       		"\r\n" + 
       		"tr:nth-child(even) {\r\n" + 
       		"  background-color: #FFB6C1;\r\n" + 
       		"}\r\n"
       		+ "th{background-color:#DB7093;color:white;}" + 
       		"</style>\r\n" + 
       		"</head>\r\n" + 
       		"<body >");
       
        out.print("<center>"
        		+ "<table  height=400px>\r\n" + 
        		"  <tr >\r\n" + 
        		"    <th>Name</th>\r\n" + 
        		"    <th>Specialty</th>\r\n" + 
        		"    <th>Email</th>\r\n"
        		+ "<th>Phone</th>"
        		+ "<th>City</th>" + 
        		"  </tr>");
       while(resultSet.next()){
    	   
    	   out.print("<tr>");
		      out.printf("  <td>%s", resultSet.getString("Coach_name"));out.println("</td>");
		      out.printf("  <td>%s", resultSet.getString("Specialty"));out.println("</td>");
		      out.printf("  <td>%s", resultSet.getString("Email"));out.println("</td>");
		      out.printf("  <td>%d", resultSet.getInt("Phone"));out.println("</td>");
		      out.printf("  <td>%s", resultSet.getString("City"));out.println("</td>");
		      out.println("</tr>");
		    }
		  
       
      out.print("</table>\r\n"
      		+ "</center>" + 
      		"\r\n" + 
      		"</body>\r\n" + 
      		"</html>");
        		
        	
      
       stmt.close();
       conn.close();
    } catch(Exception e) {
     
       e.printStackTrace();
    } 
   
    
 }
	}



