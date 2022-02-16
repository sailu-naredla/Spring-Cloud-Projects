/**
 * 
 */
package com.oauth.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author snaredla
 *
 */
@RestController
public class UserController {
	
	@RequestMapping("/api/user/validate")
	public Principal user(Principal user) {
		return user;
	}
	
	@RequestMapping("/api/user/access")
	public String user() {
		return "Hello Oauth resource";
	}

}
