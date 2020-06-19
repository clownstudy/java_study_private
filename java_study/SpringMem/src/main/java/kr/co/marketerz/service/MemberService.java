package kr.co.marketerz.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.marketerz.memtb.MemberDTO;
import kr.co.marketerz.memtb.PageDTO;

public interface MemberService {
//	public boolean idCheck();
	public List<MemberDTO> memberList(PageDTO pdto);
//	public PageDTO joinMember(PageDTO pdto);
	public void joinMember(MemberDTO mdto);
////	public List<String, Object> memberList(MemberDTO mdto, PageDTO pdto);
	public MemberDTO memberUpdate(MemberDTO mdto);
	public void memberDelete(MemberDTO mdto);
//	public Map<String, Object> memberContent(MemberDTO mdto, PageDTO pdto);
	public int allCount();
//	public Map<String, Object> memberInfo(MemberDTO mdto, PageDTO pdto);
	public MemberDTO memberInfo(MemberDTO mdto);
	public int idCheck(String userid);

}
