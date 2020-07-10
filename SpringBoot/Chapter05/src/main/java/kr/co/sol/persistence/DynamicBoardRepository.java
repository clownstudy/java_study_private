package kr.co.sol.persistence;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import kr.co.sol.board.dto.Member;

public interface DynamicBoardRepository extends CrudRepository<Member, Integer>, QuerydslPredicateExecutor<Member> {

}
