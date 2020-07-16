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
		HttpSession session = request.getSession(true);
		
		Hashtable<Integer, OrderDTO> hCartList = 
				(Hashtable<Integer, OrderDTO>) session.getAttribute("hCartList");
		//연습용
//		OrderDTO or = new OrderDTO();
//		or.setId("user");
//		or.setNo(1);
//		or.setProduct_no(1);
//		or.setPrice(10000);
//		or.setQuantity(2);
//		or.setPname("가방");
		
		if(hCartList==null||hCartList.size()==0) {
			hCartList = new Hashtable<Integer, OrderDTO>();
		}
		session.setAttribute("hCartList", hCartList);
		return "CartList";
	}
	
	@RequestMapping("/cartProc")
	public String cartProc(HttpServletRequest request, HttpServletResponse response, OrderDTO odto, Model model) {
		String flag = request.getParameter("flag");
		HttpSession session = request.getSession(true);
		Hashtable<Integer, OrderDTO> hCartList = 
				(Hashtable<Integer, OrderDTO>) session.getAttribute("hCartList");
		String idKey = (String) session.getAttribute("idKey");
		odto.setId(idKey);
		if(hCartList==null)
			hCartList=new Hashtable<Integer, OrderDTO>();
		
		return "CartList";
	}
}