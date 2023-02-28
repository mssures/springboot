package com.thymeleaf.crud.exception;

public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = -3977574237247850931L;

	public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String msg) {
        super(msg);
    }    
}
