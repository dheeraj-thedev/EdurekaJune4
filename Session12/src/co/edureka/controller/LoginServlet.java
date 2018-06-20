package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(email.equals("admin@example.com") && password.equals("pass123")){
			out.print("Welcome, Admin<br/>");
			out.print("Its: "+new Date());
		}else{
			out.print("<b>Invalid Credentials !!<b>");
		}
		
	}

}
