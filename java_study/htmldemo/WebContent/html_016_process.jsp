<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>html_016_process.jsp</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	//?fid=홍길동&fpass=1234
	String fkey=request.getParameter("fid");
	String fval=request.getParameter("fpass");
	
	%>
   <!-- request.setCharacterEncoding 이 post로 받을 때 안깨지게 하는 녀석임 -->	
	<p><%= fkey %> / <%= fval %></p>
</body>
</html>