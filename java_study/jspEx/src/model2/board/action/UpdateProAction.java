package model2.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardDTO;

public class UpdateProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {
		req.setCharacterEncoding("UTF-8");
		// updateForm에서 보내준 데이터 모두 받기
			BoardDTO dto = new BoardDTO();
			//num, ref, re_step, re_level
			//writer, subject, content, passwd, attachnm, readcnt
			
			dto.setNum(Integer.parseInt(req.getParameter("num")));
			
			dto.setSubject(req.getParameter("subject"));
			dto.setAttachnm(req.getParameter("attachnm"));
			dto.setEmail(req.getParameter("email"));
			dto.setContent(req.getParameter("content"));
			dto.setPasswd(req.getParameter("passwd"));

		// DAO를 통해서 받은 데이터 저장하기
			// DAO에 해당 데이터 저장하는 로직을 만들고
			BoardDAO dao = BoardDAO.getInstance();
	 		// 그 로직을 사용한 후
			dao.boardUpdate(dto);
		

		return "/board2/updatePro.jsp";
	}

}
