package com.benz.uni.rest.exceptions;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.benz.rest.entity.ErrorMessage;

public class ExplicitException extends Exception{
	
	
	private static final long serialVersionUID = -124948953240247741L;

	public ExplicitException(String message)
	{
		/*ErrorMessage error = new ErrorMessage(message,404,"www.benz.com");
		  Response res = Response.status(Status.NOT_FOUND).entity(error).build();
		  throw new WebApplicationException(res);*/
		super(message);
	}

}
