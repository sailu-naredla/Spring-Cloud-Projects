/**
 * 
 */
package com.customer.dto;

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
public class Address {
	
	private Long addressId;
    private String type;
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String zip;

}
