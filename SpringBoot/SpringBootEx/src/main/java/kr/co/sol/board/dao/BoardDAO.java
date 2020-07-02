package kr.co.sol.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.sol.board.dto.BoardVO;

@Mapper
public interface BoardDAO {
	public int getAllCount();
	public List<BoardVO> getArticles(Map<String, Integer> hmap);
	public BoardVO getArticle(BoardVO bvo);
	public void boardWrite(BoardVO bvo);
	public void boardUpdate(BoardVO bvo);
	public void updateReadCount(BoardVO bvo);
	public int getNewNum();
	public void deleteArticle(int num);
	public void deletePro(int num);
}
