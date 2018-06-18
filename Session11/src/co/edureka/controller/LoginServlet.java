package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	// doPost -> to handle requests from clients and share back the response..
	// can handle request of type POST
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--doPost executed--");

		User user = new User();
		
		// Extracting data from Request
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");	
		
		System.out.println(user.email+" : "+user.password);
		
		// Send response to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean flag = helper.loginUser(user);
		
		if(flag){
			out.print("Login Success !!");
		}else{
			out.print("Login Failed !!");
		}
		
	}

}
