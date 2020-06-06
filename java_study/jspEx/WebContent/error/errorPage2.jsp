<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오류 페이지 연습</title>
</head>
<body>

	<h2> [경고] 오류 발생 </h2>
	<h3> 오류 유형 : <%=exception.getClass().getName() %></h3>
	<h4> 오류 메세지 : <%=exception.getMessage() %></h4>
	<h5> 번역 : 당신의 컴퓨터는 안전하지 않습니다. <a href="#">이곳</a>을 클릭하여 보안을 지켜보세요.</h5>
	<% out.println("<script>alert('경고! 당신의 컴퓨터가 감염되어있을 수도 있습니다.');</script>"); %>
</body>
</html>