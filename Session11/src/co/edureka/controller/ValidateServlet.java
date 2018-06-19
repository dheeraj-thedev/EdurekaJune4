package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.model.User;


@WebServlet({ "/ValidateServlet", "/Validate" })
public class ValidateServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Create an Object to hold the data from Request
		User user = new User();
				
		// Extracting data from Request
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");	
				
		// Send response to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
				
		if(user.validate()){
			RequestDispatcher rd = request.getRequestDispatcher("Register");
			rd.forward(request, response);
			out.print("Request Forwarded"); // Response wont be shared with the user as request and response will be forwarded for next servlet
			
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("registeruser.html");
			rd.include(request, response);
			out.print("Please Enter Details First");
		}
		
		
	}

}
