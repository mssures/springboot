package com.thymeleaf.crud.exception;

public class ResourceAlreadyExistsException extends Exception {

    private static final long serialVersionUID = 3688142257535830842L;

	public ResourceAlreadyExistsException() {
    }

    public ResourceAlreadyExistsException(String msg) {
        super(msg);
    }
}
