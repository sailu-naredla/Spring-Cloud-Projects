/**
 * 
 */
package com.customer.dto;

import com.customer.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author snaredla
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
	
	private Customer customer;
	
	private Address address;
	
}
