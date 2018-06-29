<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Restful Service Demo</title>
</head>
<body>
	<h3>Welcome to Jersey REST Demo</h3>
	
	<%
		// Declare this page as a client i.e. web service consumer
		ClientConfig con = new ClientConfig();
		Client client = ClientBuilder.newClient(con);
		
		// To Send a Request to the Web Service 								// Endpoint
		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session19A"));
		
							//  /rest/hello
		String plainRes = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);							
		String htmlRes = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xmlRes = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
		String jsonRes = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
								
	%>
	
	<br/>
	<h3>Plain Response</h3>
	<%= plainRes %>
	
	<h3>HTML Response</h3>
	<%= htmlRes %>
	
	<h3>XML Response</h3>
	<%= xmlRes %>
	
	<h3>JSON Response</h3>
	<%= jsonRes %>
	
</body>
</html>