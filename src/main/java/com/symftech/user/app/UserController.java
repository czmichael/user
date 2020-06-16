package com.symftech.user.app;

import org.springframework.web.bind.annotation.RestController;

//import com.symftech.user.service.UserService;
//import com.symftech.user.service.impl.UserServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
//	@Autowired
//	private UserService userService;

	@RequestMapping("/")
	public String index() {
		logger.info("======");
//		return "Greetings from Spring Boot!";
//		userService.login();
		return "hi";
	}
	
//	@Bean
//	public UserService getLoginService() {
//		return new UserServiceImpl();
//	}

}
