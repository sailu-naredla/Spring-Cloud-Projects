/**
 * 
 */
package com.address.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.address.entity.Address;

/**
 * @author snaredla
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
	Address findByAddressId(Long id);

}
