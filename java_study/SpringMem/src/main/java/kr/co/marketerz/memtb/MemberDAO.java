package kr.co.marketerz.memtb;

import java.util.List;

import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository(value="memberDao")
public class MemberDAO {
	@Resource SqlSession sqlsession;
	private static final Logger logger = LoggerFactory.getLogger(MemberDAO.class);
	private String namespace = "memMapper.";
	public int joinMember(MemberDTO mdto) {
		System.out.println("-------------"+mdto.getMemid());
		logger.info("++멤버아이디+에러발생전+");
		logger.info("++멤버아이디++"+mdto.getMemid());
		return sqlsession.insert(namespace+"join",mdto);
	}
	public List<MemberDTO> memberList(MemberDTO mdto) {
		// TODO Auto-generated method stub
		return sqlsession.selectList(namespace+"memberList",mdto);
	}
	public int allCount() {
		return sqlsession.selectOne(namespace+"allCount");
	}
	/*
	 *public Map<String, Object> memberList(MemberDTO mdto){
	 *	List<MemberDTO> list = sqlsession.selectList(namespace+"memberList");
	 *	int allCnt = sqlsession.selectOne(namespace+"allCount");
	 *	Map<String, Object> map = new HashMap<String, Object>();
	 *	map.put("list",list);
	 *	map.put("allCnt",allCnt);
	 *	return map;
	 *}
	 *오직 select 로만 이루어진 경우 이렇게 사용.
	 */
	public void memberUpdate(MemberDTO mdto){
		sqlsession.update(namespace+"memberUpdate",mdto);
	}
	public void memberDelete(int memseq) {
		sqlsession.delete(namespace+"memberDelete",memseq);
	}
}
