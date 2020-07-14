package kr.co.sol.shop.web;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sol.shop.dto.CartMgrDTO;
import kr.co.sol.shop.dto.OrderDTO;
import kr.co.sol.shop.dto.ProductDTO;

@Controller
public class CartMgrController {
	@RequestMapping("/cartList")
	public String cartList(HttpServletRequest request, HttpServletResponse response, Model model, ProductDTO pdto) {
		CartMgrDTO cartMgr = new CartMgrDTO();
		Hashtable<Integer, OrderDTO> hCartList = cartMgr.getCartList();
		model.addAttribute("hCartList", hCartList);
		return "cartList";
	}
}