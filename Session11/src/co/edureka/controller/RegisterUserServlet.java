package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.JDBCHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterUser", "/Register" })
public class RegisterUserServlet extends HttpServlet {

	// constructor -> executed only once
	public void init(ServletConfig config) throws ServletException {
		System.out.println("--init executed--");
	}

	
	// destructor -> executed only once
	public void destroy() {
		System.out.println("--destroy executed--");
	}

	
	// service -> to handle requests from clients and share back the response..
	// can handle request of any type i.e. GET/POST/etc..
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("--service executed--");
		
		// Create an Object to hold the data from Request
		User user = new User();
		
		// Extracting data from Request
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");	
		
		System.out.println(user.name+" : "+user.email+" : "+user.password);
		
		// Send response to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		
		if(!user.email.isEmpty() && !user.password.isEmpty()){
			int i = helper.registerUser(user);
			if(i>0){
				out.print(user.name+ " Registered Successfully...");
			}else{
				out.print(user.name+ " Not Registered Successfully...");
			}
		
		}else{
			out.print("Enter Details First !!");
		}
		
		helper.closeConnection();
		
		
	}

}
