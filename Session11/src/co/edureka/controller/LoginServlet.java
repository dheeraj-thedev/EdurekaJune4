package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			
			String name = "John Watson";
			int age = 30;
			
			// Share the data among Servlets.
			// Session Tracking !!
			
			//1. Cookies
			/*Cookie ck1 = new Cookie("keyName", name);
			Cookie ck2 = new Cookie("keyAge", String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			
			out.print("<html><body><h3>Welcome User !!</h3><a href='Welcome'>Enter Home</a></body></html>");*/
			
			//2. URL ReWriting
			/*String url = "Welcome?name="+name+"&age="+age;
			
			out.print("<html><body><h3>Welcome User !!</h3><a href='"+url+"'>Enter Home</a></body></html>");
			*/
			
			//3. HttpSession
			/*HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			out.print("<html><body><h3>Welcome User !!</h3><a href='Welcome'>Enter Home</a></body></html>");*/
			
			//4. Hidden Form Fields
			String form = "<form action='Welcome' method = 'post'>"
					+ "<input type='hidden' name='txtName' value='"+name+"'/>"
					+ "<input type='hidden' name='txtAge' value='"+age+"'/>"
					+ "<input type='submit' value='Enter Home'/>"
					+ "</form>";
			out.print(form);
		}else{
			out.print("Login Failed !!");
			response.sendRedirect("https://www.google.in");
		}
		
	}

}
