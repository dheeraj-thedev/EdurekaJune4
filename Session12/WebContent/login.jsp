<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<h3>Hello, ${param.txtEmail} </h3>

	<%
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
	
		if(email.equals("admin@example.com") && password.equals("pass123")){
			out.print("Welcome Admin !!<br/>");
			
			String name = "John Watson";
			int age = 30;
			
			// Session Tracking
			// 1. Cookies
			/*Cookie ck1 = new Cookie("keyName",name);
			Cookie ck2 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			//out.print("<a href='welcome.jsp'>Enter Home</a><br/>");
			
			//2. URL-ReWriting
			//out.print("<a href='welcome.jsp?name="+name+"&age="+age+"'>Enter Home</a><br/>");
			
			//3. Hidden Form Fields -> Try out
			
			//4. HTTP Session
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			
			//5. PageContext
			pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE);
			
			out.print("<a href='welcome.jsp'>Enter Home</a><br/>");
	%>
			<jsp:forward page="welcome.jsp"></jsp:forward>
	<%		
			
		}else{
			out.print("Invalid Credentials !!<br/>");
			response.sendRedirect("https://www.google.co.in");
		}
	%>


</body>
</html>