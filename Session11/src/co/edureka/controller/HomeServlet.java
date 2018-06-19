package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Send response to the client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String dateTimeStamp = new Date().toString();
		
		out.print("Welcome Home !! Its: "+dateTimeStamp+"<br/>");
		
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		// Reading the data from Request
		/*String name = request.getParameter("name");
		String age = request.getParameter("age");*/
		
		HttpSession session = request.getSession();
		
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		out.print("Data: "+name+" | "+age);
		
	}

}
