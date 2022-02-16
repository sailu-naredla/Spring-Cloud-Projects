/**
 * 
 */
package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.CustomerResponse;
import com.customer.entity.Customer;
import com.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author snaredla
 *
 */
@Slf4j
@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/")
    public Customer saveUser(@RequestBody Customer customer) {
		log.info("Inside saveUser of CustomerController");
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public CustomerResponse getCustomer(@PathVariable("id") Long customerId) {
    	log.info("Inside getCustomer of CustomerController");
        return customerService.getCustomer(customerId);
    }
	
}
