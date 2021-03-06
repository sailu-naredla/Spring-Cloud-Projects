/**
 * 
 */
package com.address.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.entity.Address;
import com.address.repository.AddressRepository;
import com.address.service.AddressService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author snaredla
 *
 */
@Service
@Slf4j
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address saveAddress(Address address) {
		log.info("Inside saveAddres");
		return addressRepository.save(address);
	}

	@Override
	public Address getAddressById(Long addressId) {
		log.info("Inside getAddressById");
		return addressRepository.findByAddressId(addressId);
	}

}
