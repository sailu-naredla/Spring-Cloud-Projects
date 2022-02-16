/**
 * 
 */
package com.customer.service;

import org.springframework.stereotype.Service;

import com.customer.dto.CustomerResponse;
import com.customer.entity.Customer;

/**
 * @author snaredla
 *
 */
@Service
public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	
	public CustomerResponse getCustomer(Long userId);

}
