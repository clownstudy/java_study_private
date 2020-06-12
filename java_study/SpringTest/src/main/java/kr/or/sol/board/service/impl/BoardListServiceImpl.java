package kr.or.sol.board.service.impl;

import java.util.List;

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
		BoardDAO boardDao;
	
	
	@Override
	public int getAllCount() {
		return boardDao.getAllCount();
	}

	@Override
	public List<BoardDTO> getArticles(PageDTO pdto) {
		return null;
	}

}
