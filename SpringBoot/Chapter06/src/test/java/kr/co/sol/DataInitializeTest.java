package kr.co.sol;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.sol.board.dto.Board2;
import kr.co.sol.board.dto.Member2;
import kr.co.sol.persistence.BoardRepository;
import kr.co.sol.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataInitializeTest {
	@Autowired
	private MemberRepository memberRepo;
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Test
	public void testDataInsert() {
		Member2 member1 = new Member2();
		member1.setId("member1");
		member1.setName("태웅");
		member1.setPassword("member111");
		member1.setRole("ROLE_USER");
		memberRepo.save(member1);
		
		Member2 member2 = new Member2();
		member2.setId("member2");
		member2.setName("태웅2");
		member2.setPassword("member222");
		member2.setRole("ROLE_ADMIN");
		memberRepo.save(member2);
		
		for (int i=1; i<=3; i++) {
			Board2 board = new Board2();
			board.setWriter("태웅");
			board.setTitle("태웅 등록 글"+i);
			board.setContent("내용"+i);
			boardRepo.save(board);
		}
		
		for (int i=1; i<=3; i++) {
			Board2 board = new Board2();
			board.setWriter("태웅2");
			board.setTitle("태웅2 등록 글"+i);
			board.setContent("2번 내용"+i);
			boardRepo.save(board);
		}
		
	}
}
