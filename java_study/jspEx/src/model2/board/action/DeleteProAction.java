package model2.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;

public class DeleteProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {

		int num= Integer.parseInt(req.getParameter("num"));
		//DAO가져오기
		BoardDAO dao = BoardDAO.getInstance();
		// DAO메소드 실행
		System.out.println(req.getParameter("num"));
		
		dao.deleteArticle(num);
		return "/board2/deletePro.jsp";
	}

}
