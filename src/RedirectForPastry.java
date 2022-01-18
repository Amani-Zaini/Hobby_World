import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RedirectForPastry")
public class RedirectForPastry extends HttpServlet 
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	out.println("<!DOCTYPE html>\r\n" + 
    			"<html>\r\n" + 
    			"\r\n" + 
    			"<head>\r\n"
    			+ "<title> Pastry course</title>" + 
    			"	<meta charset=\"ISO-8859-1\">\r\n" + 
    			"	 <style>\r\n" + 
    			"	 								/*Pastry Courses*/\r\n" + 
    			"					.ForAll{\r\n" + 
    			"					background: url(https://static1.s123-cdn-static-a.com/ready_uploads/media/2812898/2000_5e0fa9711c1d1.jpg);\r\n" + 
    			"					background-color: #cccccc;\r\n" + 
    			"					  height: 50vh;\r\n" + 
    			"					  background-position: center;\r\n" + 
    			"					  background-repeat: no-repeat;\r\n" + 
    			"					  background-size: cover;\r\n" + 
    			"					  position: relative;\r\n"
    			+ " margin-top:1.5%;\r\n" + 
    			"		  padding:2%;" + 
    			"	\r\n" + 
    			"						}\r\n" + 
    			"							\r\n" + 
    			"					.bwhite{\r\n" + 
    			"					background-color: white;\r\n" + 
    			"						}		\r\n" + 
    			"							\r\n" + 
    			"				 	.menue{\r\n" + 
    			"	float: left;\r\n" + 
    			"	margin-top: 15px;\r\n" + 
    			"	padding-right: 10px;\r\n" + 
    			"	margin-left: 2%;\r\n" + 
    			"	\r\n" + 
    			"}\r\n" + 
    			".menue li {\r\n" + 
    			"	display: inline-block;\r\n" + 
    			"}\r\n" + 
    			".menue li a{          /*Move the menue to the top and change its size*/\r\n" + 
    			"	color: black;\r\n" + 
    			"	text-decoration: none;\r\n" + 
    			"	padding: 5px 10px;\r\n" + 
    			"	font-size: 20px;\r\n" + 
    			"\r\n" + 
    			"}\r\n" + 
    			"\r\n" + 
    			".menue li :hover{      \r\n" + 
    			"	background: black;\r\n" + 
    			"	color: white;\r\n" + 
    			"	\r\n" + 
    			"}\r\n" + 
    			"\r\n" + 
    			"\r\n" + 
    			
    			"	 		  	\r\n" + 
    			"				\r\n" + 
    			"			  \r\n" + 
    			"			  		\r\n" + 
    			"			  		\r\n" + 
    			"	 </style>\r\n" + 
    			"</head>\r\n" + 
    			"\r\n" + 
    			"	<body>\r\n" + 
    			"	\r\n" + 
    			"<ul class=\"menue\">\r\n" + 
				"					 <li><a href=\"homeForMember\">Home</a></li>  \r\n" + 
				"						<li><a href=\"about.html\">About </a></li>\r\n" + 
				"						<li><a href=\"profile.html\">Profile</a></li>\r\n" + 
								 
				"					  </ul>\r\n"
				+ "<br>" + 
				"<div class=\"ForAll\">\r\n" +
				"		 </div>\r\n" + 			
    			"	\r\n" + 
    			"	\r\n"
    			+ "<center>" + 
    			"	<h2 style=color:red;>Sorry the courses will be available soon</h2>\r\n" + 
    			"	<h3>you will send to the home page after 10 sec</h3>\r\n" + 
    			"		\r\n" + 
    			"	      <br>\r\n"  
    			   + "</center>"  +
    			"	   <br>\r\n" + 
    			"	   <br>\r\n" + 
    			"	   <br>\r\n" + 
    			"	   \r\n" + 
    			"	  	\r\n" + 
    			"	 \r\n" + 
    			"	</body>\r\n" + 
    			"	\r\n" + 
    			"</html>");
    	
    	    response.setHeader("Refresh", "10; URL=homeForMember");
	}

}


