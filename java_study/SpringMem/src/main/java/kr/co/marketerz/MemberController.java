package kr.co.marketerz;

import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.marketerz.memtb.MemberDTO;
import kr.co.marketerz.memtb.PageDTO;
import kr.co.marketerz.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping(value="/joinForm.mg")
	public String joinForm(HttpServletRequest request, HttpServletResponse response, Model model, MemberDTO mdto, PageDTO pdto) {
		return "joinForm";
	}

	@RequestMapping(value="/joinPro.mg")
	public String joinPro(HttpServletRequest request, HttpServletResponse response, Model model, MemberDTO mdto, PageDTO pdto) {
		int r = memberService.joinMember(mdto, pdto);
		logger.info("=========================="+mdto.getMemid());
		if(r>0) {
			model.addAttribute("message","도전 성공!");
		} else {
			model.addAttribute("message","도전 실패!");
		}
		return "joinPro";
	}
	
	@RequestMapping(value="/memberList.mg")
	public String memberList(HttpServletRequest request, HttpServletResponse response, Model model, MemberDTO mdto, PageDTO pdto) {
		Map<String, Object> map = memberService.memberList(mdto, pdto);
		System.out.println("-----------"+map.get("allCnt"));
		model.addAttribute("list",(List<MemberDTO>) map.get("list"));
		model.addAttribute("allCnt",map.get("allCnt"));
		return "memberList";
	}
	
	@RequestMapping(value="/content.mg")
	public String content(HttpServletRequest req, HttpServletResponse res, Model model, MemberDTO mdto, PageDTO pdto) {
		// list 와 hashmap 두가지로 보낼 수 있다.
		Map<String, Object> cmap = memberService.memberContent(mdto, pdto); // 누군지 모르기 때문에 object로  
		/*
		모델과 뷰 동시에 갖고 있음. 아래와 같은 형식으로 만들 수 있음.
		ModelAndView mav = new ModelAndView();
		mav.addObject("pdto",pdto);
		mav.setView("board2/content");
		return mav;
		 */
		model.addAttribute("pdto",(PageDTO)cmap.get("pdto"));
		model.addAttribute("mdto",(MemberDTO)cmap.get("mdto"));
		return "content";
	}
	
	@RequestMapping(value="/memberUpdate.mg")
	public String memberUpdate(HttpServletRequest request, HttpServletResponse response, Model model, MemberDTO mdto, PageDTO pdto) {
		MemberDTO mdto2 = memberService.memberUpdate(mdto, pdto);
		model.addAttribute("mdto",mdto2);
		return "memberUpdate";
	}
	@RequestMapping(value="/memberDelete.mg")
	public String memberDelete(HttpServletRequest request, HttpServletResponse response, Model model, MemberDTO mdto, PageDTO pdto) {
		memberService.memberDelete(mdto, pdto);
		model.addAttribute("mdto",mdto);
	return "memeberDelete";
	}
}
