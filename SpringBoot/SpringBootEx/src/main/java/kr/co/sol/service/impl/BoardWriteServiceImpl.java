package kr.co.sol.service.impl;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.sol.board.dao.BoardDAO;
import kr.co.sol.board.dto.BoardVO;
import kr.co.sol.board.dto.PageVO;
import kr.co.sol.board.web.BoardController;
import kr.co.sol.service.BoardWriteService;
import kr.co.sol.common.ServletUpload;

@Service("boardWriteService")
public class BoardWriteServiceImpl implements BoardWriteService {
	// 아래 내용들은 비즈니스로직이지만, 데이터베이스를 요구하지 않고 계산이 없고, 트랜젝션이 발생하지 않기 때문에
	// 컨트롤러에 넣어도 상관없기는 하다.
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Resource
	BoardDAO boardDao;
	
	@Resource(name="fileUtils")
	private ServletUpload fileUtils;
	
	// writeForm에 해당, DAO 필요 없음
	@Override
	public PageVO writeArticle(PageVO pvo) {
		if(pvo.getCurrentPage()==0) {
			pvo.setCurrentPage(1);
		}
		if(pvo.getCurrentPageBlock()==0) {
			pvo.setCurrentPageBlock(1);
		}
		return pvo;
		// view에서 쓸 결과값 저장
	}
	// writePro에 해당 DAO 필요
//	@Override
//	public PageVO writeArticle(PageVO pvo) {
//	
//	}
//	}

	@Override
	public void writeProArticle(BoardVO bvo, MultipartHttpServletRequest mpRequest) {
//		Map<String, Object> multiDTO = ServletUpload.uploadEx(req, res);
//		// dao를 통해서 받은 데이터 저장하기
//		dao.boardWrite((BoardVO)multiDTO.get("dto"));
//		req.setAttribute("pvo",(PageVO)multiDTO.get("pvo"));
		
		// number구하기. (새로운 num)
		int number = boardDao.getNewNum();
		
		// 처음 글 쓸 때 num==0임.
		// 답글 => num!=0
		
		if(bvo.getNum()==0) {
//			bvo.setRef(number);
			bvo.setRe_level(1);
			bvo.setRe_step(1);
		} else {
			bvo.setRe_level(bvo.getRe_level()+1);
			bvo.setRe_step(bvo.getRe_step()+1);
		}
//		bvo.setNum(number);
		
		Map<String, Object> fileMap = null;
			try {
				fileMap = fileUtils.parseInsertFileInfo(bvo, mpRequest);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(fileMap!=null) {
				bvo.setFileNo((int)fileMap.get("fileNo"));
				bvo.setFileSize((long) fileMap.get("fileSize"));
				bvo.setAttachNm((String) fileMap.get("stored_file_name"));
				bvo.setOrgFileNm((String) fileMap.get("org_file_name"));
				logger.info((String) fileMap.get("org_file_name"));
				logger.info("fileno: "+bvo.getFileNo());
				logger.info("fileSize: "+bvo.getFileSize());
				logger.info("setAttachNm: "+bvo.getAttachNm());
			}
		logger.info("boardWriteSerIM"+bvo.getWriter());
		boardDao.boardWrite(bvo);
	}

	@Override
	public PageVO updatePro(PageVO pvo, BoardVO bvo, MultipartHttpServletRequest mpRequest) {
		//Page에 대한 처리가 있어야함.
		if(pvo.getCurrentPage()==0) {
			pvo.setCurrentPage(1);
		}
		if(pvo.getCurrentPageBlock()==0) {
			pvo.setCurrentPageBlock(1);
		}
		Map<String, Object> fileMap = null;
		try {
			fileMap = fileUtils.parseInsertFileInfo(bvo, mpRequest);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(fileMap!=null) {
			bvo.setFileNo((int)fileMap.get("fileNo"));
			bvo.setFileSize((long) fileMap.get("fileSize"));
			bvo.setAttachNm((String) fileMap.get("stored_file_name"));
			bvo.setOrgFileNm((String) fileMap.get("org_file_name"));
		}
		boardDao.boardUpdate(bvo);
		return pvo;
	}

	@Override
	public PageVO deletePro(PageVO pvo, int num) {
		if(pvo.getCurrentPage()==0) {
			pvo.setCurrentPage(1);
		}
		if(pvo.getCurrentPageBlock()==0) {
			pvo.setCurrentPageBlock(1);
		}
		boardDao.deleteArticle(num);
		return pvo;
	}
	
}
