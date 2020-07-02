package kr.co.sol.service;

import java.util.List;
import java.util.Map;

import kr.co.sol.board.dto.BoardVO;
import kr.co.sol.board.dto.PageVO;

public interface BoardListService {
// ListAction의 getAllCount와 GetArticles를 구현해야함
	public int getAllCount();
	public List<BoardVO> getArticles(PageVO pvo);
	public Map<String, Object> getArticle(BoardVO bvo, PageVO pvo);
}
