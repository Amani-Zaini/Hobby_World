
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SportCounter")
public class SportCounter extends HttpServlet 
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	
    	
		String sport =CookieUtilities.getCookieValue(request,"sport","1");
			    int count_1 = 1;
			    try {
			      count_1 = Integer.parseInt(sport);
			    } catch(NumberFormatException nfe) { }
			    
			    LongLivedCookie c = new LongLivedCookie("sport",String.valueOf(count_1+1));
			    response.addCookie(c);
			  
			    out.println("<!DOCTYPE html>\r\n" + 
			    		"<html>\r\n" + 
			    		"\r\n" + 
			    		"<head>\r\n"
			    		+ "<title> Sport course</title>" + 
			    		"	<meta charset=\"ISO-8859-1\">\r\n" + 
			    		"	 <style>\r\n" + 
			    		"	 									/*Sport Courses*/\r\n" + 
			    		"					.ForAll{\r\n" + 
			    		"					background: url(https://wallpaperaccess.com/full/552032.jpg);\r\n"+
			    		
			    		"					background-color: #cccccc;\r\n" + 
			    		"					  height: 50vh;\r\n" + 
			    		"					  background-position: center;\r\n" + 
			    		"					  background-repeat: no-repeat;\r\n" + 
			    		"					  background-size: cover;\r\n" + 
			    		"					  position: relative;\r\n"
			    		+ " margin-top:1.5%;\r\n" + 
			    		"		  padding:2%;" + 
			    		"					\r\n" + 
			    		"						}\r\n" + 
			    		"					\r\n" + 
			    		"				.bwhite{\r\n" + 
			    		"						background-color: white;\r\n" + 
			    		"						}\r\n" + 
			    		"				 			\r\n" + 
			    		"				 	\r\n" + 
			    		"				.menue{\r\n" + 
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
			    		
			    		"\r\n" + 
			    		"	 		  	.text-title{\r\n" + 
			    		"		 		  		 text-align: center;\r\n" + 
			    		"		 		  		 font-size:x-large;	\r\n" + 
			    		"		 		  		 color: orange;\r\n" + 
			    		"		 		  		 text-decoration: underline;\r\n" + 
			    		"		 		  		 79.0text-decoration-color: red;\r\n" + 
			    		"	 		  		 	\r\n" + 
			    		"	 		  			}\r\n" + 
			    		"	 		  		\r\n" + 
			    		"	 		 	 .more-link {\r\n" + 
			    		"							  color: pink;\r\n" + 
			    		"							  background-color: transparent;\r\n" + 
			    		"							  text-decoration: none;\r\n" + 
			    		"							  text-align: left; \r\n" + 
			    		"							  font-size: 16px;\r\n" + 
			    		"							  float: right;\r\n" + 
			    		"							}\r\n" + 
			    		"	 		  		\r\n" + 
			    		"	 		  		\r\n" + 
			    		"					.button {\r\n" + 
			    		"							  background-color: orange;\r\n" + 
			    		"							  border: none;\r\n" + 
			    		"							  color: white;\r\n" + 
			    		"							  padding: 16px 32px;\r\n" + 
			    		"							  text-align: center;\r\n" + 
			    		"							  font-size: 16px;\r\n" + 
			    		"							  margin: 4px 2px;\r\n" + 
			    		"							  opacity: 0.6;\r\n" + 
			    		"							  transition: 0.3s;\r\n" + 
			    		"							  display: inline-block;\r\n" + 
			    		"							  text-decoration: none;\r\n" + 
			    		"							  cursor: pointer;\r\n" + 
			    		"							}\r\n" + 
			    		"							\r\n" + 
			    		"							.button:hover {opacity: 1}\r\n" + 
			    		"	\r\n" + 
			    		"				.swim-image		{\r\n" + 
			    		"					  border: 2px solid LightGray;\r\n" + 
			    		"			  		  box-sizing: content-box;  \r\n" + 
			    		"					  width: 700px;\r\n" + 
			    		"					  height: 8px;\r\n" + 
			    		"					  padding: 150px; \r\n" + 
			    		"			  		  margin: auto;\r\n" + 
			    		"					  background: url(https://static1.s123-cdn-static-a.com/ready_uploads/media/18427/400_5cdb9f449ce30.jpg);\r\n" + 
			    		"					  background-repeat: no-repeat;\r\n" + 
			    		"					  background-size: 350px 350px; \r\n" + 
			    		"					\r\n" + 
			    		"			  		} 		\r\n" + 
			    		"			  .text-swim{\r\n" + 
			    		"			  		  line-height: 0.7;\r\n" + 
			    		"			  		  letter-spacing: normal;\r\n" + 
			    		"					  margin-left: 60%;\r\n" + 
			    		"					  padding-center: 150px; \r\n" + 
			    		"					  text-align: left;\r\n" + 
			    		"					  font-size:25px;\r\n" + 
			    		"					  top: 10%;\r\n" + 
			    		"					  left: 600%;\r\n" + 
			    		"					  transform: translate(-50%, -50%);\r\n" + 
			    		"					  color: black;\r\n" + 
			    		"			  }\r\n" + 
			    		"			  		  \r\n" + 
			    		"			  .badminton-image{\r\n" + 
			    		"			   		  border: 2px solid LightGray;\r\n" + 
			    		"			  		  box-sizing: content-box;  \r\n" + 
			    		"					  width: 700px;\r\n" + 
			    		"					  height: 8px;\r\n" + 
			    		"					  padding: 150px; \r\n" + 
			    		"			  		  margin: auto;\r\n" + 
			    		"					  background: url(https://blog.thelliervoyages.com/wp-content/uploads/2018/10/activit%C3%A9s_camping-car-750x400.jpg);\r\n" + 
			    		"					  background-repeat: no-repeat;\r\n" + 
			    		"					  background-size: 350px 350px; \r\n" + 
			    		"			  }\r\n" + 
			    		"			  \r\n" + 
			    		"			  .text-badminton{\r\n" + 
			    		"			  		  line-height: 0.7;\r\n" + 
			    		"					  margin-left: 60%;\r\n" + 
			    		"					  padding-center: 150px; \r\n" + 
			    		"					  text-align: left;\r\n" + 
			    		"					  font-size:25px;\r\n" + 
			    		"					  top: 10%;\r\n" + 
			    		"					  left: 600%;\r\n" + 
			    		"					  transform: translate(-50%, -50%);\r\n" + 
			    		"					  color: black;\r\n" + 
			    		"				}					  \r\n" + 
			    		"				\r\n" + 
			    		"				.biking-image{\r\n" + 
			    		"			   		  border: 2px solid LightGray;\r\n" + 
			    		"			  		  box-sizing: content-box;  \r\n" + 
			    		"					  width: 700px;\r\n" + 
			    		"					  height: 8px;\r\n" + 
			    		"					  padding: 150px; \r\n" + 
			    		"			  		  margin: auto;\r\n" + 
			    		"					  background: url(https://wgnradio.com/wp-content/uploads/sites/6/2021/08/FFAR-Image1.jpg?w=1280&h=720&crop=1);\r\n" + 
			    		"					  background-repeat: no-repeat;\r\n" + 
			    		"					  background-size: 350px 350px; \r\n" + 
			    		"			 			 }\r\n" + 
			    		"			  \r\n" + 
			    		"			  .text-biking{\r\n" + 
			    		"			  		  line-height: 0.7;\r\n" + 
			    		"					  margin-left: 60%;\r\n" + 
			    		"					  padding-center: 150px; \r\n" + 
			    		"					  text-align: left;\r\n" + 
			    		"					  font-size:25px;\r\n" + 
			    		"					  top: 10%;\r\n" + 
			    		"					  left: 600%;\r\n" + 
			    		"					  transform: translate(-50%, -50%);\r\n" + 
			    		"					  color: black;\r\n" + 
			    		"			  		}\r\n" + 
			    		"				\r\n" + 
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
			    		"	\r\n" + 
			    		"	\r\n" + 
			    		"		<div class=\"sports-image\"></div>\r\n" + 
			    		"		<div class=\"text-title\">\r\n" + 
			    		"			<h1>Sports Courses</h1>\r\n"
			    		+ "<a href='forDb'><h3>Sports Couch</h3></a>" + 
			    		"		</div>\r\n" + 
			    		"		\r\n" + 
			    		"		<br>\r\n" + 
			    		"		<br>\r\n" + 
			    		"		<br>\r\n" + 
			    		"		\r\n" + 
			    		"       <div class=swim-image>  \r\n" + 
			    		"		 <div class=\"text-swim\">\r\n" + 
			    		"			<h3>Sport: Swimming</h3>\r\n" + 
			    		"			<h3> Date: 20/3/2021</h3> \r\n" + 
			    		"			<a href=\"swimMore.html\" class=\"button\">More</a>\r\n" + 
			    		"			\r\n" + 
			    		"	   	 </div>\r\n" + 
			    		"	   </div>\r\n" + 
			    		"	 \r\n" + 
			    		"	   <br>\r\n" + 
			    		"	   <br>\r\n" + 
			    		"	   <br>\r\n" + 
			    		"	   \r\n" + 
			    		"	  	<div class=badminton-image>  \r\n" + 
			    		"		  <div class=\"text-badminton\">\r\n" + 
			    		"			<h3>Sport: Badminton</h3>\r\n" + 
			    		"			<h3> Date: 23/3/2021</h3> \r\n" + 
			    		"			<a href=\"badmitionMore.html\" class=\"button\">More</a>	\r\n" + 
			    		"			</div>\r\n" + 
			    		"	      </div>\r\n" + 
			    		"	    	    \r\n" + 
			    		"	   <br>\r\n" + 
			    		"	   <br>\r\n" + 
			    		"	   <br>\r\n" + 
			    		"	   \r\n" + 
			    		"	  	<div class=biking-image>  \r\n" + 
			    		"		  <div class=\"text-biking\">\r\n" + 
			    		"			<h3>Sport: Biking</h3>\r\n" + 
			    		"			<h3> Date: 25/3/2021</h3> \r\n" + 
			    		"			<a href=\"bikingMore.html\" class=\"button\">More</a>				\r\n" + 
			    		"	      </div>\r\n" + 
			    		"	    </div>\r\n" + 
			    		"	    \r\n" + 
			    		"	</body>\r\n" + 
			    		"	\r\n" + 
			    		"</html>");
			    
			    
		               
		
	}


}
