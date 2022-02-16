/**
 * 
 */
package com.address.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.entity.Address;
import com.address.service.AddressService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author snaredla
 *
 */
@Slf4j
@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/")
    public Address saveAddress(@RequestBody Address address) {
        log.info("Inside saveAddress method of AddressController");
        return  addressService.saveAddress(address);
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable("id") Long addressId) {
        log.info("Inside getAddressById method of AddressController");
        return addressService.getAddressById(addressId);
    }

}
