<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>html_019_process.jsp</title>
</head>
<body>
<%
	String[] subject=request.getParameterValues("subject");

	String fruit=request.getParameter("fruit");
%>

<p><%= subject[0] %></p>
<p><%= subject[1] %></p>
<p><%= subject[2] %></p>

<p><%= fruit %></p>

<!-- []는 배열을 의미.위에서 [0],[1],[2] 세개로 한 것은, html_019_checked.html에서 넘겨주는게 최대 3개이기 때문이다. -->
<!--  3개를 무조건 다 받는다는 의미로 했기 때문에, 3개를 선택하지 않았으니 망가짐. -->
</body>
</html>