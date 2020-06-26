package kr.co.sol;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.sol.board.dto.Board2;
import kr.co.sol.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {
	@Autowired
	private BoardRepository boardRepo;
	// 글 작성1
//	@Test
//	public void testInsertBoard() {
//		Board2 board = new Board2();
//		board.setTitle("첫번째 개시글");
//		board.setWriter("테스터");
//		board.setContent("잘등록 되었나요");
//		board.setCreateDate(new Date());
//		board.setCnt(0);
//		
//		boardRepo.save(board);
//	}
	// 글 조회
//	@Test
//	public void testGetBoard() {
//		Board2 board = boardRepo.findById(1).get();
//		System.out.println(board.toString());
//	}
	// 글 수정
//	@Test
//	public void testUpdateBoard() {
//		System.out.println("===1번 게시글 조회===");
//		Board2 board = boardRepo.findById(1).get();
//		System.out.println("===1번 게시글 수정===");
//		board.setTitle("제목 수정!");
//		boardRepo.save(board);
//	}
	// 글 삭제
//	@Test
//	public void testDeleteBoard() {
//		boardRepo.deleteById(1);
//	}
	
}
