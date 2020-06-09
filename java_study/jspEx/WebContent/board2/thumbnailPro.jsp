<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.util.Enumeration"%>
<%@page import="board.Thumnail"%>
<%@ page import ="java.util.*" %>
<%@ page import ="java.io.*" %>
<%
String realFolder = ""; // 웹 어플리케이션 상의 절대 경로

// 파일이 업로드 되는 폴더를 지정한다
String saveFolder = "thumbnail";
String encType="utf-8";
int maxSize = 10*1024*1024; // 최대 업로드 될 파일 크기 지정

ServletContext context = getServletContext();
// 현재 jsp페이지의 웹 어플리케이션 상의 절대 경로를 구한다
realFolder = context.getRealPath(saveFolder);
try {
	MultipartRequest multi = null;
	// 	전송을 담당할 컴포넌트를 생성하고 파일을 전송한다.
	// 전송할 파일명을 가지고 있는 객체, 서버상의 절대 경로, 최대 업로드 될 파일 크기 , 문자 코드, 기본 보안 적용
	
	multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
	
	Enumeration files = multi.getFileNames();
	int zoom=5;
	// 파일 정보가 있다면
	while(files.hasMoreElements()){
		//input 태그의 속성이 file인 태그의 name 속성값 : 파라미터 이름
		String name = (String)files.nextElement();
		Thumnail thumnail = new Thumnail();
	// 서버에 저장될 파일 이름
		String filename = multi.getFilesystemName(name);
		String orgFileName = realFolder+"\\"+filename;
		String thumbFileName = realFolder +"\\"+filename;
		thumnail.createImage(orgFileName,thumbFileName,zoom);
		%>

		원본 파일 저장 경로 및 파일 명 <%=orgFileName%><br>
		<img src="<%=orgFileName%>" border="0"><br><br><br>
		"썸네일 이미지 저장경로 및 파일명: "<%=thumbFileName%><br>
		<img src="<%=thumbFileName%>" border="0">
		
<%
	}
} catch(IOException ioe){
 ioe.printStackTrace();
} catch(Exception ex){
 ex.printStackTrace();
}
%>