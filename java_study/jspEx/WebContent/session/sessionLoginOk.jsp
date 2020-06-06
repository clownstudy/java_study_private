<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "logon.*" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 인증 확인</title>
</head>
<body>
<jsp:useBean id ="dto" class="logon.LogonDTO" />
<jsp:setProperty property="*" name="dto" />
<% 
	
// <!--  dao호출 실행하고 결과가지고 alert 띄움 -->
	LogonDAO dao = LogonDAO.getInstance();
	int c = dao.userCheck(dto.getId(),dto.getPasswd());
	//회원이면 회원페이지 이동 아니면 오류메세지 출력
	if (c == 1){
		// 세션처리
		session.setAttribute("memId",dto.getId());
		response.sendRedirect("sessionLoginConfirm.jsp");
		
	} else {
		out.println("로그인 에러");
	}
	
%>
</body>
</html>