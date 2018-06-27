<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// Expecting a number from client request
	String number = request.getParameter("number");

	try{
		// converting String to int
		int num = Integer.parseInt(number);
		
		// Write some JDBC Code and fetch the data from Table and show it back to the user
		
		// Respnod back client with a complete Table of a number
		for(int i=1;i<=10;i++){
			out.println("<i><b>"+num+" "+i+"'s are "+(num*i)+"<b><i><br/>");
		}
		
	}catch(Exception e){
		out.print("Please Enter Correct Number !!");
	}

%>