/**
 * 
 */
package com.address.service;

import org.springframework.stereotype.Service;

import com.address.entity.Address;

/**
 * @author snaredla
 *
 */
@Service
public interface AddressService {
	
	public Address saveAddress(Address address);
	
	public Address getAddressById(Long addressId);

}
