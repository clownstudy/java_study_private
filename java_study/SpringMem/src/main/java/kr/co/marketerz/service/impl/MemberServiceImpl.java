package kr.co.marketerz.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.marketerz.memtb.MemberDAO;
import kr.co.marketerz.memtb.MemberDTO;
import kr.co.marketerz.memtb.PageDTO;
import kr.co.marketerz.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDao;
	
	@Override
	public int joinMember(MemberDTO mdto, PageDTO pdto) {
		return memberDao.joinMember(mdto);
	}

//	@Override
//	public List<MemberDTO> memberList(MemberDTO mdto, PageDTO pdto) {
//		// TODO Auto-generated method stub
//		return memberDao.memberList(mdto);
//	}

//1번방법
	@Override
	public Map<String, Object> memberList(MemberDTO mdto, PageDTO pdto) {
		int allCnt = memberDao.allCount();
		List<MemberDTO>list = memberDao.memberList(mdto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list",list);
		map.put("allCnt",allCnt);
		return map;
	}
//2번방법	
//	@Override
//	public List<Object> memberList(MemberDTO mdto, PageDTO pdto) {
//		int allCnt = memberDao.allCount();
//		List<Object> list = memberDao.memberList(mdto);
//		list.add(allCnt);
//		/*
//		 * Controller에서 꺼낼 때
//		 * List<MemberDTO> list = (MemberDTO)list.get(0);
//		 * int allCnt=(int)list.get(1);
//		 */
//		return list;
//	}
//3번방법
	// 메소드 2개 만들어서 Controller에서 2번 호출(allCount 호출, memberList 호출)

	
	@Override
	public MemberDTO memberUpdate(MemberDTO mdto, PageDTO pdto) {
		memberDao.memberUpdate(mdto);
		return mdto;
	}

	@Override
	public void memberDelete(MemberDTO mdto, PageDTO pdto) {
		memberDao.memberDelete(mdto.getMemseq());
	}

	@Override
	public Map<String, Object> memberContent(MemberDTO mdto, PageDTO pdto) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<MemberDTO> list = memberDao.memberList(mdto);
		map.put("mdto", list);
		return map;
	}

}
