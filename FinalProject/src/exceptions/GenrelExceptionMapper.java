package com.benz.uni.rest.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.benz.rest.entity.ErrorMessage;


public class GenrelExceptionMapper implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable tx) {
		
		ErrorMessage error =new ErrorMessage(tx.getMessage(),500,"www.kelly.com");
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(error).build();
	}

}
