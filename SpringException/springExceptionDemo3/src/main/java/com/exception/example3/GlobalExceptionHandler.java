package com.exception.example3;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

 
  /*	
   @ExceptionHandler(ResourceNotFoundException.class) 
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    
   */
	
    	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex,WebRequest request)
	{
		 java.util.Date utilPackageDate  = new java.util.Date();
		 java.sql.Date sqlPackageDate    = new java.sql.Date(utilPackageDate.getTime());
		//ErrorDetails errorDetails = new ErrorDetails((java.sql.Date) new Date(), ex.getMessage(), request.getDescription(false));
		ErrorDetails errorDetails = new ErrorDetails(sqlPackageDate, ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
		
	}
	
}
