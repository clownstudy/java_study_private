package model2.board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.BoardDAO;
import board.BoardDTO;
import board.PageDTO;

public class ListAction implements CommandAction{

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {
	    BoardDAO dao = BoardDAO.getInstance();
		PageDTO pdto = new PageDTO();
//		HttpSession session = req.getSession();
		//전체 레코드 수
		int cnt = dao.getAllCount();
		pdto.setAllCount(cnt);
		// 전체 페이지 수 계산
		int pageCnt = cnt%pdto.getLinePerPage();
		if(pageCnt==0) {
			// 나머지가 0이므로, 전체페이지수 = 몫
			pdto.setAllPage(cnt/pdto.getLinePerPage());
		} else {
			// 나머지가 0이 아니므로, 전체 페이지수 = 몫+1
			pdto.setAllPage(cnt/pdto.getLinePerPage()+1);
		}
		//getAllPage() = 전체 페이지 수.
		int endPage = pdto.getAllPage();
		int startPage = 0;
		pdto.setStartPage(startPage);
		pdto.setEndPage(endPage);
		int currentPage = 0;
		if(req.getParameter("currentPage")==null) {
			currentPage = 1;
		} else {
			currentPage = Integer.parseInt(req.getParameter("currentPage"));
		}
		
		// 현재 블럭 받아오기.
		int currentPageBlock=0;
		if(req.getParameter("currentPageBlock")==null) {
			currentPageBlock=1;
		} else {
			currentPageBlock= Integer.parseInt(req.getParameter("currentPageBlock"));
		}
		pdto.setCurrentPage(currentPage);
		pdto.setCurrentPageBlock(currentPageBlock);
		
		/* 
		 endPage는 총 페이지 수
		 startpage는 0
		currentpage = currentpage
		currentblock = currentblock;
		 */
		
		// 전체 페이지 수가 블럭보다 작다
		startPage = ((pdto.getCurrentPageBlock()-1)*(pdto.getPageBlock()))+1;
		endPage = currentPageBlock*pdto.getPageBlock()>pdto.getAllPage()? endPage : pdto.getPageBlock()*currentPageBlock;
		pdto.setStartPage(startPage);
		pdto.setEndPage(endPage);
		
		// 게시판 시작글, 마지막글 계산
	    int sRow=(currentPage-1)*pdto.getLinePerPage()+1;
	    
	    List<BoardDTO> list = dao.getArticles(sRow, currentPage*pdto.getLinePerPage());    
	    //view에서 사용할 결과값 저장
	    req.setAttribute("list",list);
	    req.setAttribute("pdto", pdto);
	    // 페이지 정보도 저장
		return "/board2/boardList.jsp" ; // 여기에 적힌 것을 제외한 파일 접근 제한.
	}
	
}