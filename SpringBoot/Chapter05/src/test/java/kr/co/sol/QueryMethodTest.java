package kr.co.sol;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.sol.board.dto.Board2;
import kr.co.sol.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryMethodTest {
	@Autowired
	private BoardRepository boardRepo;
	
//	@Before
//	public void dataPrepare() {
//		for(int i=1;i<=200;i++) {
//			Board2 board2 = new Board2();
//			board2.setTitle("테스트 제목"+i);
//			board2.setWriter("테스터");
//			board2.setContent("내용입니다"+i);
//			board2.setCreateDate(new Date());
//			board2.setCnt(0);
//			boardRepo.save(board2);
//		}
//	}
	
//	@Test
//	public void testFindByTitle() {
//		List<Board2> boardList = boardRepo.findByTitle("테스트 제목10");
//		
//		System.out.println("검색 결과");
//		for(Board2 board : boardList) {
//			System.out.println("---> "+board.toString());
//		}
//	}
	
//	@Test
//	public void testByContentContaining() {
//		List<Board2> boardList = boardRepo.findByContentContaining("17");
//		
//		System.out.println("검색 결과");
//		for(Board2 board : boardList) {
//			System.out.println("===> "+board.toString());
//		}
//	}
	
//	@Test
//	public void testFindByTitleContainingOrContentContaining() {
//		List<Board2> boardList = boardRepo.findByTitleContainingOrContentContaining("17", "17");
//		
//		System.out.println("검색 결과");
//		for (Board2 board : boardList) {
//			System.out.println("---> "+board.toString());
//		}
//	}
//	@Test
//	public void testFindByTitleContainingOrderBySeqDesc() {
//		List<Board2> boardList = boardRepo.findByTitleContainingOrderBySeqDesc("17");
//		
//		System.out.println("실행 결과");
//		for (Board2 board : boardList) {
//			System.out.println("----> "+board.toString());
//		}
//	}
	
//	@Test
//	public void testFindByTitleContaining() {
//		Pageable paging = PageRequest.of(0, 5);
//		List<Board2> boardList = boardRepo.findByTitleContaining("제목", paging);
//		
//		System.out.println("실행 결과");
//		for (Board2 board : boardList) {
//			System.out.println("----> "+board.toString());
//		}
//		
//	}
	
	@Test
	public void testFindByTitleContaining() {
		Pageable paging = PageRequest.of(0,20,Sort.Direction.DESC,"seq");
		Page<Board2> pageInfo = boardRepo.findByTitleContaining("제목", paging);
		System.out.println("PAGE SIZE : "+pageInfo.getSize());
		System.out.println("TOTAL PAGES : "+pageInfo.getTotalPages());
		System.out.println("TOTAL COUNT : "+pageInfo.getTotalElements());
		System.out.println("NEXT : "+pageInfo.nextPageable());
		
		List<Board2> boardList = pageInfo.getContent();

		System.out.println("실행 결과");
		for (Board2 board : boardList) {
			System.out.println("----> "+board.toString());
		}
	}
}