package kr.co.sol.domain;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

public class SecurityUser extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3345155853062536894L;

	public SecurityUser(Member3 member) {
		super(member.getId(),"{noop}"+member.getPassword(),
				AuthorityUtils.createAuthorityList(member.getRole().toString()));
		System.out.println("========================"+member.getId());
		System.out.println("========================"+member.getPassword());
		System.out.println("========================"+member.getRole());
		System.out.println("========================"+member.getName());
		System.out.println("========================"+member.getEnabled());
	}
}
