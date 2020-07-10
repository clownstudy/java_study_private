package kr.co.sol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.querydsl.core.BooleanBuilder;

import kr.co.sol.board.dto.Member;
import kr.co.sol.board.dto.QBoard2;
import kr.co.sol.persistence.DynamicBoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DynimicQueryTest {
	@Autowired
	private DynamicBoardRepository boardRepo;
	
	@Test
	public void testDynamicQuery() {
		String searchCondition = "TITLE";
		String searchKeyword = "테스트 제목10";
		
		BooleanBuilder builder = new BooleanBuilder();
		QBoard2 qboard = QBoard2.board2;
		
		if(searchCondition.equals("TITLE")) {
			builder.and(qboard.title.like("%"+searchKeyword+"%"));
		} else if(searchCondition.equals("CONTENT")) {
			builder.and(qboard.content.like("%"+searchKeyword+"%"));
		}
		
		Pageable paging = PageRequest.of(0, 5);
		Page<Member> boardList = boardRepo.findAll(builder, paging);
		
		System.out.println("검색 결과");
		for (Member board : boardList) {
			System.out.println("--> "+board.toString());
		}
	}

}
