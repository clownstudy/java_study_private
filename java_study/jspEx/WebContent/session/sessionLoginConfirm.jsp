<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("utf-8"); %>   
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원인증 확인</title>
<script type="text/javascript" src="../board2/js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#logout').click(function(){
		$('#form1').submit();
	});
})
</script>
</head>
<body>
<!-- 쿠키를 가져와서 해당 쿠키에 memId가 있는지 확인 -->

<!-- 있으면 회원이 맞고 연결(세션도) 남아 있으므로 유지 -->
<% 
	// 모든 쿠키를 배열로 받는다
	if (session.getAttribute("memId") == null) {
		// memId가 있는지 확인해서 해당 id가져오기
		response.sendRedirect("sessionLogin.jsp");
	} else if(session.getAttribute("memId")!=null){
		// 아래 로직 실행 로그인화면으로 보냄
%>

<!-- 회원이 맞으므로 세션(연결) 부여 -->
<form action="sessionLogout.jsp" id="form1">
	<table>
		<tbody>
			<tr><th>로그인성공</th>
				<td><% session.getAttribute("memId"); %>님이 로그인하셨습니다</td>
			</tr>
			<tr><th colspan="2">
				<div id="logout">로그아웃</div>
			</tr>
		</tbody>
	</table>
</form>
<% } // else if의 close %>
</body>
</html>