package kr.or.sol.board.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.or.sol.board.dao.BoardDAO;
import kr.or.sol.board.dto.BoardDTO;
import kr.or.sol.board.dto.PageDTO;
import kr.or.sol.board.service.BoardWriteService;
import kr.or.sol.board.web.BoardController;

@Service("boardWriteService")
public class BoardWriteServiceImpl implements BoardWriteService {
	// 아래 내용들은 비즈니스로직이지만, 데이터베이스를 요구하지 않고 계산이 없고, 트랜젝션이 발생하지 않기 때문에
	// 컨트롤러에 넣어도 상관없기는 하다.
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Resource
	BoardDAO boardDao;
	// writeForm에 해당, DAO 필요 없음
	@Override
	public PageDTO writeArticle(PageDTO pdto) {
		if(pdto.getCurrentPage()==0) {
			pdto.setCurrentPage(1);
		}
		if(pdto.getCurrentPageBlock()==0) {
			pdto.setCurrentPageBlock(1);
		}
		return pdto;
		// view에서 쓸 결과값 저장
	}
	// writePro에 해당 DAO 필요
//	@Override
//	public PageDTO writeArticle(PageDTO pdto) {
//	
//	}
//	}

	@Override
	public void writeProArticle(BoardDTO bdto, HttpServletRequest request, HttpServletResponse response) {
//		Map<String, Object> multiDTO = ServletUpload.uploadEx(req, res);
//		// dao를 통해서 받은 데이터 저장하기
//		dao.boardWrite((BoardDTO)multiDTO.get("dto"));
//		req.setAttribute("pdto",(PageDTO)multiDTO.get("pdto"));
		
		// number구하기. (새로운 num)
		int number = boardDao.getNewNum();
		
		// 처음 글 쓸 때 num==0임.
		// 답글 => num!=0
		
		if(bdto.getNum()==0) {
			bdto.setRef(number);
			bdto.setRe_level(1);
			bdto.setRe_step(1);
		} else {
			bdto.setRe_level(bdto.getRe_level()+1);
			bdto.setRe_step(bdto.getRe_step()+1);
		}
		bdto.setNum(number);
		logger.info("boardWriteSerIM"+bdto.getWriter());
		boardDao.boardWrite(bdto);
	}

	@Override
	public PageDTO updatePro(PageDTO pdto, BoardDTO bdto, HttpServletRequest request, HttpServletResponse response) {
		//Page에 대한 처리가 있어야함.
		if(pdto.getCurrentPage()==0) {
			pdto.setCurrentPage(1);
		}
		if(pdto.getCurrentPageBlock()==0) {
			pdto.setCurrentPageBlock(1);
		}
		boardDao.boardUpdate(bdto);
		return pdto;
	}

	@Override
	public PageDTO deletePro(PageDTO pdto, int num) {
		if(pdto.getCurrentPage()==0) {
			pdto.setCurrentPage(1);
		}
		if(pdto.getCurrentPageBlock()==0) {
			pdto.setCurrentPageBlock(1);
		}
		boardDao.deletePro(num);
		return pdto;
	}
	
}
