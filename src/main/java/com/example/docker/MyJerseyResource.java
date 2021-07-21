package com.example.docker;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/main")
public class MyJerseyResource {

	/**
	 * -----------------------------------------------------------------
	 * URL: http://localhost:8080/main/endpoint
	 * -----------------------------------------------------------------
	 */
	@GET
	@Path("/endpoint")
	public String fetchString_sendVoid() {
		return "From GET request :: Simple request";
	}
	
}
