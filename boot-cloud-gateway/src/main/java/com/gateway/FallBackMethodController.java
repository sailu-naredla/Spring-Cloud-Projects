/**
 * 
 */
package com.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

/**
 * @author snaredla
 *
 */
@RestController
public class FallBackMethodController {
	
	@GetMapping("/customerServiceFallBack")
    public Mono<String> userServiceFallBackMethod() {
        return Mono.just("Customer Service is taking longer than Expected." +
                " Please try again later");
    }

    @GetMapping("/addressServiceFallBack")
    public Mono<String> departmentServiceFallBackMethod() {
        return  Mono.just("Address Service is taking longer than Expected." +
                " Please try again later");
    }

}
