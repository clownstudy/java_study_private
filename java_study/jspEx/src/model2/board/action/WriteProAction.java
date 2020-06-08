package model2.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardDAO;
import board.BoardDTO;
import board.PageDTO;


public class WriteProAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {
		// 한글 확인을 위해 utf-8로 전환
//		req.setCharacterEncoding("UTF-8");
		// writeForm에서 보내준 데이터 모두 받기
			BoardDTO dto = new BoardDTO();
			//num, ref, re_step, re_level
			//writer, subject, content, passwd, attachnm, readcnt
			
			dto.setNum(Integer.parseInt(req.getParameter("num")));
			dto.setRef(Integer.parseInt(req.getParameter("ref")));
			dto.setRe_step(Integer.parseInt(req.getParameter("re_step")));
			dto.setRe_level(Integer.parseInt(req.getParameter("re_level")));
			dto.setWriter(req.getParameter("writer"));
			dto.setSubject(req.getParameter("subject"));
			dto.setContent(req.getParameter("content"));
			dto.setPasswd(req.getParameter("passwd"));
			dto.setAttachnm(req.getParameter("attachnm"));
			dto.setEmail(req.getParameter("eamil"));
			
			// pdto 저장 시작
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
			req.setAttribute("pdto",pdto);
			// pdto 저장 끝
		// DAO를 통해서 받은 데이터 저장하기
			BoardDAO dao = BoardDAO.getInstance();
	 		// DAO에 해당 데이터 저장하는 로직을 만들고
	 		// 그 로직을 사용한 후
			dao.boardWrite(dto);
			
		return "/board2/writePro.jsp";
	}

}
