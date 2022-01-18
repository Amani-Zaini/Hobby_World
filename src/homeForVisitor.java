

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/homeForVisitor")
public class homeForVisitor extends HttpServlet 
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter();



		String sport =CookieUtilities.getCookieValue(request,"sport","1");
		int count_1 = 1;
		count_1 = Integer.parseInt(sport);
		
		
		String art =CookieUtilities.getCookieValue(request,"art","1");
		int count = 1;
		count = Integer.parseInt(art);
		
		String cook =CookieUtilities.getCookieValue(request,"cook","1");
		 int count_2 = 1;
		 count_2 = Integer.parseInt(cook);
		 
   
if(count > count_1 && count> count_2) {
		out.println( 
				"\r\n" + 
		"\r\n" + 
		"<!DOCTYPE html>\r\n" + 
		"\r\n" + 
		"<html>\r\n" + 
		"<head>\r\n" + 
		"<meta charset=\"ISO-8859-1\">\r\n" + 
		"<title>Home</title>\r\n" + 
		"<style>\r\n" + 
		"*{\r\n" + 
		"	margin: 0;\r\n" + 
		"	padding: 0;\r\n" + 
		"	\r\n" + 
		"   }\r\n" + 
		"\r\n" + 
		".ForAll{\r\n" + 
		"	background: url(https://toggl.com/blog/wp-content/uploads/2018/10/productive-hobbies.jpg);\r\n" + 
		"	height: 90vh;\r\n" + 
		"	position: relative;\r\n" + 
		"	background-size: cover;\r\n" + 
		"	background-position: top ;\r\n" + 
		"	background-repeat: no-repeat;\r\n" + 
		"	margin-top:1%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".mySlides {display:none;\r\n" + 
		"margin-left: 5%;}\r\n" + 
		".Trend{\r\n" + 
		"margin-top: 25%;\r\n" + 
		"margin-left: 1%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".newCourse{\r\n" + 
		"margin-top: 5%;\r\n" + 
		"margin-left: 1%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".plank-in-top{\r\n" + 
		"	background-color: white;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.gallery {\r\n" + 
		"  border: 1px solid #ccc;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.gallery:hover {\r\n" + 
		"  border: 1px solid #777;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.gallery img {\r\n" + 
		"  width: 100%;\r\n" + 
		"  height: auto;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.desc {\r\n" + 
		"  padding: 15px;\r\n" + 
		"  text-align: center;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"* {\r\n" + 
		"  box-sizing: border-box;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		".responsive {\r\n" + 
		"  padding: 0 6px;\r\n" + 
		"  float: left;\r\n" + 
		"  width: 17.99999%;\r\n" + 
		"  padding-top:1%;\r\n"
		+ "margin-left:6%;" + 
		"}\r\n" + 
		"\r\n" + 
		"@media only screen and (max-width: 700px) {\r\n" + 
		"  .responsive {\r\n" + 
		"    width: 49.99999%;\r\n" + 
		"    margin: 6px 0;\r\n" + 
		"  }\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"@media only screen and (max-width: 500px) {\r\n" + 
		"  .responsive {\r\n" + 
		"    width: 100%;\r\n" + 
		"  }\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		".clearfix:after {\r\n" + 
		"  content: \"\";\r\n" + 
		"  display: table;\r\n" + 
		"  clear: both;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		".menue{\r\n" + 
		"	float: left;\r\n" + 
		"	margin-top: 20px;\r\n" + 
		"	padding-right: 10px;\r\n" + 
		"	margin-left: 4%;\r\n" + 
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
		".welcome-world{\r\n" + 
		"	position: absolute;\r\n" + 
		"	margin: 16% 37%;     /*to move the world HOBY WORLD */\r\n" + 
		"	text-align: center;\r\n" + 
		"	color: DarkSlateBlue;\r\n" + 
		"	pading-left: 50%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".welcome-world h1{\r\n" + 
		"	text-transform: uppercase;\r\n" + 
		"	font-size: 60px;\r\n" + 
		"	text-shadow: 1px 1px 2px SeaShell, 0 0 25px SeaShell, 0 0 5px black;\r\n" + 
		"    font-family: Bradley Hand, cursive;	  	\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		".welcome-world h2{\r\n" + 
		"	text-align: left;					\r\n" + 
		"	font-size: 30px;\r\n" + 
		"    font-family: Bradley Hand, cursive;\r\n" + 
		"    \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"input[type=text] {    /*For the search*/\r\n" + 
		"   background-color: white;\r\n" + 
		"    padding: 10px 20px;\r\n" + 
		"    margin: 8px 1px ;\r\n" + 
		"    border: 1%;\r\n" + 
		"    cursor: pointer;\r\n" + 
		"    width: 300px;\r\n" + 
		"    float: left;\r\n" + 
		"    color: black;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"input[type=submit] {\r\n" + 
		"   background-color: white;\r\n" + 
		"    padding: 10px 20px;\r\n" + 
		"    margin: 8px 1px ;\r\n" + 
		"    border: 1%;\r\n" + 
		"    cursor: pointer;\r\n" + 
		"    width: 130px;\r\n" + 
		"    float: right;\r\n" + 
		"    margin-right: 5%;\r\n" + 
		"    color: black;\r\n" + 
		"  background-position: 5px 5px; \r\n" + 
		"  \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"input[type=submit]:hover {\r\n" + 
		"  background-color: blue;\r\n" + 
		"  color:white;\r\n" + 
		"  opacity: 0.8;\r\n" + 
		"}\r\n" + 
		".button {\r\n" + 
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
		"\r\n" + 
		"			  \r\n" + 
		"\r\n" + 
		".image{\r\n" + 
		" border: 2px solid LightGray;\r\n" + 
		" box-sizing: content-box;  \r\n" + 
		" width: 550px;\r\n" + 
		" height: 250px;\r\n" + 
		" margin-left: 2%;\r\n" + 
		" background-color: pink;\r\n" + 
		"	}\r\n" + 
		".flowers{\r\n" + 
		"line-height: 1;\r\n" + 
		"margin-left: 50%;\r\n" + 
		"margin-top: 20%;\r\n" + 
		"font-size:30px;\r\n" + 
		"top: 10%;\r\n" + 
		"left: 600%;\r\n" + 
		"transform: translate(-50%, -50%);\r\n" + 
		"color: black;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"/**the style for contact**/	\r\n" + 
		"\r\n" + 
		"#footer{\r\n" + 
		"	color: white;\r\n" + 
		"	font-size: 20px;\r\n" + 
		"	font-style: initial;\r\n" + 
		"	background : #77D6F2 ;\r\n" + 
		"	padding: 20px;\r\n" + 
		"	\r\n" + 
		"}\r\n" + 
		"#footer h1{\r\n" + 
		"	color: white;\r\n" + 
		"	margin-left: 45%;\r\n" + 
		"}	\r\n" + 
		"\r\n" + 
		"#footer input[type=text], textarea {\r\n" + 
		"  width: 100%;\r\n" + 
		"  padding: 3px;\r\n" + 
		"  border: 1px solid white;\r\n" + 
		"  border-radius: 4px;\r\n" + 
		"  box-sizing: border-box;\r\n" + 
		" height: 40px;\r\n" + 
		" \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		".comment {\r\n" + 
		"  border-radius: 5px;\r\n" + 
		"  border: 2px solid black;\r\n" + 
		"  padding: 20px;\r\n" + 
		"  width: 700px;\r\n" + 
		"  margin-left: 150px;\r\n" + 
		"   height: 350px;\r\n" + 
		"   \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"\r\n" + 
		".flowers-image{\r\n" + 
		"  		  border: 2px solid LightGray;\r\n" + 
		" 		  box-sizing: content-box;  \r\n" + 
		"	  width: 600px;\r\n" + 
		"	  height: 8px;\r\n" + 
		"	  padding: 150px; \r\n" + 
		" 		  margin-top: 1%;\r\n" + 
		"	  background: url(data:image/jpeg;base64,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);\r\n" + 
		"	  background-repeat: no-repeat;\r\n" + 
		"	  background-size: 350px 350px; \r\n" + 
		"	  flaot:left;\r\n" + 
		"	  margin-left:1%;\r\n" + 
		" }\r\n" + 
		" \r\n" + 
		"\r\n" + 
		" .text-flowers{\r\n" + 
		" 		  line-height: 0.9;\r\n" + 
		"         letter-spacing: normal;\r\n" + 
		"	  margin-left: 60%;\r\n" + 
		"	  padding-center: 150px; \r\n" + 
		"	  text-align: left;\r\n" + 
		"	  font-size:25px;\r\n" + 
		"	  top: 10%;\r\n" + 
		"	  left: 600%;\r\n" + 
		"	  transform: translate(-50%, -50%);\r\n" + 
		"	  color: black;}\r\n" + 
		"</style>\r\n" + 
		"</head>\r\n" + 
		"<body>\r\n" + 
		"<div class=\"plank-in-top\">	\r\n" + 
		"					 <ul class=\"menue\">\r\n" + 
		"					 <li><a href=\"ForHome\">Home</a></li>  \r\n" + 
		"						<li><a href=\"about.html\">About </a></li>\r\n" + 
		"						<li><a href=\"ForOpenProfile\">Profile</a></li>\r\n" + 
		"						<li><a href=\"#footer\">Contact</a></li>\r\n" + 
		"					  </ul>\r\n" + 
		"  				<form action=\"logIn.html\" >\r\n" + 
		"						<input type=\"submit\" value=\"Log in\" >\r\n" + 
		"					</form>\r\n" + 
		"\r\n" + 
		"	 			<br><br>	\r\n" + 
		"  		 \r\n" + 
		" 	</div>\r\n" + 
		"	  <div class=\"ForAll\">\r\n" + 
		"			  <div class=\"welcome-world\">\r\n" + 
		"					<h1> Hobby World  </h1>\r\n" + 
		"			 		<h2>Explore new experiences... </h2>\r\n" + 
		"			   </div>\r\n" + 
		"			   </div> \r\n" + 
		"   		\r\n" + 
		"\r\n" + 
		"  	  <!-- here start the log in-->\r\n" + 
		"  	  \r\n" + 
		"\r\n" + 
		"    		<!-- For the 4 courses -->\r\n" + 
		" <div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"ArtCounter\">\r\n" + 
		"      <img src=\"https://media.istockphoto.com/photos/happy-friends-having-fun-in-the-park-with-multicolored-smoke-bombs-picture-id1317470958?b=1&k=20&m=1317470958&s=170667a&w=0&h=NKiue9llLNC1zU5aE30k59ltI9PcUA7-bhwYGDuEU7Q=\" alt=\"Cinque Terre\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Art</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"<div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"SportCounter\">\r\n" + 
		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/69592/400_5ce51ee86be74.jpg\" alt=\"Forest\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Sport</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		"<div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"CookingCounter\">\r\n" + 
		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/162457/400_5cea4d0004800.jpg\" alt=\"Northern Lights\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Cooking</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		"<div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"RedirectForPastry\">\r\n" + 
		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/78444/400_5ce56e5e117c7.jpg\" alt=\"Mountains\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Pastry</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		" \r\n" + 
		"   \r\n" + 
		"\r\n" + 
		"<!-- the trend and new text and box-->\r\n" + 
		"	 	<div class=\"Trend\">\r\n" + 
		"	 		<h1>Recommended for you</h1>\r\n" + 
		"	 	</div>\r\n" + 
		"	\r\n" + 
		"	<div class=flowers-image>  \r\n" + 
		"		  <div class=\"text-flowers\">\r\n" + 
		"			<h3>Art: Floral Design </h3>\r\n" + 
		"			<h3> Date: 5/6/2021</h3> \r\n" + 
		"			<a href=\"flowMore.html\" class=\"button\">More</a>	\r\n" + 
		"			</div>\r\n" + 
		"	      </div>\r\n" + 
		"	\r\n" + 
		"	  	<div class=\"newCourse\">\r\n" + 
		"	 		<h1>New courses </h1>\r\n" + 
		"	 	</div>\r\n" + 
		"	 	<div class=\"w3-content w3-section\" style=\"max-width:500px\">\r\n"+"<a href=\"swimMore.html\">  <img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/18427/400_5cdb9f449ce30.jpg\" style=\"width:100%\"></a>\r\n" + 
		" <a href=\"lazaniaMore.html\"> <img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/3384694/400_5e1bded6482fe.jpg\" style=\"width:100%\"></a>\r\n" + 
		"  <a href=\"crochetMore.html\" ><img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/3102726/400_5e0fb8ece3c71.jpg\" style=\"width:100%\"></a>" + 
	  
		"</div>\r\n" + 
		"\r\n" + 
		"<script>\r\n" + 
		"var myIndex = 0;\r\n" + 
		"carousel();\r\n" + 
		"\r\n" + 
		"function carousel() {\r\n" + 
		"  var i;\r\n" + 
		"  var x = document.getElementsByClassName(\"mySlides\");\r\n" + 
		"  for (i = 0; i < x.length; i++) {\r\n" + 
		"    x[i].style.display = \"none\";  \r\n" + 
		"  }\r\n" + 
		"  myIndex++;\r\n" + 
		"  if (myIndex > x.length) {myIndex = 1}    \r\n" + 
		"  x[myIndex-1].style.display = \"block\";  \r\n" + 
		"  setTimeout(carousel, 2000); // Change image every 2 seconds\r\n" + 
		"}\r\n" + 
		"</script>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"	     <!-- For the footer contact-->\r\n" + 
		"	   \r\n" + 
		"      <br>\r\n" + 
		"	  <div id=\"footer\">\r\n" + 
		"	  	<h1>Contact us</h1><hr> <br>\r\n" + 
		"	  	\r\n" + 
		"     \r\n" + 
		"      \r\n" + 
		"<div class=\"comment\">\r\n" + 
		"  <form action=\"#\">\r\n" + 
		"    <label for=\"fname\">First Name</label>\r\n" + 
		"    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your first name\"><br>\r\n" + 
		"\r\n" + 
		"    <label for=\"lname\">Last Name</label>\r\n" + 
		"    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name\"><br>\r\n" + 
		"\r\n" + 
		"    <label for=\"subject\"> your comment</label>\r\n" + 
		"    <textarea id=\"subject\" name=\"subject\" placeholder=\"Write ...\" style=\"height:100px\"></textarea><br>\r\n" + 
		"\r\n" + 
		"    <input type=\"submit\" value=\"Submit\">\r\n" + 
		"  </form>\r\n" + 
		"</div>\r\n" + 
		"</div>\r\n" + 
		" </div>\r\n" + 
		"\r\n" + 
		"</body>\r\n" + 
		"</html>");
}
else if (count_1 > count && count_1> count_2) {
	out.println("\r\n" + 
		"\r\n" + 
		"<!DOCTYPE html>\r\n" + 
		"<html>\r\n" + 
		"<head>\r\n" + 
		"<meta charset=\"ISO-8859-1\">\r\n" + 
		"<title>Home</title>\r\n" + 
		"<style>\r\n" + 
		"*{\r\n" + 
		"	margin: 0;\r\n" + 
		"	padding: 0;\r\n" + 
		"	\r\n" + 
		"   }\r\n" + 
		"\r\n" + 
		".ForAll{\r\n" + 
		"	background: url(https://toggl.com/blog/wp-content/uploads/2018/10/productive-hobbies.jpg);\r\n" + 
		"	height: 90vh;\r\n" + 
		"	position: relative;\r\n" + 
		"	background-size: cover;\r\n" + 
		"	background-position: top ;\r\n" + 
		"	background-repeat: no-repeat;\r\n" + 
		"	margin-top:1%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".mySlides {display:none;\r\n" + 
		"margin-left: 5%;}\r\n" + 
		".Trend{\r\n" + 
		"margin-top: 25%;\r\n" + 
		"margin-left: 1%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".newCourse{\r\n" + 
		"margin-top: 5%;\r\n" + 
		"margin-left: 1%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".plank-in-top{\r\n" + 
		"	background-color: white;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.gallery {\r\n" + 
		"  border: 1px solid #ccc;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.gallery:hover {\r\n" + 
		"  border: 1px solid #777;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.gallery img {\r\n" + 
		"  width: 100%;\r\n" + 
		"  height: auto;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"div.desc {\r\n" + 
		"  padding: 15px;\r\n" + 
		"  text-align: center;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"* {\r\n" + 
		"  box-sizing: border-box;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		".responsive {\r\n" + 
		"  padding: 0 6px;\r\n" + 
		"  float: left;\r\n" + 
		"  width: 17.99999%;\r\n" + 
		"  padding-top:1%;\r\n"
		+ "margin-left:6%;" + 
		"}\r\n" + 
		"\r\n" + 
		"@media only screen and (max-width: 700px) {\r\n" + 
		"  .responsive {\r\n" + 
		"    width: 49.99999%;\r\n" + 
		"    margin: 6px 0;\r\n" + 
		"  }\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"@media only screen and (max-width: 500px) {\r\n" + 
		"  .responsive {\r\n" + 
		"    width: 100%;\r\n" + 
		"  }\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		".clearfix:after {\r\n" + 
		"  content: \"\";\r\n" + 
		"  display: table;\r\n" + 
		"  clear: both;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		".menue{\r\n" + 
		"	float: left;\r\n" + 
		"	margin-top: 20px;\r\n" + 
		"	padding-right: 10px;\r\n" + 
		"	margin-left: 4%;\r\n" + 
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
		".welcome-world{\r\n" + 
		"	position: absolute;\r\n" + 
		"	margin: 16% 37%;    /*to move the world HOBY WORLD */\r\n" + 
		"	text-align: center;\r\n" + 
		"	color: DarkSlateBlue;\r\n" + 
		"	pading-left: 50%;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		".welcome-world h1{\r\n" + 
		"	text-transform: uppercase;\r\n" + 
		"	font-size: 60px;\r\n" + 
		"	text-shadow: 1px 1px 2px SeaShell, 0 0 25px SeaShell, 0 0 5px black;\r\n" + 
		"    font-family: Bradley Hand, cursive;	  	\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		".welcome-world h2{\r\n" + 
		"	text-align: left;					\r\n" + 
		"	font-size: 30px;\r\n" + 
		"    font-family: Bradley Hand, cursive;\r\n" + 
		"    \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"input[type=text] {    /*For the search*/\r\n" + 
		"   background-color: white;\r\n" + 
		"    padding: 10px 20px;\r\n" + 
		"    margin: 8px 1px ;\r\n" + 
		"    border: 1%;\r\n" + 
		"    cursor: pointer;\r\n" + 
		"    width: 300px;\r\n" + 
		"    float: left;\r\n" + 
		"    color: black;\r\n" + 
		"\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"input[type=submit] {\r\n" + 
		"   background-color: white;\r\n" + 
		"    padding: 10px 20px;\r\n" + 
		"    margin: 8px 1px ;\r\n" + 
		"    border: 1%;\r\n" + 
		"    cursor: pointer;\r\n" + 
		"    width: 130px;\r\n" + 
		"    float: right;\r\n" + 
		"    margin-right: 5%;\r\n" + 
		"    color: black;\r\n" + 
		"  background-position: 5px 5px; \r\n" + 
		"  \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"input[type=submit]:hover {\r\n" + 
		"  background-color: blue;\r\n" + 
		"  color:white;\r\n" + 
		"  opacity: 0.8;\r\n" + 
		"}\r\n" + 
		".button {\r\n" + 
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
		"\r\n" + 
		"			  \r\n" + 
		"\r\n" + 
		".image{\r\n" + 
		" border: 2px solid LightGray;\r\n" + 
		" box-sizing: content-box;  \r\n" + 
		" width: 550px;\r\n" + 
		" height: 250px;\r\n" + 
		" margin-left: 2%;\r\n" + 
		" background-color: pink;\r\n" + 
		"	}\r\n" + 
		".flowers{\r\n" + 
		"line-height: 1;\r\n" + 
		"margin-left: 50%;\r\n" + 
		"margin-top: 20%;\r\n" + 
		"font-size:30px;\r\n" + 
		"top: 10%;\r\n" + 
		"left: 600%;\r\n" + 
		"transform: translate(-50%, -50%);\r\n" + 
		"color: black;\r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"/**the style for contact**/	\r\n" + 
		"\r\n" + 
		"#footer{\r\n" + 
		"	color: white;\r\n" + 
		"	font-size: 20px;\r\n" + 
		"	font-style: initial;\r\n" + 
		"	background : #77D6F2 ;\r\n" + 
		"	padding: 20px;\r\n" + 
		"	\r\n" + 
		"}\r\n" + 
		"#footer h1{\r\n" + 
		"	color: white;\r\n" + 
		"	margin-left: 45%;\r\n" + 
		"}	\r\n" + 
		"\r\n" + 
		"#footer input[type=text], textarea {\r\n" + 
		"  width: 100%;\r\n" + 
		"  padding: 3px;\r\n" + 
		"  border: 1px solid white;\r\n" + 
		"  border-radius: 4px;\r\n" + 
		"  box-sizing: border-box;\r\n" + 
		" height: 40px;\r\n" + 
		" \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		".comment {\r\n" + 
		"  border-radius: 5px;\r\n" + 
		"  border: 2px solid black;\r\n" + 
		"  padding: 20px;\r\n" + 
		"  width: 700px;\r\n" + 
		"  margin-left: 150px;\r\n" + 
		"   height: 350px;\r\n" + 
		"   \r\n" + 
		"}\r\n" + 
		"\r\n" + 
		".biking-image{\r\n" + 
		"  border: 2px solid LightGray;\r\n" + 
		"  box-sizing: content-box;  \r\n" + 
		"  width: 600px;\r\n" + 
		"  height: 8px;\r\n" + 
		"  padding: 110px; \r\n" + 
		"    margin-top: 1%;\r\n" + 
		"  background: url(data:image/jpeg;base64,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);\r\n" + 
		"  background-repeat: no-repeat;\r\n" + 
		"  background-size: 350px 350px; \r\n" + 
		"   flaot:left;\r\n" + 
		"	margin-left:1%;\r\n" + 
		"		 }\r\n" + 
		"\r\n" + 
		".text-biking{\r\n" + 
		"	line-height: 0.9;\r\n" + 
		"  margin-left: 60%;\r\n" + 
		"  padding-center: 150px; \r\n" + 
		"  text-align: left;\r\n" + 
		"  font-size:25px;\r\n" + 
		"  top: 10%;\r\n" + 
		"  left: 600%;\r\n" + 
		"  transform: translate(-50%, -50%);\r\n" + 
		"  color: black;\r\n" + 
		"		}\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"</style>\r\n" + 
		"</head>\r\n" + 
		"<body>\r\n" + 
		"<div class=\"plank-in-top\">	\r\n" + 
		"					 <ul class=\"menue\">\r\n" + 
		"					 <li><a href=\"ForHome\">Home</a></li>  \r\n" + 
		"						<li><a href=\"about.html\">About </a></li>\r\n" + 
		"						<li><a href=\"ForOpenProfile\">Profile</a></li>\r\n" + 
		"						<li><a href=\"#footer\">Contact</a></li>\r\n" + 
		"					  </ul>\r\n" + 
		"  				<form action=\"logIn.html\" >\r\n" + 
		"						<input type=\"submit\" value=\"Log in\" >\r\n" + 
		"					</form>\r\n" + 
		"\r\n" + 
		"	 			<br><br>	\r\n" + 
		"  		 \r\n" + 
		" 	</div>\r\n" + 
		"	  <div class=\"ForAll\">\r\n" + 
		"			  <div class=\"welcome-world\">\r\n" + 
		"					<h1> Hobby World  </h1>\r\n" + 
		"			 		<h2>Explore new experiences... </h2>\r\n" + 
		"			   </div>\r\n" + 
		"			   </div> \r\n" + 
		"   		\r\n" + 
		"\r\n" + 
		"  	  <!-- here start the log in-->\r\n" + 
		"  	  \r\n" + 
		"\r\n" + 
		"    		<!-- For the 4 courses -->\r\n" + 
		" <div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"ArtCounter\">\r\n" + 
		"      <img src=\"https://media.istockphoto.com/photos/happy-friends-having-fun-in-the-park-with-multicolored-smoke-bombs-picture-id1317470958?b=1&k=20&m=1317470958&s=170667a&w=0&h=NKiue9llLNC1zU5aE30k59ltI9PcUA7-bhwYGDuEU7Q=\" alt=\"Cinque Terre\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Art</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"<div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"SportCounter\">\r\n" + 
		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/69592/400_5ce51ee86be74.jpg\" alt=\"Forest\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Sport</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		"<div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"CookingCounter\">\r\n" + 
		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/162457/400_5cea4d0004800.jpg\" alt=\"Northern Lights\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Cooking</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		"<div class=\"responsive\">\r\n" + 
		"  <div class=\"gallery\">\r\n" + 
		"    <a target=\"_blank\" href=\"RedirectForPastry\">\r\n" + 
		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/78444/400_5ce56e5e117c7.jpg\" alt=\"Mountains\" width=\"600\" height=\"400\">\r\n" + 
		"    </a>\r\n" + 
		"    <div class=\"desc\"><h3>Pastry</h3></div>\r\n" + 
		"  </div>\r\n" + 
		"</div>\r\n" + 
		"\r\n" + 
		" \r\n" + 
		"   \r\n" + 
		"\r\n" + 
		"<!-- the trend and new text and box-->\r\n" + 
		"	 	<div class=\"Trend\">\r\n" + 
		"	 		<h1>Recommended for you </h1>\r\n" + 
		"	 	</div>\r\n" + 
		"	\r\n" + 
		"	\r\n" + 
		"	     <div class=biking-image>  \r\n" + 
		"		  <div class=\"text-biking\">\r\n" + 
		"			<h3>Sport: Biking</h3>\r\n" + 
		"			<h3> Date: 25/3/2021</h3> \r\n" + 
		"			<a href=\"bikingMore.html\" class=\"button\">More</a>				\r\n" + 
		"	      </div>\r\n" + 
		"	    </div>\r\n" + 
		"	\r\n" + 
		"	  	<div class=\"newCourse\">\r\n" + 
		"	 		<h1> New courses </h1>\r\n" + 
		"	 	</div>\r\n" + 
		"	 	<div class=\"w3-content w3-section\" style=\"max-width:500px\">\r\n"+
		"<a href=\"swimMore.html\">  <img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/18427/400_5cdb9f449ce30.jpg\" style=\"width:100%\"></a>\r\n" + 
		" <a href=\"lazaniaMore.html\"> <img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/3384694/400_5e1bded6482fe.jpg\" style=\"width:100%\"></a>\r\n" + 
		"  <a href=\"crochetMore.html\" ><img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/3102726/400_5e0fb8ece3c71.jpg\" style=\"width:100%\"></a>" + 
		  
		"</div>\r\n" + 
		"\r\n" + 
		"<script>\r\n" + 
		"var myIndex = 0;\r\n" + 
		"carousel();\r\n" + 
		"\r\n" + 
		"function carousel() {\r\n" + 
		"  var i;\r\n" + 
		"  var x = document.getElementsByClassName(\"mySlides\");\r\n" + 
		"  for (i = 0; i < x.length; i++) {\r\n" + 
		"    x[i].style.display = \"none\";  \r\n" + 
		"  }\r\n" + 
		"  myIndex++;\r\n" + 
		"  if (myIndex > x.length) {myIndex = 1}    \r\n" + 
		"  x[myIndex-1].style.display = \"block\";  \r\n" + 
		"  setTimeout(carousel, 2000); // Change image every 2 seconds\r\n" + 
		"}\r\n" + 
		"</script>\r\n" + 
		"\r\n" + 
		"\r\n" + 
		"	     <!-- For the footer contact-->\r\n" + 
		"	   \r\n" + 
		"      <br>\r\n" + 
		"	  <div id=\"footer\">\r\n" + 
		"	  	<h1>Contact us</h1><hr> <br>\r\n" + 
		"	  	\r\n" + 
		"     \r\n" + 
		"      \r\n" + 
		"<div class=\"comment\">\r\n" + 
		"  <form action=\"#\">\r\n" + 
		"    <label for=\"fname\">First Name</label>\r\n" + 
		"    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your first name\"><br>\r\n" + 
		"\r\n" + 
		"    <label for=\"lname\">Last Name</label>\r\n" + 
		"    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name\"><br>\r\n" + 
		"\r\n" + 
		"    <label for=\"subject\"> your comment</label>\r\n" + 
		"    <textarea id=\"subject\" name=\"subject\" placeholder=\"Write ...\" style=\"height:100px\"></textarea><br>\r\n" + 
		"\r\n" + 
		"    <input type=\"submit\" value=\"Submit\">\r\n" + 
		"  </form>\r\n" + 
		"</div>\r\n" + 
		"</div>\r\n" + 
		" </div>\r\n" + 
		"\r\n" + 
		"</body>\r\n" + 
		"</html>");
	
	
}
 else
      out.println("\r\n" + 
  		"<!DOCTYPE html>\r\n" + 
  		"<html>\r\n" + 
  		"<head>\r\n" + 
  		"<meta charset=\"ISO-8859-1\">\r\n" + 
  		"<title>Home</title>\r\n" + 
  		"<style>\r\n" + 
  		"*{\r\n" + 
  		"	margin: 0;\r\n" + 
  		"	padding: 0;\r\n" + 
  		"	\r\n" + 
  		"   }\r\n" + 
  		"\r\n" + 
  		".ForAll{\r\n" + 
  		"	background: url(https://toggl.com/blog/wp-content/uploads/2018/10/productive-hobbies.jpg);\r\n" + 
  		"	height: 90vh;\r\n" + 
  		"	position: relative;\r\n" + 
  		"	background-size: cover;\r\n" + 
  		"	background-position: top ;\r\n" + 
  		"	background-repeat: no-repeat;\r\n" + 
  		"	margin-top:1%;\r\n" + 
  		"\r\n" + 
  		"}\r\n" + 
  		".mySlides {display:none;\r\n" + 
  		"margin-left: 5%;}\r\n" + 
  		".Trend{\r\n" + 
  		"margin-top: 25%;\r\n" + 
  		"margin-left: 1%;\r\n" + 
  		"\r\n" + 
  		"}\r\n" + 
  		".newCourse{\r\n" + 
  		"margin-top: 5%;\r\n" + 
  		"margin-left: 1%;\r\n" + 
  		"\r\n" + 
  		"}\r\n" + 
  		".plank-in-top{\r\n" + 
  		"	background-color: white;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"div.gallery {\r\n" + 
  		"  border: 1px solid #ccc;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"div.gallery:hover {\r\n" + 
  		"  border: 1px solid #777;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"div.gallery img {\r\n" + 
  		"  width: 100%;\r\n" + 
  		"  height: auto;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"div.desc {\r\n" + 
  		"  padding: 15px;\r\n" + 
  		"  text-align: center;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"* {\r\n" + 
  		"  box-sizing: border-box;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		".responsive {\r\n" + 
  		"  padding: 0 6px;\r\n" + 
  		"  float: left;\r\n" + 
  		"  width: 17.99999%;\r\n" + 
  		"  padding-top:1%;\r\n"
  		+ "margin-left:6%;" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"@media only screen and (max-width: 700px) {\r\n" + 
  		"  .responsive {\r\n" + 
  		"    width: 49.99999%;\r\n" + 
  		"    margin: 6px 0;\r\n" + 
  		"  }\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"@media only screen and (max-width: 500px) {\r\n" + 
  		"  .responsive {\r\n" + 
  		"    width: 100%;\r\n" + 
  		"  }\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		".clearfix:after {\r\n" + 
  		"  content: \"\";\r\n" + 
  		"  display: table;\r\n" + 
  		"  clear: both;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		".menue{\r\n" + 
  		"	float: left;\r\n" + 
  		"	margin-top: 20px;\r\n" + 
  		"	padding-right: 10px;\r\n" + 
  		"	margin-left: 4%;\r\n" + 
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
  		".welcome-world{\r\n" + 
  		"	position: absolute;\r\n" + 
  		"	margin: 16% 37%;   /*to move the world HOBY WORLD */\r\n" + 
  		"	text-align: center;\r\n" + 
  		"	color: DarkSlateBlue;\r\n" + 
  		"	pading-left: 50%;\r\n" + 
  		"\r\n" + 
  		"}\r\n" + 
  		".welcome-world h1{\r\n" + 
  		"	text-transform: uppercase;\r\n" + 
  		"	font-size: 60px;\r\n" + 
  		"	text-shadow: 1px 1px 2px SeaShell, 0 0 25px SeaShell, 0 0 5px black;\r\n" + 
  		"    font-family: Bradley Hand, cursive;	  	\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		".welcome-world h2{\r\n" + 
  		"	text-align: left;					\r\n" + 
  		"	font-size: 30px;\r\n" + 
  		"    font-family: Bradley Hand, cursive;\r\n" + 
  		"    \r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"input[type=text] {    /*For the search*/\r\n" + 
  		"   background-color: white;\r\n" + 
  		"    padding: 10px 20px;\r\n" + 
  		"    margin: 8px 1px ;\r\n" + 
  		"    border: 1%;\r\n" + 
  		"    cursor: pointer;\r\n" + 
  		"    width: 300px;\r\n" + 
  		"    float: left;\r\n" + 
  		"    color: black;\r\n" + 
  		"\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"input[type=submit] {\r\n" + 
  		"   background-color: white;\r\n" + 
  		"    padding: 10px 20px;\r\n" + 
  		"    margin: 8px 1px ;\r\n" + 
  		"    border: 1%;\r\n" + 
  		"    cursor: pointer;\r\n" + 
  		"    width: 130px;\r\n" + 
  		"    float: right;\r\n" + 
  		"    margin-right: 5%;\r\n" + 
  		"    color: black;\r\n" + 
  		"  background-position: 5px 5px; \r\n" + 
  		"  \r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"input[type=submit]:hover {\r\n" + 
  		"  background-color: blue;\r\n" + 
  		"  color:white;\r\n" + 
  		"  opacity: 0.8;\r\n" + 
  		"}\r\n" + 
  		".button {\r\n" + 
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
  		"\r\n" + 
  		"			  \r\n" + 
  		"\r\n" + 
  		".image{\r\n" + 
  		" border: 2px solid LightGray;\r\n" + 
  		" box-sizing: content-box;  \r\n" + 
  		" width: 550px;\r\n" + 
  		" height: 250px;\r\n" + 
  		" margin-left: 2%;\r\n" + 
  		" background-color: pink;\r\n" + 
  		"	}\r\n" + 
  		".flowers{\r\n" + 
  		"line-height: 1;\r\n" + 
  		"margin-left: 50%;\r\n" + 
  		"margin-top: 20%;\r\n" + 
  		"font-size:30px;\r\n" + 
  		"top: 10%;\r\n" + 
  		"left: 600%;\r\n" + 
  		"transform: translate(-50%, -50%);\r\n" + 
  		"color: black;\r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"/**the style for contact**/	\r\n" + 
  		"\r\n" + 
  		"#footer{\r\n" + 
  		"	color: white;\r\n" + 
  		"	font-size: 20px;\r\n" + 
  		"	font-style: initial;\r\n" + 
  		"	background : #77D6F2 ;\r\n" + 
  		"	padding: 20px;\r\n" + 
  		"	\r\n" + 
  		"}\r\n" + 
  		"#footer h1{\r\n" + 
  		"	color: white;\r\n" + 
  		"	margin-left: 45%;\r\n" + 
  		"}	\r\n" + 
  		"\r\n" + 
  		"#footer input[type=text], textarea {\r\n" + 
  		"  width: 100%;\r\n" + 
  		"  padding: 3px;\r\n" + 
  		"  border: 1px solid white;\r\n" + 
  		"  border-radius: 4px;\r\n" + 
  		"  box-sizing: border-box;\r\n" + 
  		" height: 40px;\r\n" + 
  		" \r\n" + 
  		"}\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		".comment {\r\n" + 
  		"  border-radius: 5px;\r\n" + 
  		"  border: 2px solid black;\r\n" + 
  		"  padding: 20px;\r\n" + 
  		"  width: 700px;\r\n" + 
  		"  margin-left: 150px;\r\n" + 
  		"   height: 350px;\r\n" + 
  		"   \r\n" + 
  		"}\r\n" + 
  		" .steak-image{\r\n" + 
  		"  		  border: 2px solid LightGray;\r\n" + 
  		" 		  box-sizing: content-box;  \r\n" + 
  		"	  width: 600px;\r\n" + 
  		"	  height: 8px;\r\n" + 
  		"	  padding: 150px; \r\n" + 
  		" 	  margin-top: 1%;\r\n" + 
  		"	  background: url(data:image/jpeg;base64,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);\r\n" + 
  		"	  background-repeat: no-repeat;\r\n" + 
  		"	  background-size: 350px 350px; \r\n" + 
  		"	  flaot:left;\r\n" + 
  		"	margin-left:1%;\r\n" + 
  		" }\r\n" + 
  		" \r\n" + 
  		" .text-steak{\r\n" + 
  		" 		  line-height: 0.9;\r\n" + 
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
  		"\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"</style>\r\n" + 
  		"</head>\r\n" + 
  		"<body>\r\n" + 
  		"<div class=\"plank-in-top\">	\r\n" + 
  		"					 <ul class=\"menue\">\r\n" + 
  		"					 <li><a href=\"ForHome\">Home</a></li>  \r\n" + 
  		"						<li><a href=\"about.html\">About </a></li>\r\n" + 
  		"						<li><a href=\"ForOpenProfile\">Profile</a></li>\r\n" + 
  		"						<li><a href=\"#footer\">Contact</a></li>\r\n" + 
  		"					  </ul>\r\n" + 
  		"  				<form action=\"logIn.html\" >\r\n" + 
  		"						<input type=\"submit\" value=\"Log in\" >\r\n" + 
  		"					</form>\r\n" + 
  		"\r\n" + 
  		"	 			<br><br>	\r\n" + 
  		"  		 \r\n" + 
  		" 	</div>\r\n" + 
  		"	  <div class=\"ForAll\">\r\n" + 
  		"			  <div class=\"welcome-world\">\r\n" + 
  		"					<h1> Hobby World  </h1>\r\n" + 
  		"			 		<h2>Explore new experiences... </h2>\r\n" + 
  		"			   </div>\r\n" + 
  		"			   </div> \r\n" + 
  		"   		\r\n" + 
  		"\r\n" + 
  		"  	  <!-- here start the log in-->\r\n" + 
  		"  	  \r\n" + 
  		"\r\n" + 
  		"    		<!-- For the 4 courses -->\r\n" + 
  		"<div class=\"responsive\">\r\n" + 
  		"  <div class=\"gallery\">\r\n" + 
  		"    <a target=\"_blank\" href=\"ArtCounter\">\r\n" + 
  		"      <img src=\"https://media.istockphoto.com/photos/happy-friends-having-fun-in-the-park-with-multicolored-smoke-bombs-picture-id1317470958?b=1&k=20&m=1317470958&s=170667a&w=0&h=NKiue9llLNC1zU5aE30k59ltI9PcUA7-bhwYGDuEU7Q=\" alt=\"Cinque Terre\" width=\"600\" height=\"400\">\r\n" + 
  		"    </a>\r\n" + 
  		"    <div class=\"desc\"><h3>Art</h3></div>\r\n" + 
  		"  </div>\r\n" + 
  		"</div>\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"<div class=\"responsive\">\r\n" + 
  		"  <div class=\"gallery\">\r\n" + 
  		"    <a target=\"_blank\" href=\"SportCounter\">\r\n" + 
  		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/69592/400_5ce51ee86be74.jpg\" alt=\"Forest\" width=\"600\" height=\"400\">\r\n" + 
  		"    </a>\r\n" + 
  		"    <div class=\"desc\"><h3>Sport</h3></div>\r\n" + 
  		"  </div>\r\n" + 
  		"</div>\r\n" + 
  		"\r\n" + 
  		"<div class=\"responsive\">\r\n" + 
  		"  <div class=\"gallery\">\r\n" + 
  		"    <a target=\"_blank\" href=\"CookingCounter\">\r\n" + 
  		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/162457/400_5cea4d0004800.jpg\" alt=\"Northern Lights\" width=\"600\" height=\"400\">\r\n" + 
  		"    </a>\r\n" + 
  		"    <div class=\"desc\"><h3>Cooking</h3></div>\r\n" + 
  		"  </div>\r\n" + 
  		"</div>\r\n" + 
  		"\r\n" + 
  		"<div class=\"responsive\">\r\n" + 
  		"  <div class=\"gallery\">\r\n" + 
  		"    <a target=\"_blank\" href=\"RedirectForPastry\">\r\n" + 
  		"      <img src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/78444/400_5ce56e5e117c7.jpg\" alt=\"Mountains\" width=\"600\" height=\"400\">\r\n" + 
  		"    </a>\r\n" + 
  		"    <div class=\"desc\"><h3>Pastry</h3></div>\r\n" + 
  		"  </div>\r\n" + 
  		"</div>\r\n" + 
  		" \r\n" + 
  		"   \r\n" + 
  		"\r\n" + 
  		"<!-- the trend and new text and box-->\r\n" + 
  		"	 	<div class=\"Trend\">\r\n" + 
  		"	 		<h1>Recommended for you </h1>\r\n" + 
  		"	 	</div>\r\n" + 
  		"	\r\n" + 
  		"	\r\n" + 
  		"	     <div class=steak-image>  \r\n" + 
  		"		  <div class=\"text-steak\">\r\n" + 
  		"			<h3>Recipe: Steak</h3>\r\n" + 
  		"			<h3> Date: 20/4/2021</h3> \r\n" + 
  		"			<a href=\"steakMore.html\" class=\"button\">More</a>	\r\n" + 
  		"	      </div>\r\n" + 
  		"	    </div>\r\n" + 
  		"	     \r\n" + 
  		"	\r\n" + 
  		"	  	<div class=\"newCourse\">\r\n" + 
  		"	 		<h1>New courses </h1>\r\n" + 
  		"	 	</div>\r\n" + 
  		"	 	<div class=\"w3-content w3-section\" style=\"max-width:500px\">\r\n"+"<a href=\"swimMore.html\">  <img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/18427/400_5cdb9f449ce30.jpg\" style=\"width:100%\"></a>\r\n" + 
  		" <a href=\"lazaniaMore.html\"> <img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/3384694/400_5e1bded6482fe.jpg\" style=\"width:100%\"></a>\r\n" + 
  		"  <a href=\"crochetMore.html\" ><img class=\"mySlides\" src=\"https://static1.s123-cdn-static-a.com/ready_uploads/media/3102726/400_5e0fb8ece3c71.jpg\" style=\"width:100%\"></a>" + 
  		"  " + 
  		"</div>\r\n" + 
  		"\r\n" + 
  		"<script>\r\n" + 
  		"var myIndex = 0;\r\n" + 
  		"carousel();\r\n" + 
  		"\r\n" + 
  		"function carousel() {\r\n" + 
  		"  var i;\r\n" + 
  		"  var x = document.getElementsByClassName(\"mySlides\");\r\n" + 
  		"  for (i = 0; i < x.length; i++) {\r\n" + 
  		"    x[i].style.display = \"none\";  \r\n" + 
  		"  }\r\n" + 
  		"  myIndex++;\r\n" + 
  		"  if (myIndex > x.length) {myIndex = 1}    \r\n" + 
  		"  x[myIndex-1].style.display = \"block\";  \r\n" + 
  		"  setTimeout(carousel, 2000); // Change image every 2 seconds\r\n" + 
  		"}\r\n" + 
  		"</script>\r\n" + 
  		"\r\n" + 
  		"\r\n" + 
  		"	     <!-- For the footer contact-->\r\n" + 
  		"	   \r\n" + 
  		"      <br>\r\n" + 
  		"	  <div id=\"footer\">\r\n" + 
  		"	  	<h1>Contact us</h1><hr> <br>\r\n" + 
  		"	  	\r\n" + 
  		"     \r\n" + 
  		"      \r\n" + 
  		"<div class=\"comment\">\r\n" + 
  		"  <form action=\"#\">\r\n" + 
  		"    <label for=\"fname\">First Name</label>\r\n" + 
  		"    <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your first name\"><br>\r\n" + 
  		"\r\n" + 
  		"    <label for=\"lname\">Last Name</label>\r\n" + 
  		"    <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name\"><br>\r\n" + 
  		"\r\n" + 
  		"    <label for=\"subject\"> your comment</label>\r\n" + 
  		"    <textarea id=\"subject\" name=\"subject\" placeholder=\"Write ...\" style=\"height:100px\"></textarea><br>\r\n" + 
  		"\r\n" + 
  		"    <input type=\"submit\" value=\"Submit\">\r\n" + 
  		"  </form>\r\n" + 
  		"</div>\r\n" + 
  		"</div>\r\n" + 
  		" </div>\r\n" + 
  		"\r\n" + 
  		"</body>\r\n" + 
  		"</html>");
	
	}
		

}

	




