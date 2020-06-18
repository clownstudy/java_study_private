package kr.or.sol.board.web;

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
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.or.sol.board.dto.BoardDTO;
import kr.or.sol.board.dto.PageDTO;
import kr.or.sol.board.service.BoardListService;
import kr.or.sol.board.service.BoardWriteService;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	// DI. boardListService를 injection해서 올린다
	@Autowired
	private BoardListService boardListService; // getArticle(s): boardList, content
	// write에 해당하는 것
	@Autowired
	private BoardWriteService boardWriteService;
	
	/* DI 방법  어노테이션           지원타입	연결방식
	       1. @Autowired	스프링	  타입
	       2. @Inject		 자바		  타입
	       3. @Resource		 자바		  이름
	@Autowired
	
	@Qualifier("타입") // BoardWriteServiceImpl
	private BoardWriteService boardWriteService;
	DI가 좀 더 강력해짐.
	
	 */
	// 갱신과 관계된거 update, delete
	@RequestMapping(value = "/boardList.sp")
	public String boardList(HttpServletRequest req, HttpServletResponse res, Model model, BoardDTO dto, PageDTO pdto) {
		// service를 DI(dependency injection)하고 
		// 해당 service의 메소드를 호출한 후
		// model이나 기타 DTO에 데이터를 저장하여 view에 전달.
		// 비즈니스 로직을 적지 않는다.
		// 여기에 트랜잭션 처리를 하기로함 -- 일반적으로는 하위에 새로운 클래스를 생성해서 처리함.
		pdto.setAllCount(boardListService.getAllCount());
		List<BoardDTO> list = boardListService.getArticles(pdto);
		model.addAttribute("pdto",pdto); // 전체 글 개수 나옴
		model.addAttribute("list",list);
		return "/board2/boardList";
		
	}

	@RequestMapping(value="/content.sp")
	public String content(HttpServletRequest req, HttpServletResponse res, Model model, BoardDTO bdto, PageDTO pdto) {
		// list 와 hashmap 두가지로 보낼 수 있다.
		Map<String, Object> cmap = boardListService.getArticle(bdto,pdto); // 누군지 모르기 때문에 object로  
		/*
		모델과 뷰 동시에 갖고 있음. 아래와 같은 형식으로 만들 수 있음.
		ModelAndView mav = new ModelAndView();
		mav.addObject("pdto",pdto);
		mav.setView("board2/content");
		return mav;
		 */
		model.addAttribute("pdto",(PageDTO)cmap.get("pdto"));
		model.addAttribute("bdto",(BoardDTO)cmap.get("bdto"));
		return "/board2/content";
	}
	
	@RequestMapping(value="/writeForm.sp")
	public String writeForm(HttpServletRequest request, HttpServletResponse response, Model model, BoardDTO bdto, PageDTO pdto) {
		
		PageDTO pdto2 = boardWriteService.writeArticle(pdto);
		model.addAttribute("pdto",pdto2);
		model.addAttribute("bdto",bdto); // 받아온거 다시 넣어주기.
		return "/board2/writeForm";
	}
	@RequestMapping(value="/writePro.sp")
	public String writePro(Model model, BoardDTO bdto, PageDTO pdto, MultipartHttpServletRequest mpRequest) {
		
		boardWriteService.writeProArticle(bdto,mpRequest);
		logger.info("f"+bdto.getFileNo());
		if(pdto.getCurrentPage()==0) {
			pdto.setCurrentPage(1);
		}
		if(pdto.getCurrentPageBlock()==0) {
			pdto.setCurrentPageBlock(1);
		}
		
		model.addAttribute("pdto",pdto);
		return "/board2/writePro";
//		return "redirect:writePro.sp?currentPage="+pdto.getCurrentPage()+"&currentPageBlock="+pdto.getCurrentPageBlock();
	}
	
	@RequestMapping(value="/idCheck.sp")
	public String idCheck() {
		
		return "/board2/idCheck";
	}
	
	@RequestMapping(value="/updateForm.sp")
	public String updateForm(HttpServletRequest request, HttpServletResponse response, Model model, BoardDTO bdto, PageDTO pdto) {
		Map<String, Object> cmap = boardListService.getArticle(bdto,pdto); // 누군지 모르기 때문에 object로  
		model.addAttribute("pdto",(PageDTO)cmap.get("pdto"));
		model.addAttribute("bdto",(BoardDTO)cmap.get("bdto"));
		
		return "/board2/updateForm";
	}
	//updatePro 처리용 하나 생성 필요
	@RequestMapping(value="/updatePro.sp")
	public String updatePro(MultipartHttpServletRequest mpRequest, Model model, BoardDTO bdto, PageDTO pdto) {
		// 서비스 호출
		PageDTO pdto2 = boardWriteService.updatePro(pdto, bdto, mpRequest);
		model.addAttribute("pdto",pdto2);
	return "redirect:/boardList.sp";
	}

	@RequestMapping(value="/deletePro.sp")
	public String deletePro(HttpServletRequest request, HttpServletResponse response, Model model, BoardDTO bdto, PageDTO pdto) {
	PageDTO pdto2 = boardWriteService.deletePro(pdto,bdto.getNum());
	model.addAttribute("pdto",pdto2);
	return "/board2/deletePro";
	}
}
