package com.symftech.user.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class GoogleUserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	

	@RequestMapping(value = "/user/google")
	public Principal user(Principal principal) {
		return principal;
	}

}
