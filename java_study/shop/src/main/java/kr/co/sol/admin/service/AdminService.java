package kr.co.sol.admin.service;

import java.util.List;

import kr.co.sol.admin.dto.AdminDTO;
import kr.co.sol.custom.dto.MemberDTO;

public interface AdminService {
	List<MemberDTO> getMembers(MemberDTO mdto);
	String adminloginPro(AdminDTO adto);
}
