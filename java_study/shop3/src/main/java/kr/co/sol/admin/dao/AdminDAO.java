package kr.co.sol.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.sol.admin.dto.AdminDTO;
import kr.co.sol.custom.dto.MemberDTO;

@Mapper
public interface AdminDAO {
	List<MemberDTO> getMembers(MemberDTO mdto);
	String adminLoginPro(AdminDTO adto);
}
