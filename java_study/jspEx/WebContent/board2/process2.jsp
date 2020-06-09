<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%
	MultipartRequest multi = new MultipartRequest(request,
			"C:/TmaxOS",1024*1024*10,"utf-8",new DefaultFileRenamePolicy());
// 업로드 폴더 경로가 C:/TmaxOS, 파일 최대 크기, 인코딩타입, 파일명재정의정책 객체(직접 수정해도 되고, 새로운 객체를 만들어서 써도 됨.)
		// 각각 input의 name을 받아온다.(type이 file인 경우 제외.)
		
		String name1 = multi.getParameter("name1");
		String subject1 = multi.getParameter("subject1");
		String name2 = multi.getParameter("name2");
		String subject2 = multi.getParameter("subject2");
		String name3 = multi.getParameter("name3");
		String subject3 = multi.getParameter("subject3");
		
		Enumeration files = multi.getFileNames();
		
		String file3 = (String) files.nextElement();
		String filename3 = multi.getFilesystemName(file3);
		String file2 = (String) files.nextElement();
		String filename2 = multi.getFilesystemName(file2);
		String file1 = (String) files.nextElement();
		String filename1 = multi.getFilesystemName(file1);
%>
		<table border="1">
			<tr>
				<th width="100">이름</th>
				<th width="100">제목</th>
				<th width="100">파일</th>
			</tr>
			<%
			out.print("<tr><td>"+name1+"</td>");
			out.print("<td>"+subject1+"</td>");
			out.println("<td>"+filename1+"</td></tr>\n");
			out.print("<tr><td>"+name2+"</td>");
			out.print("<td>"+subject2+"</td>");
			out.println("<td>"+filename2+"</td></tr>\n");
			out.print("<tr><td>"+name3+"</td>");
			out.print("<td>"+subject3+"</td>");
			out.println("<td>"+filename3+"</td></tr>\n");
			
			%>
						
		</table>		
