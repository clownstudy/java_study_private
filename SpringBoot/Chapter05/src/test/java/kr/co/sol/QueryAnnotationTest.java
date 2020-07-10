package kr.co.sol;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.sol.board.dto.Member;
import kr.co.sol.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest

public class QueryAnnotationTest {
	@Autowired
	private BoardRepository boardRepo;
	
//	@Test
//	public void testQueryAnnotationTest1() {
//		List<Board2> boardList = boardRepo.queryAnnotationTest2("테스트 제목10");
//		
//		System.out.println("검색 결과");
//		for (Board2 board : boardList) {
//			System.out.println("---> "+board.toString());
//		}
//	}
//	@Test
//	public void testQueryAnnotationTest3() {
//		List<Object[]> boardList = boardRepo.queryAnnotationTest3("테스트 제목10");
//		
//		System.out.println("검색 결과");
//		for (Object[] row : boardList) {
//			System.out.println("---> "+Arrays.toString(row));
//		}
//	}
//	@Test
//	public void testQueryAnnotationTest4() {
//		List<Object[]> boardList = boardRepo.queryAnnotationTest4("테스트 제목10");
//		
//		System.out.println("검색 결과");
//		for (Object[] row : boardList) {
//			System.out.println("---> "+Arrays.toString(row));
//		}
//	}
	@Test
	public void testQueryAnnotationTest5() {
		Pageable paging = PageRequest.of(0, 3,Sort.DEFAULT_DIRECTION.DESC,"seq");
		List<Member> boardList = boardRepo.queryAnnotationTest5(paging);
		System.out.println("검색 결과");
		for (Member board : boardList) {
			System.out.println("---> "+board.toString());
		}
	}
}
