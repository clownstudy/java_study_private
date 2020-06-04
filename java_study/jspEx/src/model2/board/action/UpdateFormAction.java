package model2.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardDTO;

public class UpdateFormAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {
		req.setCharacterEncoding("UTF-8");
		int num = Integer.parseInt(req.getParameter("num"));
		String subject = (req.getParameter("subject"));
		String content = (req.getParameter("content"));
		String passwd = (req.getParameter("passwd"));
		String email = req.getParameter("email");
		String attachnm = req.getParameter("attachnm");
		BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = dao.getArticle(num);
		req.setAttribute("dto",dto);

		return "/board2/updateForm.jsp";
	}

}
