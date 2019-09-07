package com.benz.uni.rest.exceptions;

public class DataNotFoundException extends RuntimeException {


	private static final long serialVersionUID = 6089183959570860578L;
	
	public DataNotFoundException(String message)
	{
		super(message);
	}

	
}
