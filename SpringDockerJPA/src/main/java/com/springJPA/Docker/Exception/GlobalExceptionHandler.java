package com.springJPA.Docker.Exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	public ResponseEntity<?> CustomerAlreadyExistsException(CustomerAlreadyExistsException ex,WebRequest request)
	{
		ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
	}
}
