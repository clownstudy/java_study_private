package kr.co.sol.order.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sol.shop.dto.ProductDTO;

@Controller
public class CardtMgrController {
	@RequestMapping("/cartList")
	public String cartList(HttpServletRequest request, HttpServletResponse response, ProductDTO pdto, Model model) {
		
		return "cartList";
		
	}
}
