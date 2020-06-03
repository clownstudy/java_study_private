<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*, java.util.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 확인</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="./js/boardScript.js"></script>
<script src="./js/jquery.js"></script>
<link href="./css/board.css" rel="stylesheet" >
</head>
<body>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	//DAO를 통해서 해당 글 갖고오기
   //DAO사용.. 인스턴스얻어오기
     BoardDAO dao = BoardDAO.getInstance();
   //해당 인스턴스에서 해당되는 메소드 실행
     BoardDTO dto = dao.getArticle(num);
   //setAttribute를 해줘야 됨
     request.setAttribute("dto",dto);
%>
<form action="updatePro.jsp" method="post" name="writeForm" onsubmit="return sendData()">
		<table border="1">
			<thead>
				<tr>
					<th colspan=2><h3>글수정</h3></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>제목:</th>
					<td><input type="text" size="95%" placeholder="제목을 입력하세요"
						id="subject" name="subject" value="${dto.subject}" /></td>
				</tr>
				<tr>
					<th>내용:</th>
					<td><textarea rows="20" cols="50" placeholder="????" name="content" id="content">
					<c:out value="${dto.content}"/>
					</textarea></td>
				</tr>
				<tr>
					<th>첨부파일:</th>
					<td><input type="file" value="파일 선택" name="attachnm" id="attachnm" value="${dto.attachnm}" /></td>
				</tr>
				<tr>
					<th>작성자:</th>
					<td><c:out value="${dto.writer}"/></td>
				</tr>
				<tr>
					<th>이메일:</th>
					<td><input type="text" placeholder="메일 주소를 입력해봐라" name="email" value="${dto.email}" /></td>
				</tr>
				<tr>
					<th>비밀번호:</th>
					<td><input type="password" placeholder="비밀번호를 입력하세요" name="passwd" value="${dto.passwd}" />
					<input type ="hidden" name="num" value="${dto.num}" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="button" value="글수정" />
						<input type="button" value="글목록으로" id="list1" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>