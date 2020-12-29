package test;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_XML)
	public String sayHello() {
		String resourse = "<? xml version='1.0' ?>"+
				"<hello> Hi shiv, this is hello fom xml <hello>";
		return resourse;
	}
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String sayHelloJSON() {
		String resourse = null;
		return resourse;
	}
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		String resourse = "<h1> Hi shiv, this is hello from html </h1>";
		return resourse;
	}
	
}
