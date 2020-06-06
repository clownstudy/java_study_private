<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page errorPage="/error/errorPage2.jsp" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 페이지</title>
</head>
<body>
<!-- 한글이 전송되는 중 한글 깨짐을 방지하는 세팅이 있다.
	get method = URIEncoding="utf-8" // tomcat server.xml
	post method = 

-->
<% String id = request.getAttribute("test").toString(); %> <!-- 일부러 오류나게함. -->
</body>
</html>