package model2.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.PageDTO;

public class DeleteProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {

		int num= Integer.parseInt(req.getParameter("num"));
		//DAO가져오기
		BoardDAO dao = BoardDAO.getInstance();
		// DAO메소드 실행
		System.out.println(req.getParameter("num"));
		int currentPage;
		int currentPageBlock;
		if(req.getParameter("currentPage")==null) {
			currentPage = 1;
		} else {
			currentPage = Integer.parseInt(req.getParameter("currentPage"));
		}
		if(req.getParameter("currentPageBlock")==null) {
			currentPageBlock=1;
		} else {
			currentPageBlock= Integer.parseInt(req.getParameter("currentPageBlock"));
		}
		
		PageDTO pdto = new PageDTO();
		pdto.setCurrentPage(currentPage);
		pdto.setCurrentPageBlock(currentPageBlock);
		req.setAttribute("pdto",pdto);
		
		
		dao.deleteArticle(num);
		return "/board2/deletePro.jsp";
	}

}
