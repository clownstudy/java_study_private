<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
	String fileUploadPath = "C:/TmaxOS";
	DiskFileUpload upload = new DiskFileUpload();
	List items = upload.parseRequest(request); // parseRequest(HttpServletRequest req, int sizeThreshold, long sizeMax, String path)
	//sizeThreshold < 기존에는 파트데이터가 얘보다 크면 파트 데이터를 임시파일에 저장.
	Iterator params = items.iterator(); // 얘는 왜 Iterator를 쓰는지 모르겠음
	while (params.hasNext()){
		FileItem fileItem = (FileItem) params.next();
		if(!fileItem.isFormField()){
			String fileName = fileItem.getName();
			fileName = fileName.substring(fileName.lastIndexOf("/")+1);
			File file=new File(fileUploadPath + "/" + fileName);
			fileItem.write(file);
		}
	}

%>