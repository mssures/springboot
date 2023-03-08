package com.springJPA.Docker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springJPA.Docker.Exception.CustomerAlreadyExistsException;

@RestController
public class CustomerController {

	
	//private CustomerService customerService = new CustomerServiceImpl();
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable("id") Long id)
	{
		return customerService.getCustomer(id);
	}
		
	@PostMapping("/addCustomer")
	public String addCustomer(@RequestBody Customer customer)throws CustomerAlreadyExistsException
	{
		return customerService.addCustomer(customer);
	}
	
	@PostMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer)
	{
		return customerService.updateCustomer(customer);
	}
}
