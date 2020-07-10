package kr.co.sol.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	private static final Logger logger = LoggerFactory.getLogger(SecurityController.class);
	
	@GetMapping("/")
	public String index() {
		logger.info("index 요청입니다.");
	  return "index";
	}
	
	@GetMapping("/member")
	public void forMember() {
		logger.info("Member 요청입니다.");
	}
	
	@GetMapping("/manager")
	public void forManager() {
		logger.info("manager 요청입니다.");
	}
	
	@GetMapping("/admin")
	public void forAdmin() {
		logger.info("admin 요청입니다.");
	}
	
	@GetMapping("/login")
	public void login() {
	}
	
	@GetMapping("/loginSuccess")
	public void loginSuccess() {
		
	}
	
	@GetMapping("/accessDenied")
	public void accessDenied() {
	}

}
