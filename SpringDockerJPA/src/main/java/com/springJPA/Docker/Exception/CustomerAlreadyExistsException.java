package com.springJPA.Docker.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class CustomerAlreadyExistsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6928507426729925778L;

	private String message;
	
	public CustomerAlreadyExistsException() {}
	public CustomerAlreadyExistsException(String msg) {
		super(msg);
		this.message=msg;
	}
}
