package com.niit.waw.myrest1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey Plain";
	}
	
	@GET
	@Path("/xmlhello")
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello()
	{
		return "<?xml version=\"1.0\"?>"+"<hello> Hello Jersey" +"</hello>";
	}
	
	@GET
	@Path("/htmlhello")
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello() {
		return "<HTML>"+"<Title>"+"Hello Jersey"+"<Title>"+"<BODY><H1>"+"Hello Jersey Html"+"</h1></body>"+
					"</html>";
	}
}
