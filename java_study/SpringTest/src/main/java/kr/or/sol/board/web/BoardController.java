package kr.or.sol.board.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.sol.board.dto.BoardDTO;
import kr.or.sol.board.dto.PageDTO;
import kr.or.sol.board.service.BoardListService;

@Controller
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardListService boardListService; // boardListService를 injection해서 올린다

	
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
		return "/board2/boardList";
		
	}
	
}
