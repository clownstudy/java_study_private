package kr.or.sol.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.sol.board.dto.BoardDTO;

@Repository("boardDao")
public class BoardDAO {
// database 연결 위해 DI 필요
	// @Resource로 쓸 수도 있음
	@Autowired SqlSession sqlsession; // Connection pool의 connect 정보(database > log4j > mybatis > session 4단계 거침)
	
	// prenamespace 지정. namespace는 map에서 구역설정해놓은거 명명한거. input tag name이랑 같다고 보면 됨.
	String prens = "model2.board.";
	public int getAllCount() {
		
		 return sqlsession.selectOne(prens+"allCnt");
	}
	public List<BoardDTO> getArticles(Map<String, Integer> hmap) {
		return sqlsession.selectList(prens+"getArticles",hmap);
	}
	public BoardDTO getArticle(BoardDTO bdto) {
		HashMap<String, Integer> numMap = new HashMap<String, Integer>();
		numMap.put("num", bdto.getNum());
		sqlsession.update(prens+"updateReadCnt",numMap);
		return sqlsession.selectOne(prens+"getArticles",numMap);
	}
	public void boardWrite(BoardDTO bdto) {
		sqlsession.insert(prens+"boardWrite",bdto); // 새글만 저장?
	}
	public int getNewNum() {
		return sqlsession.selectOne(prens+"NewNum");
	}
	public void boardUpdate(BoardDTO bdto) {
		sqlsession.update(prens+"updatePro",bdto);
	}
	public void deletePro(int num) {
		sqlsession.delete(prens+"deleteArticle",num);
	}
}
