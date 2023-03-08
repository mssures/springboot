package com.springJPA.Docker;

import org.springframework.stereotype.Service;

import com.springJPA.Docker.Exception.CustomerAlreadyExistsException;

@Service
public interface CustomerService {

	Customer getCustomer(Long id);
	String addCustomer(Customer customer)throws CustomerAlreadyExistsException;
	String updateCustomer(Customer customer);
}
