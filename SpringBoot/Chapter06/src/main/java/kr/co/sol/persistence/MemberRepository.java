package kr.co.sol.persistence;

import org.springframework.data.repository.CrudRepository;

import kr.co.sol.board.dto.Member2;

public interface MemberRepository extends CrudRepository<Member2, String> {

}
