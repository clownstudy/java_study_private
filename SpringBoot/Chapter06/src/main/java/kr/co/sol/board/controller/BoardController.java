package kr.co.sol.board.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.sol.board.dto.Board2;
import kr.co.sol.board.dto.Member2;
import kr.co.sol.board.service.impl.BoardService;
@SessionAttributes("member")
@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@ModelAttribute("member")
	public Member2 setMember() {
		return new Member2();
	}
	
	@RequestMapping("/getBoardList")
	public String getBoardList(@ModelAttribute("member") Member2 member, Model model, Board2 board) {
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
		if(member.getId()==null) {
			return "redirect:login";
		}
		List<Board2> boardList = boardService.getBoardList(board);
		model.addAttribute("boardList", boardList);
		return "getBoardList";
	}
	
//	@GetMapping("/hello")
//	public void hell(Model model) {
//		model.addAttribute("greeting", "Hello 타임리프.");
//	}
	@GetMapping("/getBoard")
	public String getBoard(@ModelAttribute("member") Member2 member, Board2 board, Model model) {
		if(member.getId()==null) {
			return "redirect:login";
		}
		model.addAttribute("board",boardService.getBoard(board));
		return "getBoard";
	}
	
	@PostMapping("/insertBoard")
	public String insertBoard(@ModelAttribute("member") Member2 member, Board2 board) {
		if(member.getId()==null) {
			return "redirect:login";
		}
		boardService.insertBoard(board);
		return "redirect:getBoardList";
	}
	@GetMapping("/insertBoard")
	public String insertBoard(@ModelAttribute("member") Member2 member) {
		if(member.getId()==null) {
			return "redirect:login";
		}
		return "insertBoard";
	}
	
	@PostMapping("/updateBoard")
	public String updateBoard(@ModelAttribute("member") Member2 member, Board2 board) {
		if(member.getId()==null) {
			return "redirect:login";
		}
		boardService.updateBoard(board);
		return "forward:getBoardList";
	}
	
	@GetMapping("/deleteBoard")
	public String deleteBoard(@ModelAttribute("member") Member2 member,Board2 board) {
		if(member.getId()==null) {
			return "redirect:login";
		}
		boardService.deleteBoard(board);
		return "forward:getBoardList";
	}
	
	@GetMapping("/index")
	public String index() {
		return "redirect:index";
	}

}
