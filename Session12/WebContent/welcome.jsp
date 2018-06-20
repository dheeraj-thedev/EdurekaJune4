<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<b><h3>Welcome Home, Dear Admin</h3></b>
	
	<%
		
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" "+ck.getValue()+" "+ck.getPath()+"<br/>");
		}*/
		
		/* String name = request.getParameter("name");
		String age = request.getParameter("age"); */
		
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		String name1 = (String)pageContext.getAttribute("keyName",PageContext.SESSION_SCOPE);
	
		//session.invalidate(); // Clear the data in session
		
	%>
	<b>Session Data</b>
	<br/>
	<h3>Name: <%= name %></h3>
	<h3>Age: <%= age %></h3>
	
</body>
</html>