package kr.co.sol.mem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.sol.mem.dto.MemberVO;

@Mapper
public interface MemberDAO {
	public void joinMember(MemberVO mvo);
	public List<MemberVO> memberList(MemberVO mvo);
	public int allCount();
	public int idCheck(String userid);
	public MemberVO MemberInfo(MemberVO mvo);
	public void memberUpdate(MemberVO mvo);
	public void memberDelete(MemberVO mvo);
}
