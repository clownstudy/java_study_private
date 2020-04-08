<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>html_017_process.jsp</title>
</head>
<body>

	<%
		String subject=request.getParameter("subject");
	
		String subgroup=request.getParameter("subgroup");
	%>
	
	<p><%= subgroup %></p>
	<p><%= subject %></p>
	
	
<!--  파라미터 값이랑 변수명(String에서 subject)를 맞추는 것이 가독성 면에서 좋음  -->
</body>
</html>