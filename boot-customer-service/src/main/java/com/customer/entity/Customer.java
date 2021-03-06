/**
 * 
 */
package com.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author snaredla
 *
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    private String name;
    private String email;
    private Long addressId;
    
    
}
