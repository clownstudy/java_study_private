package kr.co.sol.mem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.sol.mem.dto.MemberVO;
import kr.co.sol.mem.dto.PageVO;
@Service
public interface MemberService {
	public List<MemberVO> memberList(PageVO pvo);
	public void joinMember(MemberVO mvo);
	public MemberVO memberUpdate(MemberVO mvo);
	public void memberDelete(MemberVO mvo);
	public int allCount();
	public MemberVO memberInfo(MemberVO mvo);
	public int idCheck(String userid);
}
