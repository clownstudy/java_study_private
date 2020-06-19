package kr.co.marketerz.service.impl;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.marketerz.memtb.MemberDAO;
import kr.co.marketerz.memtb.MemberDTO;
import kr.co.marketerz.memtb.PageDTO;
import kr.co.marketerz.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

	@Autowired
	private MemberDAO memberDao;
	@Override
	public List<MemberDTO> memberList(PageDTO pdto) {
		if (pdto.getCurrentPage() == 0) {
			pdto.setCurrentPage(1);
		} 

		// 현재 블럭 받아오기.
		if (pdto.getCurrentPageBlock() == 0) {
			pdto.setCurrentPageBlock(1);
		}
		
		MemberDTO mdto2 = new MemberDTO();
		List<MemberDTO> list = memberDao.memberList(mdto2);
		return list;
	}
//	@Override
//	public PageDTO joinMember(PageDTO pdto) {
//		if(pdto.getCurrentPage()==0) {
//			pdto.setCurrentPage(1);
//		}
//		if(pdto.getCurrentPageBlock()==0) {
//			pdto.setCurrentPageBlock(1);
//		}
//		return pdto;
//	}
	@Override
	public int allCount() {
		int r = memberDao.allCount();
		return r;
	}
	@Override
	public MemberDTO memberInfo(MemberDTO mdto) {
//		if (pdto.getCurrentPage() == 0) {
//			pdto.setCurrentPage(1);
//		} 
//		if (pdto.getCurrentPageBlock() == 0) {
//			pdto.setCurrentPageBlock(1);
//		}
//		MemberDTO mdto2 = memberDao.MemberInfo(mdto);
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("pdto",pdto);
//
//		map.put("mdto",mdto2);
//		return map;
		return memberDao.MemberInfo(mdto);

	}

//	@Override
//	public List<MemberDTO> memberList(MemberDTO mdto, PageDTO pdto) {
//		// TODO Auto-generated method stub
//		return memberDao.memberList(mdto);
//	}

//1번방법
//	@Override
//	public List<MemberDTO> memberList(PageDTO pdto) {
//		if (pdto.getCurrentPage() == 0) {
//			pdto.setCurrentPage(1);
//		} 
//
//		// 현재 블럭 받아오기.
//		if (pdto.getCurrentPageBlock() == 0) {
//			pdto.setCurrentPageBlock(1);
//		}
//		
//		int allCnt = memberDao.allCount();
//		Map<String, Object> hmap = new HashMap<String, Object>();
//		List<MemberDTO> list = memberDao.memberList(hmap);
//		return list;
//	}
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
	public MemberDTO memberUpdate(MemberDTO mdto) {
		memberDao.memberUpdate(mdto);
		return mdto;
	}

	@Override
	public void memberDelete(MemberDTO mdto) {
		memberDao.memberDelete(mdto);
	}
//
//	@Override
//	public Map<String, Object> memberContent(MemberDTO mdto, PageDTO pdto) {
//		Map<String, Object> hmap = new HashMap<String, Object>();
//		List<MemberDTO> mdto2 = memberDao.memberInfo(hmap);
//		hmap.put("mdto", mdto2);
//		hmap.put("pdto", pdto);
//		return hmap;
//	}
//
//	@Override
//	public int allCount() {
//		int r = memberDao.allCount();
//		return r;
//	}
//
	@Override
	public void joinMember(MemberDTO mdto) {
		memberDao.joinMember(mdto);
	}
	@Override
	public int idCheck(String userid) {
		int cnt = memberDao.idCheck(userid);
		return cnt;
	}

}
