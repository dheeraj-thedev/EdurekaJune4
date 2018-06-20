<%@ page import="co.edureka.model.User"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorhandler.jsp" %> 
<%@ page isThreadSafe="true" %>   
<%@ include file="printdate.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	
	<h3>Welcome to JSP Demo<br/>
	<%-- Its : <%= new Date() %> --%></h3>
	
	<h4>Scriptlet Demo</h4>
	<%
		int a = 10;
		int b = 20;
		int c = a+b;
		
		out.print("c is: "+c+"<br/>");
		
		for(int i=1;i<=10;i++){
			out.print(5+" "+i+"'s are "+(5*i)+"<br/>");
		}
	
		// Declared age can be used below and not upwards
		int age = 20;
		
		if(age>18){
	%>	
		<i><h3>You Can Vote</h3></i>
	<%			
		}else{
		
	%>
		<b><h3>You Cannot Vote Yet !!</h3></b>		
	<%		
		}
	%>
	
	<h4>Declarative Demo</h4>
	<%!
		// can be used anywhere,below or up
		double pi = 3.14;
		
		double areaCircle(double radius){
			return pi*radius*radius;
		}
	
		int[] arr = {10,20,30,40,50};
	%>
	
	<jsp:include page="printdate.jsp"></jsp:include>
	
	Value of Pi is: <% out.print(pi); %>
	<br/>
	Area of Circle with radius 5.7 is: <% out.print(areaCircle(5.7)); %>
	<br/>
	
	<h4>Expression Demo</h4>
	Area of Circle with radius 7.7 is: <%= areaCircle(7.7)  %>
	<br/>
	<h3>arr[0] is: <%= arr[0] %></h3>
	
	<%
		// Creating an Object
		User uRef = new User();
		uRef.setName("John");
		uRef.setEmail("john@example.com");
		uRef.setPassword("pass123");
	
	%>
	<b>Reading Data from Object</b>
	<br/>
	<h3>Name is: <%= uRef.getName() %></h3>
	<h3>Email is: <%= uRef.getEmail() %></h3>
	<h3>Password is: <%= uRef.getPassword() %></h3>
	
	<jsp:useBean id="uRef1" class="co.edureka.model.User" />
	
	<jsp:setProperty property="name" name="uRef1" value="Jennie"/>
	<jsp:setProperty property="email" name="uRef1" value="jennie@example.com"/>
	<jsp:setProperty property="password" name="uRef1" value="pass123"/>
	
	<h3>Name is: <jsp:getProperty property="name" name="uRef1"/> </h3>
	<h3>Email is: <jsp:getProperty property="email" name="uRef1"/> </h3>
	<h3>Password is: <jsp:getProperty property="password" name="uRef1"/> </h3>
	
</body>
</html>