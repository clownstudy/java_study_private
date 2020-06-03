<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag 1</title>
</head>
<body>
	<h3> 이 파일은 first.jsp입니다.</h3>
	<jsp:include page="second_include.jsp">
		<jsp:param value="<%=new java.util.Date() %>" name="date"/>
	</jsp:include>
	--------- this is first page ! ---------
</body>
</html>