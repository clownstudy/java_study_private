package kr.co.sol.admin.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sol.admin.dto.AdminDTO;
import kr.co.sol.admin.service.AdminService;

@Controller
public class AdminController2 {
	private static final Logger logger = LoggerFactory.getLogger(AdminController2.class);
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/admin/index")
	public String adminLogin(HttpServletRequest request, HttpServletResponse response, Model model, AdminDTO adto) {
		return "admin/adminLogin";
	}
	
	@RequestMapping("/adminLoginPro")
	public String adminLoginPro(HttpServletRequest request, HttpServletResponse response, Model model, AdminDTO adto) {
		// 받아온 id와 passwd를 갖고 로그인 처리
		String adminIdKey = adminService.adminloginPro(adto);
		HttpSession session = request.getSession();
		session.setAttribute("adminIdKey", adminIdKey);
		return "admin/index";
	}
}
