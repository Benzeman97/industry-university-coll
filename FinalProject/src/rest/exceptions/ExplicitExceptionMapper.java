package com.benz.uni.rest.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.benz.rest.entity.ErrorMessage;

@Provider
public class ExplicitExceptionMapper implements ExceptionMapper<ExplicitException>{

	@Override
	public Response toResponse(ExplicitException ex) {
		ErrorMessage error = new ErrorMessage(ex.getMessage(),404,"www.wso2.com");
		return Response.status(Status.NOT_FOUND).entity(error).build();
	}

}
