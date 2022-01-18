

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CreateCookies")
public class CreateCookies extends HttpServlet 
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html"); 
    	PrintWriter out = response.getWriter();
    	
    	
    	String email = request.getParameter("email").trim();
    	String pass = request.getParameter("psw").trim();
    	
    	
    		Cookie cookie1 = new Cookie("email",email);
    		Cookie cookie2 = new Cookie("password",pass);
    		
    		response.addCookie(cookie1);
    		response.addCookie(cookie2);
    	
    		cookie1.setMaxAge(60*60*24*7);
    		cookie2.setMaxAge(60*60*24*7);
      		
    		response.sendRedirect("homeForMember");
    		
    		

        	
    	      }

	
    	
	       }

	

