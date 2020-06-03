<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directives Tag</title>
</head>
<body>
	<h2>Today is <%=new Date() %></h2>
	<%@ include file="include02_header.jsp" %>
	<h4>------------- 현재 페이지 영역-----------</h4>
</body>
</html>