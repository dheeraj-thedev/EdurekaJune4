package co.edureka;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path; // Java API's for Restful Web Services
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//import org.glassfish.jersey.servlet.ServletContainer;

@Path("/hello")
public class Hello { // Web Service

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayStringHello(){ // Web Methods
		String str = "This is Awesome !! Its "+new Date();
		return str;  // Data returned as Text
	} 
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){
		String str = "<?xml version='1.0' encoding='UTF-8'><message>This is Awesome !! Its "+new Date()+"</message>";
		return str; // Data returned as XML
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		String str = "<html><body><h3>This is Awesome !! Its "+new Date()+"</h3></body></html>";
		return str; // Data returned as HTML
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		String str = "{ \"name\":\"John\", \"age\":31, \"city\":\"New York\" }";
		return str; // Data returned as JSON
	}
	
}
