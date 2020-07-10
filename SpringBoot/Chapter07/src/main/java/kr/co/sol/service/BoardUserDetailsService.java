package kr.co.sol.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kr.co.sol.domain.Member3;
import kr.co.sol.domain.SecurityUser;
import kr.co.sol.persistence.MemberRepository;

@Service
public class BoardUserDetailsService implements UserDetailsService{
	@Autowired
	private MemberRepository memberRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		System.out.println("사용자 정보 확인 중.");
		Optional<Member3> optional = memberRepo.findById(username);
		System.out.println("사용자 정보 확인중2");
		if(!optional.isPresent()) {
			throw new UsernameNotFoundException(username+"사용자 없음");
		} else {
			Member3 member = optional.get();
			System.out.println("사용자 있음");
			return new SecurityUser(member);
		}
	}
}
