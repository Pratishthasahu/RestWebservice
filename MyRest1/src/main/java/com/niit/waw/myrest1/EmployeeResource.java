package com.niit.waw.myrest1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("employee")
public class EmployeeResource {
	@GET
	@Path("{empno}")
	@Produces("application/json")
	public String getJson(@PathParam("empno") int empno)
	{
		switch(empno)
		{
		case 1:return "{'name':'John Snow','age':28}";
		
		case 2:return "{'name':'Peter Norton','age':34}";
		
		default:return "{'name':'Jack of All','age':18}";
		}
	}
	
}
