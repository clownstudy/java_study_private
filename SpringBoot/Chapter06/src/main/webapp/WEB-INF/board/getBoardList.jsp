<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>글 목록</title>
</head>
<body>
<center>
<h1>게시글 목록</h1>
<table border="1" cellpadding="0" cellspacing="0" width="700">
<tr>
	<th bgcolor="orange" width="100">번호</th>
	<th bgcolor="orange" width="200">제목</th>
	<th bgcolor="orange" width="150">작성자</th>
	<th bgcolor="orange" width="150">등록일</th>
	<th bgcolor="orange" width="100">조회수</th>
</tr>
<c:forEach var="board2" items="${boardList }">
<tr>
	<td>${board2.seq }</td>
	<td align="left"><a href="getBoard?seq=${board2.seq }">${board2.title }</a></td>
	<td>${board2.writer }</td>
	<td><fmt:formatDate value="${board2.create_date }" pattern="yyyy-MM-dd"></fmt:formatDate>
	<td>${board2.cnt }</td>
</tr>
</c:forEach>
</table>
<br>
<a href="insertBoard">새글 등록</a>
</center>
</body>
</html>