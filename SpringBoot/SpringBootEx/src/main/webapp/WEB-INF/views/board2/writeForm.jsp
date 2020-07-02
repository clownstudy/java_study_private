
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="/resources/board2/js/jquery.js"></script>
<script type="text/javascript" src="/resources/board2/js/boardScript.js"></script>
<script type="text/javascript" src="/resources/board2/js/jquery_board.js"></script>
<link href="/resources/board2/css/board.css" rel="stylesheet">
</head>
<body>
	<form action="writePro.sp" method="post" name="writeForm" onsubmit="return sendData()" enctype="multipart/form-data">
	     <input type="text" name="num" value = "${bvo.num}" />
         <input type="text" name="ref" value = "${bvo.ref}" />
         <input type="text" name="re_step" value = "${bvo.re_step}" />
         <input type="text" name="re_level" value = "${bvo.re_level}" />
         <input type="text" name="currentPage" value='<c:out value="${pdto.currentPage}" />'/>   
		 <input type="text" name="currentPageBlock" value='<c:out value="${pdto.currentPageBlock}" />'/> 
		<table>
			<thead>
				<tr>
					<th colspan=2><h3>글쓰기</h3></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>제목:</th>
					<c:if test="${bvo.num==0}">
					<td><input type="text" size="70%" placeholder="제목을 입력하세요"
						id="subject" name="subject"/></td>
					</c:if>
					<c:if test="${bvo.num!=0}">
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
					<td><input type="file" value="파일 선택" name="afile" id="attachnm" /></td>
				</tr>
				<tr>
					<th>작성자:</th>
					<td><input type="text" placeholder="이름을 입력해봐라" name="writer" id="writer"/></td>
				</tr>
				<tr>
					<th>이메일:</th>
					<td><input type="text" placeholder="메일 주소를 입력해봐라" name="email" id="email"/></td>
				</tr>
				<tr>
					<th>비밀번호:</th>
					<td><input type="password" placeholder="비밀번호를 입력하세요" name="passwd" id = "passwd"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<button type="submit" name ="submit" >등록</button>
						<button type="button" name ="list_btn" id="list2" >글목록</button>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>