package kr.co.sol.persistence;

import org.springframework.data.repository.CrudRepository;
import kr.co.sol.board.dto.Board2;

public interface BoardRepository extends CrudRepository<Board2, Integer> {
	
}
