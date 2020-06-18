package kr.co.marketerz.memtb;

public class PageDTO {
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
	
	
	public int getCurrentPageBlock() {
		return currentPageBlock;
	}
	public void setCurrentPageBlock(int currentPageBlock) {
		this.currentPageBlock = currentPageBlock;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getLinePerPage() {
		return linePerPage;
	}
	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}
	public int getAllCount() {
		return allCount;
	}
	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}
	public int getAllPage() {
		return allPage;
	}
	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}
	public int getPageBlock() {
		return pageBlock;
	}
	public void setPageBlock(int pageBlock) {
		this.pageBlock = pageBlock;
	}
	
}
