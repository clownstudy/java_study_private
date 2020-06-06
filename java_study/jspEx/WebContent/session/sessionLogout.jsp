<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<% 
		session.invalidate();
	%>
	<script type="text/javascript">
	alert("로그아웃 완료")
	location.href="sessionLoginConfirm.jsp";
	</script>
</body>
</html>


