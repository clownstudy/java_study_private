<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%
	MultipartRequest multi = new MultipartRequest(request,
			"C:/TmaxOS",1024*1024*10,"utf-8",new DefaultFileRenamePolicy());

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
// 		Enumeration params = multi.getParameterNames();
// 		while(params.hasMoreElements()){
// 			String name = (String) params.nextElement();
// 			String value = multi.getParameter(name);
// 			out.println(name+" = "+value+"<br>");
// 		}
// 		out.println("------------------------------------<br>");
		
// 		// Enumeration files = multi.getFileNames();
		
// 		while(files.hasMoreElements()){
// 			String name = (String) files.nextElement();
// 			String filename = multi.getFilesystemName(name);
// 			String original = multi.getOriginalFileName(name);
// 			String type = multi.getContentType(name);
// 			File file = multi.getFile(name);
			
// 			out.println("요청 파라미터 이름 : " + name + "<br>");
// 			out.println("subject 이름 : " + name + "<br>");
// 			out.println("실제 파일 이름 : " + original + "<br>");
// 			out.println("저장 파일 이름 : " + filename + "<br>");
// 			out.println("파일 콘텐트  : " + type + "<br>");
			
// 			if (file != null){
// 				out.println("파일 크기 : "+file.length());
// 			}
// 		}
