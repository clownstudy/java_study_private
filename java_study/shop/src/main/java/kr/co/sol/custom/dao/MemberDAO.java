package kr.co.sol.custom.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.co.sol.custom.dto.MemberDTO;

@Mapper
public interface MemberDAO {
	String loginPro(MemberDTO mdto);
	int idCheck(String id);
	int memberJoin(MemberDTO mdto);
	MemberDTO memberSelect(MemberDTO mdto);
	int memberUpdate(MemberDTO mdto);
}
