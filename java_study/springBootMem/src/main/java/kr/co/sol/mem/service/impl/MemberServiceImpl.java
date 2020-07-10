package kr.co.sol.mem.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sol.mem.dao.MemberDAO;
import kr.co.sol.mem.dto.MemberVO;
import kr.co.sol.mem.dto.PageVO;
import kr.co.sol.mem.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

	@Autowired
	private MemberDAO memberDao;
	@Override
	public List<MemberVO> memberList(PageVO pvo) {
		if (pvo.getCurrentPage() == 0) {
			pvo.setCurrentPage(1);
		} 

		// 현재 블럭 받아오기.
		if (pvo.getCurrentPageBlock() == 0) {
			pvo.setCurrentPageBlock(1);
		}
		
		MemberVO mvo2 = new MemberVO();
		List<MemberVO> list = (List<MemberVO>) memberDao.memberList(mvo2);
		return list;
	}
	@Override
	public int allCount() {
		int r = memberDao.allCount();
		return r;
	}
	@Override
	public MemberVO memberInfo(MemberVO mvo) {
		return memberDao.MemberInfo(mvo);
	}

	@Override
	public MemberVO memberUpdate(MemberVO mvo) {
		memberDao.memberUpdate(mvo);
		return mvo;
	}
	@Override
	public void joinMember(MemberVO mvo) {
		memberDao.joinMember(mvo);
	}
	@Override
	public int idCheck(String userid) {
		int cnt = memberDao.idCheck(userid);
		return cnt;
	}
	@Override
	public void memberDelete(MemberVO mvo) {
 		
	}

}
