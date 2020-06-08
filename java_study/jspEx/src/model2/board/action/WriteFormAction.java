package model2.board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.PageDTO;


public class WriteFormAction implements CommandAction {

	@Override
	public String requestPro(HttpServletRequest req, HttpServletResponse res) throws Throwable {
		// 답글인지 아닌지 확인
		int num= 0, ref=0, re_step=1, re_level=1;
		if(req.getParameter("num")!=null) {
			num = Integer.parseInt(req.getParameter("num"));
			ref = Integer.parseInt(req.getParameter("ref"));
			re_step = Integer.parseInt(req.getParameter("re_step"));
			re_level = Integer.parseInt(req.getParameter("re_level"));
		} 
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
		// view에서 쓸 결과값 저장
		req.setAttribute("num",num);
		req.setAttribute("ref",ref);
		req.setAttribute("re_step",re_step);
		req.setAttribute("re_level",re_level);
		req.setAttribute("pdto",pdto);		
		
		return "/board2/writeForm.jsp";
	}

}
