/**
 * 
 */
package com.customer.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.customer.dto.Address;
import com.customer.dto.CustomerResponse;
import com.customer.entity.Customer;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author snaredla
 *
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
    private RestTemplate restTemplate;

	@Override
	public Customer saveCustomer(Customer customer) {
		log.info("Inside saveCustomer of CustomerServiceImpl");
		return customerRepository.save(customer);
	}

	@Override
	public CustomerResponse getCustomer(Long customerId) {
		log.info("Inside getCustomer of CustomerServiceImpl");
		CustomerResponse response = new CustomerResponse();
		
		Customer customer = customerRepository.findByCustomerId(customerId);
		
		Address address = restTemplate.getForObject("http://ADDRESS-SERVICE/addresses/" + customer.getAddressId(), Address.class);
		
		response.setCustomer(customer);
		response.setAddress(address);
		return response;
	}

}
