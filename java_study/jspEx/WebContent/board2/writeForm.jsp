<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="./js/boardScript.js"></script>
<script type="text/javascript" src="./js/jquery_board.js"></script>
<script src="./js/jquery.js"></script>
<link href="./css/board.css" rel="stylesheet">
</head>
<body>
	<jsp:useBean id="dto" class="board.BoardDTO"/>
	<jsp:setProperty property="*" name="dto"/>
	<%-- <%BoardDTO dto = (BoardDTO)request.getAttribute("dto",dto);
			System.out.println("--"+dto.getSubject());%> --%>
	<form action="writePro.jsp" method="post" name="writeForm" onsubmit="return sendData()">
	     <input type="text" name="num" value = "${dto.num}" />
         <input type="text" name="ref" value = "${dto.ref}" />
         <input type="text" name="re_step" value = "${dto.re_step}" />
         <input type="text" name="re_level" value = "${dto.re_level}" />
	
	
	
		<table>
			<thead>
				<tr>
					<th colspan=2><h3>글쓰기</h3></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>제목:</th>
					<c:if test="${dto.num==0}">
					<td><input type="text" size="70%" placeholder="제목을 입력하세요"
						id="subject" name="subject"/></td>
					</c:if>
					<c:if test="${dto.num!=0}">
					<td><input type="text" size="70%" placeholder="제목을 입력하세요"
						id="subject" name="subject" value="[답글]"/></td>
					</c:if>
				</tr>
				<tr>
					<th>내용:</th>
					<td><textarea rows="20" cols="50" placeholder="????" name="content" id="content"></textarea></td>
				</tr>
				<tr>
					<th>첨부파일:</th>
					<td><input type="file" value="파일 선택" name="attachnm" id="attachnm" /></td>
				</tr>
				<tr>
					<th>작성자:</th>
					<td><input type="text" placeholder="이름을 입력해봐라" name="writer" /></td>
				</tr>
				<tr>
					<th>이메일:</th>
					<td><input type="text" placeholder="메일 주소를 입력해봐라" name="email" /></td>
				</tr>
				<tr>
					<th>비밀번호:</th>
					<td><input type="password" placeholder="비밀번호를 입력하세요" name="passwd" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="등록" />
						<input type="button" value="글목록"  id="list1" /></td>
				</tr>
			</tbody>
		</table>
<!-- 	<form action="updateForm.jsp" name="parent" -->
	</form>http://localhost:8080/jspEx/board/writeForm.jsp
</body>
</html>