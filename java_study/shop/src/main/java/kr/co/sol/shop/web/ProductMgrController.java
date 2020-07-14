package kr.co.sol.shop.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.co.sol.custom.dto.MemberDTO;
import kr.co.sol.shop.dto.ProductDTO;
import kr.co.sol.shop.service.ProductMgrService;

@Controller
public class ProductMgrController {
	@Autowired
	ProductMgrService productMgrService;
	@RequestMapping("/productMgrProc")
	public String productMgrProc(HttpServletRequest request, HttpServletResponse response, @RequestParam("image2") MultipartFile file,ProductDTO pdto, Model model) {
		HttpSession session = request.getSession();
		MemberDTO adminDto = (MemberDTO) session.getAttribute("adminDto");
		int r = 0;
		String flag = request.getParameter("flag");
		String msg = null;
		String url = null;
		if(flag.equals("insert")) { //등록
			r = productMgrService.insertProduct(pdto, file);
			if(r>0) {
				msg = "상품등록성공";
				url="/productMgr";
			}else {
				msg="상품등록실패";
				url="/";
			}
		}
		model.addAttribute("msg",msg);
		model.addAttribute("url",url);
		session.setAttribute("adminDto", adminDto);
		return "ProductMgr";
	}
}
