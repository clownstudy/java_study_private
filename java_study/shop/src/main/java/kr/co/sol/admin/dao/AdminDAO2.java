package kr.co.sol.admin.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.co.sol.admin.dto.AdminDTO;

@Mapper
public interface AdminDAO2 {

	String adminLoginPro(AdminDTO adto);

}
