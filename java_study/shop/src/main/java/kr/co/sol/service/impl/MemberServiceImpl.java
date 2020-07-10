package kr.co.sol.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sol.custom.dao.MemberDAO;
import kr.co.sol.custom.dto.MemberDTO;
import kr.co.sol.service.MemberService;
@Service("MemberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDao;
	@Override
	public int idCheck(String id) {
		// 데이터베이스 다녀오는 dao 호출
		return memberDao.idCheck(id);
	}
	@Override
	public int memberJoin(MemberDTO mdto) {
		return memberDao.memberJoin(mdto);
	}
	@Override
	public String loginPro(MemberDTO mdto) {
		return memberDao.loginPro(mdto);
	}
	@Override
	public MemberDTO memberSelect(MemberDTO mdto) {
		// TODO Auto-generated method stub
		return memberDao.memberSelect(mdto);
	}
	@Override
	public int memberUpdate(MemberDTO mdto) {
		return memberDao.memberUpdate(mdto);
	}
}
