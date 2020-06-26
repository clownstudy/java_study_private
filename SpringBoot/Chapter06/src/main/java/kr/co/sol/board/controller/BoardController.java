package kr.co.sol.board.controller;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.sol.board.dto.Board2;
import kr.co.sol.board.service.impl.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	
	
	@RequestMapping("/getBoardList")
	public String getBoardList(Model model, Board2 board) {
//		List<Board2> boardList = new ArrayList<Board2>();
//		for(int i=1; i<=10; i++) {
//			Board2 board = new Board2();
//			board.setSeq(i);
//			board.setTitle("타임리프 테스트");
//			board.setWriter("작성자"+i);
//			board.setContent("타임리프 테스트 글입니다.");
//			board.setCreateDate(new Date());
//			board.setCnt(0);
//			boardList.add(board);
//		}
//		model.addAttribute("boardList",boardList);
//		return "getBoardList";
		List<Board2> boardList = boardService.getBoardList(board);
		model.addAttribute("boardList", boardList);
		return "getBoardList";
	}
	
//	@GetMapping("/hello")
//	public void hell(Model model) {
//		model.addAttribute("greeting", "Hello 타임리프.");
//	}
	@GetMapping("/getBoard")
	public String getBoard(Board2 board, Model model) {
		model.addAttribute("board",boardService.getBoard(board));
		return "getBoard";
	}
	
	@PostMapping("/insertBoard")
	public String insertBoard(Board2 board) {
		boardService.insertBoard(board);
		return "redirect:getBoardList";
	}
	@GetMapping("/insertBoard")
	public String insertBoard() {
		return "insertBoard";
	}
	
	
}
