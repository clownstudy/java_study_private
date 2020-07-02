package kr.co.sol.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
private static final Logger logger = LoggerFactory.getLogger(TestController.class);

@RequestMapping("t.sp")
public String test(HttpServletRequest request, HttpServletResponse response, Model model) {
	model.addAttribute("message", "Hello World!");
	logger.info("111");
	return "NewFile";
}
}
