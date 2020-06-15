package kr.or.sol.board.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.or.sol.board.dao.BoardDAO;
import kr.or.sol.board.dto.BoardDTO;
import kr.or.sol.board.dto.PageDTO;
import kr.or.sol.board.service.BoardListService;

@Service("boardListService")
public class BoardListServiceImpl implements BoardListService {
	private static final Logger logger = LoggerFactory.getLogger(BoardListServiceImpl.class);
	
	@Resource
 		BoardDAO boardDao; // DI
	
	
	@Override
	public int getAllCount() {
		return boardDao.getAllCount();
	}

	@Override
	public List<BoardDTO> getArticles(PageDTO pdto) {
/* 아래 내용은 ListAction에서 가져옴 */
//		BoardDAO dao = BoardDAO.getInstance(); -> 21라인에서 boardDao로 가져오면 됨
//		PageDTO pdto = new PageDTO(); -> 필요 없음
		// 전체 레코드 수
		// 전체 페이지 수 계산
		if (pdto.getAllCount() % pdto.getLinePerPage() == 0) {
			// 나머지가 0이므로, 전체페이지수 = 몫
			pdto.setAllPage(pdto.getAllCount() / pdto.getLinePerPage());
		} else {
			// 나머지가 0이 아니므로, 전체 페이지수 = 몫+1
			pdto.setAllPage(pdto.getAllCount() / pdto.getLinePerPage() + 1);
		}
		// getAllPage() = 전체 페이지 수.
		if (pdto.getCurrentPage() == 0) {
			pdto.setCurrentPage(1);
		} 

		// 현재 블럭 받아오기.
		if (pdto.getCurrentPageBlock() == 0) {
			pdto.setCurrentPageBlock(1);
		} 

		int endPage = 1;
		int startPage = 1;
		
		startPage = ((pdto.getCurrentPageBlock() - 1) * (pdto.getPageBlock())) + 1;
		endPage = pdto.getCurrentPageBlock() * pdto.getPageBlock() > pdto.getAllPage() ? endPage : pdto.getPageBlock() * pdto.getCurrentPageBlock();
		pdto.setStartPage(startPage);
		pdto.setEndPage(endPage);

		// 가져올 start 레코드와 end레코드를 해시맵으로 저장
		int start = (pdto.getCurrentPage() - 1) * pdto.getLinePerPage() + 1;
		int end = pdto.getCurrentPage()*pdto.getLinePerPage();
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("start",start);
		hmap.put("end",end);
		logger.info("start: "+start);
		logger.info("end: "+end);
		List<BoardDTO> list = boardDao.getArticles(hmap);
		logger.info("가져온 레코드 수 "+list.size());
		// view에서 사용할 결과값 저장
		return list;
	}

	@Override
	public Map<String, Object> getArticle(BoardDTO bdto, PageDTO pdto) {
		// 현재 페이지를 받아오는데 못 받아올 경우 0이므로 1로 세팅
		if (pdto.getCurrentPage() == 0) {
			pdto.setCurrentPage(1);
		} 
		if (pdto.getCurrentPageBlock() == 0) {
			pdto.setCurrentPageBlock(1);
		}
		// 해당 게시글 가져오기.
		BoardDTO bdto2 = boardDao.getArticle(bdto);
		//처리된 결과를 controller에게 전달하기 위해 담기.
		Map<String, Object> cmap = new HashMap<String, Object>();
		cmap.put("pdto",pdto);
		cmap.put("bdto",bdto2);
		return cmap;
	}

}
