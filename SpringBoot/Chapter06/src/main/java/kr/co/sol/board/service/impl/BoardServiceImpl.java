package kr.co.sol.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sol.board.dto.Board2;
import kr.co.sol.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository boardRepo;
	
	@Override
	public List<Board2> getBoardList(Board2 board){
		return (List<Board2>) boardRepo.findAll();
	}
	
	@Override
	public void insertBoard(Board2 board) {
		boardRepo.save(board);
	}
	@Override
	public Board2 getBoard(Board2 board) {
		return boardRepo.findById(board.getSeq()).get();
	}
	@Override
	public void updateBoard(Board2 board) {
		
	}
	@Override
	public void deleteBoard(Board2 board) {
		
	}
}
