package com.springJPA.Docker;

import java.util.NoSuchElementException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springJPA.Docker.Exception.CustomerAlreadyExistsException;
import com.springJPA.Docker.Exception.NoSuchCustomerExistsException;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer getCustomer(Long id)
	{
		return customerRepository.findById(id).orElseThrow(
	            ()
	                -> new NoSuchElementException(
	                    "NO CUSTOMER PRESENT WITH ID = " + id));
	}
	@Override
	public String addCustomer(Customer customer)throws CustomerAlreadyExistsException
	{		
		Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
		if(existingCustomer==null)
		{
			customerRepository.save(customer);
			return "Customer added successfully";
		}
		else
			throw new CustomerAlreadyExistsException("Customer Already Exists!");
			
	}	
	@Override
	public String updateCustomer(Customer customer)
	{
		Customer existingCustomer = customerRepository.findById(customer.getId()).orElse(null);
		if(existingCustomer==null)
		{
			throw new NoSuchCustomerExistsException("No Customer exists!");
		}
		else
		{
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			customerRepository.save(existingCustomer);
			return "Record Updated Successfully";
		}
	}
}
