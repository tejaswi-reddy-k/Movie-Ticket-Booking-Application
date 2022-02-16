package com.movie.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.service.ICustomerService;

import com.movie.app.entity.*;
import com.movie.app.exceptions.CustomerNotFoundException;

@RestController
@Validated
public class CustomerController {
	
    @Autowired
    ICustomerService customerService;
	
    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer)
    {
    	return customerService.addCustomer(customer);
		
    }
    
    @PutMapping("/updatecustomer")  
    public Customer update(@RequestBody Customer customer) throws CustomerNotFoundException   
    {  
    	return customerService.updateCustomer(customer);
    }  
    
	@DeleteMapping("/remove/{customerId}")
	public void deletebyid(@PathVariable int customerId)
	{
		customerService.deleteCustomer(customerId);
	}
	
    @GetMapping("/customer/{customerId}")
    public Customer getCustomerbyId(@PathVariable int customerId) throws CustomerNotFoundException
    {
    	return customerService.viewCustomer(customerId);
    }
    
    
	@GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.viewAllCustomers();
    }
}
