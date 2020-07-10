package kr.co.sol.mem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.sol.mem.dto.MemberVO;
import kr.co.sol.mem.dto.PageVO;
import kr.co.sol.mem.service.MemberService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/memberList.mg")
	public String memberList(HttpServletRequest request, HttpServletResponse response, Model model, MemberVO mvo, PageVO pdto) {
		List<MemberVO> list = memberService.memberList(pdto);
		int allCnt = memberService.allCount();
		model.addAttribute("list",list);
		model.addAttribute("pdto",pdto);
		model.addAttribute("mvo",mvo);
		model.addAttribute("allCnt",allCnt);
		return "memberList";
	}
	@RequestMapping(value="/joinForm.mg")
	public String joinForm(Model model, MemberVO mvo) {
		return "joinForm";
	}
	@RequestMapping(value="/joinPro.mg")
	public String joinPro(HttpServletRequest request, HttpServletResponse response, Model model, MemberVO mvo, PageVO pdto) {
		memberService.joinMember(mvo);
		logger.info("===================="+mvo.getMemid());
		model.addAttribute("pdto",pdto);
		model.addAttribute("mvo",mvo);
		
		return "joinPro";
	}
//
//	@RequestMapping(value="/joinPro.mg")
//	public String joinPro(HttpServletRequest request, HttpServletResponse response, Model model, MemberVO mvo, PageDTO pdto) {
//		if(pdto.getCurrentPage()==0) {
//			pdto.setCurrentPage(1);
//		}
//		if(pdto.getCurrentPageBlock()==0) {
//			pdto.setCurrentPageBlock(1);
//		}
//		
//		PageDTO r = memberService.joinMember(pdto);
//		model.addAttribute("pdto",pdto);
//		model.addAttribute("mvo",mvo);
//		return "joinPro";
//	}
//	
//	
	@RequestMapping(value="/memInfo.mg")
	public String memInfo(HttpServletRequest request, HttpServletResponse response, Model model, MemberVO mvo, PageVO pdto) {
		// list 와 hashmap 두가지로 보낼 수 있다.
//		Map<String, Object> cmap = memberService.memberInfo(mvo, pdto); // 누군지 모르기 때문에 object로  
		/*
		모델과 뷰 동시에 갖고 있음. 아래와 같은 형식으로 만들 수 있음.
		ModelAndView mav = new ModelAndView();
		mav.addObject("pdto",pdto);
		mav.setView("board2/content");
		return mav;
		 */
//		model.addAttribute("pdto",(PageDTO)cmap.get("pdto"));
//		model.addAttribute("mvo",(MemberVO)cmap.get("mvo"));
		// 데이터 받아오기.
		mvo = memberService.memberInfo(mvo);
		logger.info("091328409124---"+mvo.getMemid());
		
		// 받아온 데이터 모델에 저장하기.
		model.addAttribute("pdto",pdto);
		model.addAttribute("mvo",memberService.memberInfo(mvo));
		model.addAttribute("allCnt",memberService.allCount());
		return "memInfo";
	}
	
	  @RequestMapping(value = "/idcheck.mg")
	  @ResponseBody
	  public int idCheck(MemberVO mvo, HttpServletRequest request, HttpServletResponse response) {
		  System.out.println(mvo.getMemid());
		  int cnt = 0;
		  String id = mvo.getMemid();
		  if(mvo.getMemid()!=null) {
	 	  cnt = memberService.idCheck(id);
		  }
		  return cnt;
	  }
	
	@RequestMapping(value="/memberUpdate.mg")
	public String memberUpdate(HttpServletRequest request, HttpServletResponse response, Model model, MemberVO mvo, PageVO pdto) {
		MemberVO mvo2 = memberService.memberUpdate(mvo);
		model.addAttribute("mvo",mvo2);
		logger.info("*******update******"+mvo2.getMemid());
		return "memInfo";
	}
	@RequestMapping(value="/memberDelete.mg")
	public String memberDelete(HttpServletRequest request, HttpServletResponse response, Model model, MemberVO mvo, PageVO pdto) {
		memberService.memberDelete(mvo);
	return "memeberList";
	}
	
	@RequestMapping(value="pwCheck.mg")
	public String idCheck() {
		return "member/pwCheck";
	}
}
