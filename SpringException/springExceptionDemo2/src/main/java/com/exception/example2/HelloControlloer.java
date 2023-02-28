package com.exception.example2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlloer {

	@RequestMapping("/api/accounts/{accountId}")
	public ResponseEntity<Account> getAccount(@PathVariable("accountId") String accountId)
	{
		Account account = new Account();
		account.setAccountId(accountId);
		account.setName("Account Exception");
		
		if(accountId.equals("1"))
		{
			throw new IllegalArgumentException();
		}
		if(accountId.equals("2"))
		{
			throw new IllegalStateException();
		}
		
		return new ResponseEntity<Account> (account,HttpStatus.OK);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<Object> handleException(IllegalArgumentException e)
	{
		return new ResponseEntity<Object>("Illegal argument exception",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalStateException.class)
	public ResponseEntity<Object> handleException(IllegalStateException e)
	{
		return new ResponseEntity<Object>("Illegal state exception",HttpStatus.BAD_REQUEST);
	}
}
