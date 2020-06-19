package kr.co.marketerz.memtb;

import java.util.List;
import javax.annotation.Resource;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import kr.co.marketerz.MemberController;

@Repository(value="memberDao")
public class MemberDAO {
	@Resource SqlSession sqlsession;
	private String namespace = "memMapper.";
	
	public List<MemberDTO> memberList(MemberDTO mdto) {
		return sqlsession.selectList(namespace+"getMember",mdto);
	}

	public int allCount() {
		return sqlsession.selectOne(namespace+"allCount");
	}

	public MemberDTO MemberInfo(MemberDTO mdto) {
		mdto.setMemseq(mdto.getMemseq());
		MemberDTO mdto2 = sqlsession.selectOne(namespace+"getMember",mdto);
		return sqlsession.selectOne(namespace+"getMember",mdto);
	}

	public int joinMember(MemberDTO mdto) {
		return sqlsession.insert(namespace+"join",mdto);
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
	public MemberDTO memberUpdate(MemberDTO mdto){
		sqlsession.update(namespace+"memberUpdate",mdto);
		return mdto;
	}
	
	public void memberDelete(MemberDTO mdto) {
		sqlsession.delete(namespace+"memberDelete",mdto);
	}

	public int idCheck(String userid) {
		return sqlsession.selectOne(namespace+"idCheck",userid);
	}
}
