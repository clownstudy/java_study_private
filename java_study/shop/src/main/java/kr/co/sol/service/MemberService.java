package kr.co.sol.service;

import kr.co.sol.custom.dto.MemberDTO;

public interface MemberService {
	// 인터페이스는 접근제한자 디폴트가 public
	int idCheck(String id);

	int memberJoin(MemberDTO mdto);

	String loginPro(MemberDTO mdto);

	MemberDTO memberSelect(MemberDTO mdto);

	int memberUpdate(MemberDTO mdto);
}
