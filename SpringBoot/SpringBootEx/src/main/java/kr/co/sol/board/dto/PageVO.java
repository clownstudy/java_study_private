package kr.co.sol.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageVO {
	//현재 페이지
	int currentPage;
	// 페이지 당 라인 수
	int linePerPage = 10;
	// 전체 레코드 수
	int allCount;
	//전체 페이지 수
	int allPage;
	//페이지블럭(하나의 화면에 나오는 페이지 수)
	int pageBlock = 5;
	//현재페이지블럭
	int currentPageBlock;
	// 시작페이지
	int startPage;
	// 끝페이지
	int endPage;
}
