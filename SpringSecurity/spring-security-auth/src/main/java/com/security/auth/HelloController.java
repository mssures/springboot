package com.security.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHelloAll()
	{
		return "hello everyone!";
	}
	
	@GetMapping("/user")
	public String sayHelloUser()
	{
		return "hello user";
	}
	
	@GetMapping("/admin")
	public String sayHelloAdmin()
	{
		return "hello admin";
	}
	
}
