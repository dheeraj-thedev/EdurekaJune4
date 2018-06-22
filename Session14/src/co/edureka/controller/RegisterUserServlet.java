package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.User;

@WebServlet({ "/RegisterUserServlet", "/Register" })
public class RegisterUserServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		User user = new User();
		
		// Extracting data from Request
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");	
		
		System.out.println(user.name+" : "+user.email+" : "+user.password);
		
		// Send response to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Hibernate Code
		Configuration config = new Configuration();
		config.configure();
		
		SessionFactory factory = config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(user);
		
		transaction.commit();
		
		out.print(user.name+" Registered Successfully !!");
	}

}
