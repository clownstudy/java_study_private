package kr.or.sol.board.service;

import java.util.List;

import kr.or.sol.board.dto.BoardDTO;
import kr.or.sol.board.dto.PageDTO;

public interface BoardListService {
// ListAction의 getAllCount와 GetArticles를 구현해야함
	public int getAllCount();
	public List<BoardDTO> getArticles(PageDTO pdto);
}
