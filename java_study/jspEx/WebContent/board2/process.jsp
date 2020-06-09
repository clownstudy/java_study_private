<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
	MultipartRequest multi = new MultipartRequest(
			request, "C:/TmaxOS",1024*1024*10,"utf-8",new DefaultFileRenamePolicy()
			); // HttpServletRequest, saveDirectory, maxPostSize, encoding, FileRenamePolicy 순.

		// Enumeration은 인터페이스(열거형), Iterator의 전 버전.
		// Enumeration       =>     Iterator
		// hasMoreElements() => 	hasNext()
		// nextElement() 	 => 	next()
		
		Enumeration params = multi.getParameterNames();
		// multi> input 중 file이 아닌 parameter의 name을 가져온다.
		
		while(params.hasMoreElements()){
			String name = (String) params.nextElement(); // name에 name을 담는다.
			String value = multi.getParameter(name);// value에 name의 value를 담는다.
			out.println(name+" = "+value+"<br>");
		}
		out.println("------------------------------------<br>");
		
		Enumeration files = multi.getFileNames(); // input 중  file의  name을 가져온다.
		
		while(files.hasMoreElements()){
			String name = (String) files.nextElement();
			String filename = multi.getFilesystemName(name); // 서버에 업로드된 파일 이름을 반환
			String original = multi.getOriginalFileName(name); // 사용자가 직접 지정한 파일명을 반환
			// getFilesystemName 메소드는 기존 업로드된 파일명과 새로 업로드하는 파일명이 중복될 시,
			// 파일명 뒤에 변경된 이름을 반환한다.
			// 즉, getFilesystemName은 최종적으로 업로드된 파일명을 반환
			// getOriginalFileName은 최초 업로드 시의 파일명을 반환한다.
			String type = multi.getContentType(name); // 업로드된 파일의 contentType을 반환
			File file = multi.getFile(name);// 서버 상에 업로드된 파일에 대한 파일 객체를 반환(절대경로를 포함한 파일명 반환.)
			
			out.println("요청 파라미터 이름 : " + name + "<br>");
			out.println("subject 이름 : " + name + "<br>");
			out.println("실제 파일 이름 : " + original + "<br>");
			out.println("저장 파일 이름 : " + filename + "<br>");
			out.println("파일 콘텐트  : " + type + "<br>");
			
			if (file != null){ // 업로드에 성공했을 경우
				out.println("파일 크기 : "+file.length()); // (바이트 단위) 파일 크기를 반환
			}
		}
%>