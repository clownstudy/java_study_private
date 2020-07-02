package kr.co.sol.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.co.sol.board.dao.BoardDAO;
import kr.co.sol.board.dto.BoardVO;
import kr.co.sol.board.dto.PageVO;
import kr.co.sol.service.BoardListService;

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
	public List<BoardVO> getArticles(PageVO pvo) {
/* 아래 내용은 ListAction에서 가져옴 */
//		BoardDAO dao = BoardDAO.getInstance(); -> 21라인에서 boardDao로 가져오면 됨
//		PageVO pvo = new PageVO(); -> 필요 없음
		// 전체 레코드 수
		// 전체 페이지 수 계산
		if (pvo.getAllCount() % pvo.getLinePerPage() == 0) {
			// 나머지가 0이므로, 전체페이지수 = 몫
			pvo.setAllPage(pvo.getAllCount() / pvo.getLinePerPage());
		} else {
			// 나머지가 0이 아니므로, 전체 페이지수 = 몫+1
			pvo.setAllPage(pvo.getAllCount() / pvo.getLinePerPage() + 1);
		}
		// getAllPage() = 전체 페이지 수.
		if (pvo.getCurrentPage() == 0) {
			pvo.setCurrentPage(1);
		} 

		// 현재 블럭 받아오기.
		if (pvo.getCurrentPageBlock() == 0) {
			pvo.setCurrentPageBlock(1);
		} 

		int startPage = 1;
		int endPage = 1;
		startPage = ((pvo.getCurrentPageBlock() - 1) * (pvo.getPageBlock())) + 1;
		endPage = pvo.getCurrentPageBlock() * pvo.getPageBlock() > pvo.getAllPage() ? pvo.getAllPage() : pvo.getPageBlock() * pvo.getCurrentPageBlock();
		pvo.setStartPage(startPage);
		pvo.setEndPage(endPage);
		// 가져올 start 레코드와 end레코드를 해시맵으로 저장
		int start = (pvo.getCurrentPage() - 1) * pvo.getLinePerPage() + 1;
		int end = pvo.getCurrentPage()*pvo.getLinePerPage();
		Map<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("start",start);
		hmap.put("end",end);
		logger.info("start: "+start);
		logger.info("end: "+end);
		List<BoardVO> list = boardDao.getArticles(hmap);
		logger.info("가져온 레코드 수 "+list.size());
		// view에서 사용할 결과값 저장
		return list;
	}

	@Override
	public Map<String, Object> getArticle(BoardVO bvo, PageVO pvo) {
		// 현재 페이지를 받아오는데 못 받아올 경우 0이므로 1로 세팅
		if (pvo.getCurrentPage() == 0) {
			pvo.setCurrentPage(1);
		} 
		if (pvo.getCurrentPageBlock() == 0) {
			pvo.setCurrentPageBlock(1);
		}
		// 해당 게시글 가져오기.
		BoardVO bvo2 = boardDao.getArticle(bvo);
		//처리된 결과를 controller에게 전달하기 위해 담기.
		Map<String, Object> cmap = new HashMap<String, Object>();
		cmap.put("pvo",pvo);
		cmap.put("bvo",bvo2);
		return cmap;
	}

}
