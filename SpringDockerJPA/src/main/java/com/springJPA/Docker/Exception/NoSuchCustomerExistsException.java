package com.springJPA.Docker.Exception;

public class NoSuchCustomerExistsException extends RuntimeException{

	/*
	 This exception can be thrown when the user tries to delete or update a customer record 
	 that doesn’t exist in the database.
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public NoSuchCustomerExistsException() {}
	public NoSuchCustomerExistsException(String msg) {
		super(msg);
		this.message=msg;
	}

	
	
	

}
