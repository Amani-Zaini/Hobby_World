import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sessionConfirmation")
public class sessionConfirmation extends HttpServlet {
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

	    response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("Frname");      
        HttpSession session=request.getSession();  
        session.setAttribute("Fname",n);
        
        String n2=request.getParameter("Lrname");
        HttpSession session2=request.getSession();  
        session2.setAttribute("Lname",n2);
        
        String n3=request.getParameter("Age");
        HttpSession session3=request.getSession();  
        session3.setAttribute("Age",n3);
        
        String n4=request.getParameter("emailSign");
        HttpSession session4=request.getSession();  
        session4.setAttribute("email",n4);
  
        
        
        out.println
        ("<HTML>\n" +
         "<HEAD><TITLE> Confirm the information </TITLE>"
         		+ "<style>"
         		+ "table {\r\n" + 
         		"  border-collapse: collapse;\r\n" + 
         		"  width: 50%;\r\n" + 
         		"  background-color:#FFB6C1;\r\n" + 
         		"  height:400px;\r\n" + 
         		"  text-align:center;\r\n" + 
         		"  color:white;\r\n"
         		+ "border: 2px solid black;"
         		+ "font-size:20px;" + 
         		"}"
         		+ "body{\r\n" + 
         		"background-color:  #FFF0F5; \r\n" + 
         		"font-family: Arial, Helvetica, sans-serif;\r\n" + 
         		"}"
         		+ "td {\r\n" + 
         		"    border: solid 2px black;\r\n" + 
         		"}"
         		+ "a{background-color: #DB7093;\r\n" + 
         		"  color: white;\r\n" + 
         		
         		"  padding: 15px 70px;\r\n"
         		
         		+ "margin-left:2%;"
         		 + 
         		"  text-align: center;\r\n" + 
         		"  text-decoration: none;\r\n" + 
         		"  display: inline-block;}"
         		+ "a:hover{background-color:#FFB6C1;"
         		+ "color:white;}"
         		+ "h2{margin-left:2%;}"
         		
         		
     
         		
         		+ "</style>"+"</HEAD>\n" +
         "<BODY>\n" +
         "<CENTER>\n"
         + "<br><br><br><br>" +
         
          
         "<table>\n" +
         "<tr  >\n" +
         "  <TH style =\"color:black; background-color:	#FFB6C1;\">Info Type<TH style =\"color:black;background-color:#FFB6C1;\">Value\n" +
         "<tr><td>First Name</td><td>"+session.getAttribute("Fname")+"</td></tr>"+
         "<tr><td>Last Nme</td><td>"+session.getAttribute("Lname")+"</td></tr>"+
         "<tr><td>Age</td><td>"+session.getAttribute("Age")+"</td></tr>"+
         "<tr><td>Email</td><td>"+session.getAttribute("email")+"</td></tr>"+	         
         "</table>\n"
         
         + "<br><br><br>"
         + "<H2  >Are all of your data correct ?</H2>"
         + "<br>" + 
         "         <strong><a href='logIn.html'>Yes</a>" + 
         "         <a href='signUp.html'>No</a><strong>"
         + "<br><br>"
          +"</CENTER>"+
         
         "</BODY></HTML>");     
     }	

}