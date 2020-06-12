package kr.or.sol.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("boardDao")
public class BoardDAO {
// database 연결 위해 DI 필요
	@Autowired SqlSession sqlsession; // Connection pool의 connect 정보(database > log4j > mybatis > session 4단계 거침)
	
	// prenamespace 지정. namespace는 map에서 구역설정해놓은거 명명한거. input tag name이랑 같다고 보면 됨.
	String prens = "model2.board.";
	public int getAllCount() {
		
//		 return sqlsession.selectOne(prens+"allCnt");
		 return sqlsession.selectOne("model2.board.allCnt");
	}
}
