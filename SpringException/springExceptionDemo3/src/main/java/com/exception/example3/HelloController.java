package com.exception.example3;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	

	@RequestMapping("/api/accounts/{accountId}")
	public ResponseEntity<Account> getAccounts(@PathVariable("accountId") String accountId) throws ResourceNotFoundException	
	{
		Account account = new Account();
		account.setAccountId(accountId);
		account.setName("Account Exception");
		
		if(accountId.equals("1"))
		{
			System.out.println("Hello");
			throw new ResourceNotFoundException("Resource Not Found!");
			
		}
		
	
		
		return new ResponseEntity<Account> (account,HttpStatus.OK);
	}
}
