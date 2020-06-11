package common;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import board.BoardDTO;
import board.PageDTO;
public class ServletUpload {
		private static final int MEMORY_THRESHOLD
		= 1024*1024*3; // 3MB
		private static final int MAX_FILE_SIZE
		= 1024*1024*5; // 5MB
		private static final int MAX_REQUEST_SIZE
		= 1024*1024*5; // 5MB
	
	// 메소드
	public static Map<String, Object> uploadEx(HttpServletRequest req, HttpServletResponse res) throws Exception{
		PageDTO pdto = new PageDTO();
		BoardDTO dto = new BoardDTO();
		try {
			// 1. upload 절대경로 선언
			String UPLOAD_DIR = "C:/TmaxOS";
			String newfileName = "";
			// 2. 파일을 읽기위한 객체 생성
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// 3. 업로드 요청을 처리하는 servletfileupload 생성
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 4. 업로드 요청 파싱해서 FileItem 목록 구함
			List<FileItem> items;
				items = upload.parseRequest(req);
			// 순서대로 가져오기
			Iterator<FileItem> iter = items.iterator();
			int currentPage = 0;
			int currentPageBlock = 0;
			while(iter.hasNext()) {
				FileItem item = iter.next();
				String name = null;
				String value = null;
				// 타입이 파일인지 확인 : isFormField() -> type=file인 경우 false, 폼데이터인 경우 true
					if(item.isFormField()) { // 텍스트 입력인 경우
						name = item.getFieldName(); // 태그 name
						value = item.getString("utf-8");
						
					if(name.equals("currentPage")) {
						if(value==null||value.equals("0")) {
							currentPage = 1;
						} else {
							currentPage = Integer.parseInt(value);
						}
					}
					if(name.equals("currentPageBlock")) {
						if(value==null||value.equals("0")) {
							currentPageBlock = 1;
						} else {
							currentPageBlock = Integer.parseInt(value);
						}
					}
					pdto.setCurrentPage(currentPage);
					pdto.setCurrentPageBlock(currentPageBlock);
					// writeForm에서 보내준 데이터 모두 받기
					// num, ref, re_step, re_level, writer, subject, content, passwd, email,attachnm 
					if(name.equals("num"))
						dto.setNum(Integer.parseInt(value));
					if(name.equals("ref"))
						dto.setRef(Integer.parseInt(value));
					if(name.equals("re_step"))
						dto.setRe_step(Integer.parseInt(value));
					if(name.equals("re_level"))
						dto.setRe_level(Integer.parseInt(value));
					if(name.equals("writer")) dto.setWriter(value);
					if(name.equals("subject")) dto.setSubject(value);
					if(name.equals("content")) dto.setContent(value);
					if(name.equals("email")) dto.setEmail(value);
					if(name.equals("passwd"))	dto.setPasswd(value);
					// 위 if를 map으로 처리할 수 있음. name, value로 dao에서 get하면 끝. 
					
				} else { // 아니면 다른 필드임? = file
					name = item.getFieldName();
						String fileName = item.getName(); // 파일 이름
						String contentType = item.getContentType(); // 콘텐트 타입
						long sizeInBytes = item.getSize(); // 파일 사이즈
						
						if(item.getString("utf-8")!=null && !item.getString("utf-8").contentEquals("")) {
						// 현재 날짜 시간분까지 생성해서 파일명에 적용
						String now = new SimpleDateFormat("yyyyMMddHm").format(new Date());
						int ext = -1;
						ext=fileName.lastIndexOf('.'); // lastIndexOf는 요소가 존재하지 않으면 -1 반환
						//저장하고자 하는 파일의 이름
						newfileName = fileName.substring(0,ext)+"_"+now+fileName.substring(ext,fileName.length());
						// 데이터 저장 File(위치, 파일명)
						// 만들어놓은 웹컨텐트 /file/photo/____ < 이곳에 저장
						dto.setAttachnm(UPLOAD_DIR+"/"+newfileName); // 실제로는 UPLOAD_DIR 부분이 없어야함.
						item.write(new File(UPLOAD_DIR, newfileName));
					}
//						else { // 첨부파일이 없을 때
//						System.out.println("첨부파일이 없습니다.");
//					}
				}
			}
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	} catch (FileUploadException e1) {
		e1.printStackTrace();
	} catch (Exception e2) {
		e2.printStackTrace();
	}
	Map<String, Object> multiDTO = new HashMap<String,Object>();
	multiDTO.put("pdto", pdto);
	multiDTO.put("dto",dto);
	return multiDTO;
}
}