package kr.co.sol.custom.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.sol.order.dto.MemberDTO;

@Controller
public class CustomController {
	@GetMapping("/")
	public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		// 세션을 생성해서 받아서
		HttpSession session = request.getSession();
		// 회원 정보가 있으면 회원 정보를 저장
		String mem_id = (String)session.getAttribute("idKey");
		MemberDTO member = new MemberDTO();
		member.setId(mem_id);
		return "index";
	}
	
	@GetMapping("/register")
	public String register(HttpServletRequest request, HttpServletResponse response, Model model) {
		return "register";
	}
}
