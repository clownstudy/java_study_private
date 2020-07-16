package kr.co.sol.custom.web;

import java.util.Hashtable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sol.custom.dto.MemberDTO;
import kr.co.sol.custom.service.CartMgrService;
import kr.co.sol.order.service.OrderMgrService;
import kr.co.sol.service.MemberService;
import kr.co.sol.shop.dto.OrderDTO;

@Controller
public class CustomController {
	private static final Logger logger = LoggerFactory.getLogger(CustomController.class);

	@Autowired
	 MemberService memberService;
	
	@Autowired
	OrderMgrService orderMgrService;
	
	@Autowired
	CartMgrService cartMgrService;

	@GetMapping("/")
	public String index(HttpServletRequest request, Model model, HttpServletResponse response) {
		HttpSession session = request.getSession();
		String idKey = (String)session.getAttribute("idKey");
        session.setAttribute("idKey", idKey);
		return "Index";
	}

	@GetMapping("/register")
	public String register(HttpServletRequest request, Model model, HttpServletResponse response) {
		return "Register";
	}
	
	
//	 @RequestMapping(value = "/idcheck")
//	  @ResponseBody
//	  public int idCheck(MemberDTO mdto, HttpServletRequest request, HttpServletResponse response,Model model ) {
//		  int cnt = 0;
//		  String id = mdto.getMem_id();
//		  if(mdto.getMem_id()!=null) {
//	 	  cnt = memberService.idCheck(id);
//		  }
//		  return cnt;
//	  }
//	 
	  @RequestMapping(value="/registerProc")
		 public String registerProc(MemberDTO mdto, 
				  HttpServletRequest request, 
				  HttpServletResponse response,
				  Model model ) {
			  //memberJoin
			//  logger.info("멤버: "+mdto.toString());
			  int r = memberService.memberJoin(mdto);
			  if(r>0)
			  model.addAttribute("msg", "회원가입 성공");//저장결과 등을 확인
			  else
			  model.addAttribute("msg", "회원가입 실패");//저장결과 등을 확인
			return "MsgPage"; 
		 }

	  @RequestMapping(value="/login")
	  public String login() {
		  return "Login"; 
	  }
	  
	  @RequestMapping(value="/loginProc")
		 public String loginProc(MemberDTO mdto, 
				  HttpServletRequest request, 
				  HttpServletResponse response,
				  Model model ) {
//		  logger.info("멤버: "+mdto.toString());
//		  String id=memberService.logonProc(mdto);
	      mdto=memberService.logonProc(mdto);

	      HttpSession session = request.getSession();
		  String mem_id= null;
		  String url="/";
		  if(mdto!=null) {
			  mem_id= mdto.getMem_id();
		    if(mdto.getM_role()!=null) {
		    	//해당 롤에 해당 메뉴로 갖고 온다
		    	// 관리자인 경우 해당되는 관리자용 세션만들기.
		    	session.setAttribute("adto", mdto);
		    	System.out.println(session.getAttribute("adto"));
		    	url="/admin/index";
			  } else {
				  //일반 회원정보
				  session.setAttribute("mdto", mdto);
			  }
		   }
		  if(mem_id==null) 
			  model.addAttribute("msg", "id 또는 password 오류 입니다.");
		  if(mem_id!=null) {
		   // 회원정보	  
		  //세션객체
		  session.setAttribute("idKey", mem_id);
		  }
		  session.setAttribute("url", url);
		  return "MsgPage";
		 }

	  @RequestMapping(value="/logout")
	  public String logout( HttpServletRequest request) {
		  HttpSession session = request.getSession();
		  session.removeAttribute("idKey");
		  session.invalidate();
		  return "redirect:/"; 
	  }

	  
	  @RequestMapping(value="/memberUpdate")
	  public String memberUpdate( MemberDTO mdto, 
			  HttpServletRequest request, 
			  HttpServletResponse response,
			  Model model) {
		  HttpSession session = request.getSession();
		  MemberDTO sdto = (MemberDTO) session.getAttribute("mdto");
		  MemberDTO adminDto = (MemberDTO) session.getAttribute("mdto");
		  if(mdto.getMem_id()==null) 
			 mdto=sdto;
		  mdto=memberService.memberSelect(mdto);
		  model.addAttribute("mdto",mdto);
		  if(sdto.getM_role()!=null && sdto.getM_role().equals("adminDto")) {
			  model.addAttribute("adminDto",sdto);
		  }
		  String id = (String) session.getAttribute("idKey");
		  // 일반 회원에서 들어오는 경우 처리
		   mdto.setMem_id(id);
		  
		  //admin에서 들어온 경우, 해당 id를 보내야 됨
		  
		  
		  //service 호출
		   mdto = memberService.memberSelect(mdto);
		   // 받은 정보 저장하고 (모델)
		   model.addAttribute("mdto",mdto);
		  return "Update"; 
	  }
	  
	  @RequestMapping(value="/memberUpdateProc")
	  public String memberUpdateProc( MemberDTO mdto, 
			  HttpServletRequest request, 
			  HttpServletResponse response,
			  Model model) {
		  //service 호출
		  // 받은 정보 DB저장
		  int r= memberService.memberUpdate(mdto);
		  //메시지 저장, 이동할 페이지 저장해서 
		   if(r>0) {model.addAttribute("msg", "회원정보수정완료");
		   }else {
			   model.addAttribute("msg", "회원정보수정실패");
		   }
		   HttpSession session = request.getSession();
		   MemberDTO sdto = (MemberDTO) session.getAttribute("mdto");
		   MemberDTO adminDto = (MemberDTO) session.getAttribute("mdto");
		   if(sdto.getM_role()==null) {
			   model.addAttribute("url","/");
		   }else if(adminDto.getM_role().equals("admin")) {
			   model.addAttribute("url","/memberMgr");
		   }
		   model.addAttribute("url","/");
		  return "MsgPage"; 
	  }
	  @RequestMapping("/idCheck")
	  public String idCheck(MemberDTO mdto, 
			  HttpServletRequest request, 
			  HttpServletResponse response,
			  Model model) {
		  HttpSession session = request.getSession();
		  session.setAttribute("mdto", (MemberDTO)session.getAttribute("mdto"));
//		  String id = (String) session.getAttribute("idKey");
//		  memberService.memberDelete(id);
//		  session.removeAttribute("idKey");
		  return "idCheck";
	  }
	  
	  @RequestMapping("/deleteMember")
	  public String deleteMember(MemberDTO mdto, HttpServletRequest request, 
			  HttpServletResponse response, Model model) {
		  
		  HttpSession session = request.getSession();
		  MemberDTO adminDto = (MemberDTO) session.getAttribute("mdto");
		  if(adminDto==null && mdto.getM_role()==null) {
			  model.addAttribute("url","/");
			  session.removeAttribute("mdto");
			  session.invalidate();
		  }if(adminDto!=null) {
			  model.addAttribute("url","/memberMgr");
			  session.setAttribute("adminDto", adminDto);
		  }
		  return "MsgPage";
	  }
	  @RequestMapping("/orderList")
	  public String orderList(MemberDTO mdto, HttpServletRequest request, 
			  HttpServletResponse response, Model model) {
		  HttpSession session = request.getSession(true);
		  String idKey = (String)request.getAttribute("idKey");
		  OrderDTO odto = new OrderDTO();
		  odto.setId(idKey);
		  List<OrderDTO> odtoList = orderMgrService.getOrders(odto);
		  model.addAttribute("odtoList",odtoList);
		  session.setAttribute("idKey", idKey);
		  return "MsgPage";
		  
	  }
	  @RequestMapping("/orderProc")
	  public String orderProc(OrderDTO odto, HttpServletRequest request, Model model) {
		  HttpSession session = request.getSession(true);
		  String idKey = (String) session.getAttribute("idKey");
		  odto.setId(idKey);
		  Hashtable<Integer, OrderDTO> hCartList = cartMgrService.getCartList();
		  System.out.println("hCartList : "+hCartList);
		  return "OrderList";
	  }
	  
	  @RequestMapping("/insertOrders")
	  public String insertOrders(OrderDTO odto, HttpServletRequest request, Model model) {
		  
		  return "OrderList";
	  }
	  
}
