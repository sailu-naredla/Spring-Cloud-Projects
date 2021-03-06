/**
 * 
 */
package com.address.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author snaredla
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	
	 @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String type;
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String zip;
	    

}
