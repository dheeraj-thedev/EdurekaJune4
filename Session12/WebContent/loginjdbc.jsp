<%@page import="co.edureka.db.JDBCHelper"%>
<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

	<%
		User user = new User();
	
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		
		if(helper.loginUser(user)){
			out.print("Welcome User !!");
		}else{
			out.print("Invalid Credentials !!");
		}
		
		helper.closeConnection();
		
	%>

</body>
</html>