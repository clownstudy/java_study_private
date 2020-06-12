<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.or.sol.board.dto.*, java.util.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 확인</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="/resources/board2/js/boardScript.js"></script>
<script type="text/javascript" src="/resources/board2/js/jquery_board.js"></script>
<script src="/resources/board2/js/jquery.js"></script>
<link href="/resources/board2/css/board.css" rel="stylesheet" >
</head>
<body>
<form action="updatePro.do" method="post" name="updateForm" onsubmit="return sendData()">
	<input type="hidden" name="re_step" value="${dto.re_step}" />
	<input type="hidden" name="re_level" value="${dto.re_level}" />
	<input type="hidden" name="currentPage" value='<c:out value="${pdto.currentPage}" />'/>   
	<input type="hidden" name="currentPageBlock" value='<c:out value="${pdto.currentPageBlock}" />'/> 
	
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
					<td><input type="text" name="writer" value='<c:out value="${dto.writer}"/>' /></td>
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
						<input type="submit" value="글수정"/>
						<input type="button" value="글목록으로" id="list3" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>