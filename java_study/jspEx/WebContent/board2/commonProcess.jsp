<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
	String fileUploadPath = "C:/TmaxOS";
	DiskFileUpload upload = new DiskFileUpload();
	List items = upload.parseRequest(request);
	Iterator params = items.iterator();
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