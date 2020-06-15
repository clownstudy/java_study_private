package kr.or.sol.board.web;

import java.util.HashMap;
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
	// 갱신과 관계된거 update, delete
	
	@RequestMapping(value = "/boardList.sp")
	public String boardList(HttpServletRequest req, HttpServletResponse res, Model model, BoardDTO dto, PageDTO pdto) {
		// service를 DI(dependency injection)하고 
		// 해당 service의 메소드를 호출한 후
		// model이나 기타 DTO에 데이터를 저장하여 view에 전달.
		// 비즈니스 로직을 적지 않는다.
		// 여기에 트랜잭션 처리를 하기로함 -- 일반적으로는 하위에 새로운 클래스를 생성해서 처리함.
		pdto.setAllCount(boardListService.getAllCount());
		logger.info("전체 레코드 수 : "+pdto.getAllCount());
		List<BoardDTO> list = boardListService.getArticles(pdto);
		model.addAttribute("pdto",pdto); // 전체 글 개수 나옴
		model.addAttribute("list",list);
		return "/board2/boardList";
		
	}

	@RequestMapping(value="/content.sp")
	public String content(HttpServletRequest req, HttpServletResponse res, Model model, BoardDTO bdto, PageDTO pdto) {
		// list 와 hashmap 두가지로 보낼 수 있다.
		Map<String, Object> cmap = boardListService.getArticle(bdto,pdto); // 누군지 모르기 때문에 object로  
		Map<String,Object> bdto2 = new HashMap<String,Object>();
		bdto2.put("bdto", cmap.get("bdto"));
		Map<String,Object> pdto2 = new HashMap<String,Object>();
		pdto2.put("pdto",cmap.get("pdto"));
		model.addAttribute("bdto",bdto2);
		model.addAttribute("pdto",pdto2);
		return "board2/content";
	}
	
	@RequestMapping(value="/writeForm.sp")
	public String writeForm(HttpServletRequest request, HttpServletResponse response, Model model, BoardDTO bdto, PageDTO pdto) {
		
		PageDTO pdto2 = boardWriteService.writeArticle(pdto);
		model.addAttribute("pdto",pdto2);
		model.addAttribute("bdto",bdto); // 받아온거 다시 넣어주기.
		return "board2/writeForm";
	}
	@RequestMapping(value="/writePro.sp")
	public String writePro(HttpServletRequest request, HttpServletResponse response, Model model, BoardDTO bdto, PageDTO pdto) {
		
		boardWriteService.writeProArticle(bdto,request, response);
		if(pdto.getCurrentPage()==0) {
			pdto.setCurrentPage(1);
		}
		if(pdto.getCurrentPageBlock()==0) {
			pdto.setCurrentPageBlock(1);
		}
		
		model.addAttribute("pdto",pdto);
		return "board2/writePro";
	}
	
}
