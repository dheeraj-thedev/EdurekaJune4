package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter implements Filter {

	public void destroy() {
		System.out.println("--MyFilter destroy--");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// place your code here. This is a pre-processing code

		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.print("<i> >>Validating>> </i>");
		
		// As a part of pre-processing we are validating the data
		if(!email.isEmpty() && !password.isEmpty()){
			// pass the request along the filter chain
			chain.doFilter(request, response); // Request will now go to the Servlet
		}else{
			out.print("<b><i> Please Enter Details First </i></b>");
		}
		
		// As a part of post-processing we can manipulate the response
		out.print("<i> << Thank you !! <<  </i>");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("--MyFilter init--");
	}

}
