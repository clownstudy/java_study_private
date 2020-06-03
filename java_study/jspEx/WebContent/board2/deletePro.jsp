<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.BoardDAO"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		int num= Integer.parseInt(request.getParameter("num"));
		//DAO가져오기
		BoardDAO dao = BoardDAO.getInstance();
		// DAO메소드 실행
		int r = dao.deleteArticle(num);
		//성공하면 boardList.jsp
		if(r>0) response.sendRedirect("boardList.jsp");// 성공
		else out.print("삭제 실패");// 실패
	
	%>
<%--
	<jsp:useBean id="dto" class="board.BoardDTO"/>
	<jsp:setProperty property="*" name="dto"/>
	<%
		BoardDAO dao = BoardDAO.getInstance();
		// DAO에 해당 데이터 저장하는 로직을 만들고
		// 그 로직을 사용한 후
		int r = dao.boardDelete(dto);
		// 다음페이지로 이동시킴
		if (r>0) response.sendRedirect("boardList.jsp");
		else out.println("저장 못함");
	%>
--%> 
</body>
</html>