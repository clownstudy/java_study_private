package kr.co.sol.shop.web;

import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		Hashtable<Integer, OrderDTO> hCartList = new Hashtable<Integer, OrderDTO>();
		OrderDTO or = new OrderDTO();
		or.setId("user");
		or.setNo(1);
		or.setProduct_no(1);
		or.setPrice(10000);
		or.setQuantity(2);
		or.setPname("가방");
		model.addAttribute("hCartList",hCartList);
		return "";
	}
	
	@RequestMapping("/cartProc")
	public String cartProc(HttpServletRequest request, HttpServletResponse response, OrderDTO odto, Model model) {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("idKey");
		if(id==null) {
			return "redirect:/login";
		}
		odto.setId(id);
		CartMgrDTO cartMgr = new CartMgrDTO();
		
//		CartMgrDTO cartMgr = new CartMgrDTO();
//		Hashtable<Integer, OrderDTO> hCartList=cartMgr.getCartList();
//		model.addAttribute("hCartList", hCartList);
		
		
		return "CartList";
	}
}