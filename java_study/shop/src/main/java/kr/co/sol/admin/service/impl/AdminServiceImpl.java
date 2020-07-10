package kr.co.sol.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.sol.admin.dao.AdminDAO;
import kr.co.sol.admin.dto.AdminDTO;
import kr.co.sol.admin.service.AdminService;
import kr.co.sol.custom.dto.MemberDTO;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDAO adminDao;
	@Override
	public String adminloginPro(AdminDTO adto) {
		return adminDao.adminLoginPro(adto);
	}
	@Override
	public List<MemberDTO> getMembers(MemberDTO mdto) {
		return adminDao.getMembers(mdto);
	}

}
