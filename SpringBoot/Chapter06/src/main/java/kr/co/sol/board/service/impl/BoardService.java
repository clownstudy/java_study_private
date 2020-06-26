package kr.co.sol.board.service.impl;

import java.util.List;
import kr.co.sol.board.dto.Board2;

public interface BoardService {

	List<Board2> getBoardList(Board2 board);

	void insertBoard(Board2 board);

	Board2 getBoard(Board2 board);

	void updateBoard(Board2 board);

	void deleteBoard(Board2 board);

}