package kr.co.sol.admin.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sol.shop.dto.ProductDTO;
import kr.co.sol.shop.service.ProductMgrService;

@Controller
public class ProcutMgrController {
	@Autowired
	ProductMgrService productService;
	
	 @RequestMapping("/productMgr")
	 public String productMgr(HttpServletRequest request, HttpServletResponse response, ProductDTO pdto, Model model) {
		System.out.println("*************");
		List<ProductDTO> pList = productService.getProduct();
		System.out.println("*************"+pList);
		model.addAttribute("pdtoList",pList);
		return "admin/ProductMgr";
		 
	 }
	 
	 @RequestMapping("/productInsert")
	 public String productInsert() {
		 return "admin/ProductInsert";
	 }
	 
	 @RequestMapping("/productProc")
	 public String productProc() {
		 
		 return "admin/ProductProc";
	 }
}
