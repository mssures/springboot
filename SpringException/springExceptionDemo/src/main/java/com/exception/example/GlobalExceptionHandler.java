package com.exception.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Object> handleException(IllegalArgumentException e)
	{
		return new ResponseEntity<Object>("illegal arg exception in global",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalStateException.class)
	public ResponseEntity<Object> handleException(IllegalStateException e)
	{
		return new ResponseEntity<Object>("illegal state exception in global",HttpStatus.BAD_REQUEST);
	}
}
