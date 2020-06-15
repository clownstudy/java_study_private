package kr.or.sol.board.service.impl;

import org.springframework.stereotype.Service;

import kr.or.sol.board.dto.PageDTO;
import kr.or.sol.board.service.BoardWriteService;

@Service("boardWriteService")
public class BoardWriteServiceImpl implements BoardWriteService {
	// 아래 내용들은 비즈니스로직이지만, 데이터베이스를 요구하지 않고 계산이 없고, 트랜젝션이 발생하지 않기 때문에
	// 컨트롤러에 넣어도 상관없기는 하다.
	
	
	// writeForm에 해당, DAO 필요 없음
	@Override
	public PageDTO writeArticle(PageDTO pdto) {
		if(pdto.getCurrentPage()==0) {
			pdto.setCurrentPage(1);
		}
		if(pdto.getCurrentPageBlock()==0) {
			pdto.setCurrentPageBlock(1);
		}
		
		// view에서 쓸 결과값 저장
		return pdto;
	}
	// writePro에 해당 DAO 필요
//	@Override
//	public PageDTO writeArticle(PageDTO pdto) {
//	
//	}
//	}
}
