package kr.co.marketerz.service;

import java.util.Map;

import kr.co.marketerz.memtb.MemberDTO;
import kr.co.marketerz.memtb.PageDTO;

public interface MemberService {
//	public boolean idCheck();
	public int joinMember(MemberDTO mdto, PageDTO pdto);
//	public List<String, Object> memberList(MemberDTO mdto, PageDTO pdto);
	public Map<String, Object> memberList(MemberDTO mdto, PageDTO pdto);
	public MemberDTO memberUpdate(MemberDTO mdto, PageDTO pdto);
	public void memberDelete(MemberDTO mdto, PageDTO pdto);
	public Map<String, Object> memberContent(MemberDTO mdto, PageDTO pdto);
}
