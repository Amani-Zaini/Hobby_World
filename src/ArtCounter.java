

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ArtCounter
 */
@WebServlet("/ArtCounter")
public class ArtCounter extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
		String art =CookieUtilities.getCookieValue(request,"art","1");
			    int count = 1;
			    try {
			      count = Integer.parseInt(art);
			    } catch(NumberFormatException nfe) { }
			    
			    
			    LongLivedCookie c = new LongLivedCookie("art",String.valueOf(count+1));
			    response.addCookie(c);
			  
		    		
		    		out.println("\r\n" + 
		    				"<!DOCTYPE html>\r\n" + 
		    				"\r\n" + 
		    				"<html>											\r\n" + 
		    				"<head>\r\n"
		    				+ "<title> Art course</title>" + 
		    				"	<meta charset=\"ISO-8859-1\">\r\n" + 
		    				"	<LINK REL=STYLESHEET\r\n" + 
		    				"      HREF=\"JSP-Styles.css\"\r\n" + 
		    				"      TYPE=\"text/css\">\r\n" + 
		    				"	\r\n" + 
		    				"<style>\r\n" + 
		    				"						/*Art Courses*/		\r\n" + 
		    				"	.ForAll{\r\n" + 
		    				"		  background: url(https://static1.s123-cdn-static-a.com/ready_uploads/media/2898800/2000_5e08e790d2c22.jpg);\r\n" + 
		    				"		  background-color: #cccccc;\r\n" + 
		    				"		  height: 50vh;\r\n" + 
		    				"		  background-position: center;\r\n" + 
		    				"		  background-repeat: no-repeat;\r\n" + 
		    				"		  background-size: cover;\r\n" + 
		    				"		  position: relative;\r\n"
		    				+ "margin-top:1.5%;\r\n" + 
		    				"		  padding:2%;" + 
		    				"		\r\n" + 
		    				"		}\r\n" + 
		    				"			\r\n" + 
		    				"	.bwhite{\r\n" + 
		    				"		background-color: white;\r\n" + 
		    				"		}	\r\n" + 
		    				" 	.menue{\r\n" + 
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
		    				
		    				"  	.text-title{\r\n" + 
		    				"	  		 text-align: center;\r\n" + 
		    				"	  		 font-size:x-large;	\r\n" + 
		    				"	  		 color: #BA55D3;\r\n" + 
		    				"	  		 text-decoration: underline;\r\n" + 
		    				"	  		 79.0text-decoration-color: red;\r\n" + 
		    				"  		 	\r\n" + 
		    				"  			}\r\n" + 
		    				"  			\r\n" + 
		    				
		    				"		\r\n" + 
		    				"  		\r\n" + 
		    				"  		\r\n" + 
		    				"	.button {\r\n" + 
		    				"			  background-color: orange;\r\n" + 
		    				"			  border: none;\r\n" + 
		    				"			  color: white;\r\n" + 
		    				"			  padding: 16px 32px;\r\n" + 
		    				"			  text-align: center;\r\n" + 
		    				"			  font-size: 16px;\r\n" + 
		    				"			  margin: 4px 2px;\r\n" + 
		    				"			  opacity: 0.6;\r\n" + 
		    				"			  transition: 0.3s;\r\n" + 
		    				"			  display: inline-block;\r\n" + 
		    				"			  text-decoration: none;\r\n" + 
		    				"			  cursor: pointer;\r\n" + 
		    				"			}\r\n" + 
		    				"			\r\n" + 
		    				"			.button:hover {opacity: 1}\r\n" + 
		    				"\r\n" + 
		    				" 		  \r\n" + 
		    				" .flowers-image{\r\n" + 
		    				"  		  border: 2px solid LightGray;\r\n" + 
		    				" 		  box-sizing: content-box;  \r\n" + 
		    				"	  width: 700px;\r\n" + 
		    				"	  height: 8px;\r\n" + 
		    				"	  padding: 150px; \r\n" + 
		    				" 		  margin: auto;\r\n" + 
		    				"	  background: url(data:image/jpeg;base64,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);\r\n" + 
		    				"	  background-repeat: no-repeat;\r\n" + 
		    				"	  background-size: 350px 350px; \r\n" + 
		    				" }\r\n" + 
		    				" \r\n" + 
		    				"\r\n" + 
		    				" .text-flowers{\r\n" + 
		    				" 		  line-height: 0.7;\r\n" + 
		    				"         letter-spacing: normal;\r\n" + 
		    				"	  margin-left: 60%;\r\n" + 
		    				"	  padding-center: 150px; \r\n" + 
		    				"	  text-align: left;\r\n" + 
		    				"	  font-size:25px;\r\n" + 
		    				"	  top: 10%;\r\n" + 
		    				"	  left: 600%;\r\n" + 
		    				"	  transform: translate(-50%, -50%);\r\n" + 
		    				"	  color: black;\r\n" + 
		    				"}					  \r\n" + 
		    				"\r\n" + 
		    				"  .pottery-image{\r\n" + 
		    				"  		  border: 2px solid LightGray;\r\n" + 
		    				" 		  box-sizing: content-box;  \r\n" + 
		    				"	  width: 700px;\r\n" + 
		    				"	  height: 8px;\r\n" + 
		    				"	  padding: 150px; \r\n" + 
		    				" 		  margin: auto;\r\n" + 
		    				"	  background: url(https://www.aia-mn.org/wp-content/uploads/MM_Session-3_Stock-Image-scaled.jpeg);\r\n" + 
		    				"	  background-repeat: no-repeat;\r\n" + 
		    				"	  background-size: 350px 350px; \r\n" + 
		    				" }\r\n" + 
		    				" \r\n" + 
		    				" .text-pottery{\r\n" + 
		    				" 		  line-height: 0.7;\r\n" + 
		    				"         letter-spacing: normal;\r\n" + 
		    				"	  margin-left: 60%;\r\n" + 
		    				"	  padding-center: 150px; \r\n" + 
		    				"	  text-align: left;\r\n" + 
		    				"	  font-size:25px;\r\n" + 
		    				"	  top: 10%;\r\n" + 
		    				"	  left: 600%;\r\n" + 
		    				"	  transform: translate(-50%, -50%);\r\n" + 
		    				"	  color: black;\r\n" + 
		    				" 		}\r\n" + 
		    				"\r\n" + 
		    				".crochet-image{\r\n" + 
		    				"  		  border: 2px solid LightGray;\r\n" + 
		    				" 		  box-sizing: content-box;  \r\n" + 
		    				"	  width: 700px;\r\n" + 
		    				"	  height: 8px;\r\n" + 
		    				"	  padding: 150px; \r\n" + 
		    				" 		  margin: auto;\r\n" + 
		    				"	  background: url(https://static1.s123-cdn-static-a.com/ready_uploads/media/3102726/400_5e0fb8ece3c71.jpg);\r\n" + 
		    				"	  background-repeat: no-repeat;\r\n" + 
		    				"	  background-size: 350px 350px; \r\n" + 
		    				"			 }\r\n" + 
		    				" \r\n" + 
		    				" .text-crochet{\r\n" + 
		    				" 		  line-height: 0.7;\r\n" + 
		    				"         letter-spacing: normal;\r\n" + 
		    				"	  margin-left: 60%;\r\n" + 
		    				"	  padding-center: 150px; \r\n" + 
		    				"	  text-align: left;\r\n" + 
		    				"	  font-size:25px;\r\n" + 
		    				"	  top: 10%;\r\n" + 
		    				"	  left: 600%;\r\n" + 
		    				"	  transform: translate(-50%, -50%);\r\n" + 
		    				"	  color: black;\r\n" + 
		    				" 		}\r\n" + 
		    				" 		\r\n" + 
		    				" 		\r\n" + 
		    				"</style>\r\n" + 
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
		    				"\r\n" + 
		    				"	\r\n" + 
		    				"	\r\n" + 
		    				"		<div class=\"art-image\"></div>\r\n" + 
		    				"		<div class=\"text-title\">\r\n" + 
		    				"			<h1>Arts Courses</h1>\r\n" + 
		    				"		</div>\r\n" + 
		    				"		\r\n" + 
		    				"		<br>\r\n" + 
		    				"		<br>\r\n" + 
		    				"		<br>\r\n" + 
		    				"		\r\n" + 
		    				"	  	<div class=flowers-image>  \r\n" + 
		    				"		  <div class=\"text-flowers\">\r\n" + 
		    				"			<h3>Art: Floral Design </h3>\r\n" + 
		    				"			<h3> Date: 5/6/2021</h3> \r\n" + 
		    				"			<a href=\"flowMore.html\" class=\"button\">More</a>	\r\n" + 
		    				"			</div>\r\n" + 
		    				"	      </div>\r\n" + 
		    				"   \r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   \r\n" + 
		    				"	  	<div class=pottery-image>  \r\n" + 
		    				"		  <div class=\"text-pottery\">\r\n" + 
		    				"			<h3>Art: Pottery</h3>\r\n" + 
		    				"			<h3> Date: 2/4/2021</h3> \r\n" + 
		    				"			<a href=\"potMore.html\" class=\"button\">More</a>	\r\n" + 
		    				"	      </div>\r\n" + 
		    				"	    </div>\r\n" + 
		    				"	    \r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   <br>\r\n" + 
		    				"	   \r\n" + 
		    				"	  	<div class=crochet-image>  \r\n" + 
		    				"		  <div class=\"text-crochet\">\r\n" + 
		    				"			<h3>Art: Crochet</h3>\r\n" + 
		    				"			<h3> Date: 1/4/2021</h3> \r\n" + 
		    				"			   	<a href=\"error.jsp\" class=\"button\">	More</a>	 \r\n" + 
		    				"	      </div>\r\n" + 
		    				"	    </div>\r\n" + 
		    				"	 \r\n" + 
		    				"	</body>\r\n" + 
		    				"	\r\n" + 
		    				"</html>");
		  }
       
   

}
