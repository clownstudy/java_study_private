package model2.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardDTO;
import board.PageDTO;

public class ContentAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {
		int num = Integer.parseInt(req.getParameter("num"));
		int currentPage = Integer.parseInt(req.getParameter("currentPage"));
		int currentPageBlock = Integer.parseInt(req.getParameter("currentPageBlock"));
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
		
		   //DAO사용.. 인스턴스얻어오기
		    BoardDAO dao = BoardDAO.getInstance();
		   //해당 인스턴스에서 해당되는 메소드 실행
		   BoardDTO dto = dao.getArticle(num);
		   //setAttribute를 해줘야 됨
		     req.setAttribute("dto",dto);		
		     req.setAttribute("pdto",pdto);		
		
		return "/board2/content.jsp";
		
	}

}
