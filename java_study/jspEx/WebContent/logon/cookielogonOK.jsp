<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "logon.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 인증 확인</title>
</head>
<body>
<!--  id, passwd 받기 -->
<% 
	String id = request.getParameter("id").trim();
	String passwd = request.getParameter("passwd").trim();
	
// <!--  dao호출 실행하고 결과가지고 alert 띄움 -->
	LogonDAO dao = LogonDAO.getInstance();
	int c = dao.userCheck(id,passwd);
	//회원이면 회원페이지 이동 아니면 오류메세지 출력
	if (c == 1){
		// 쿠키를 생성해서 저장하고 (클라이언트에 생성됨)
		Cookie ck = new Cookie("memId",id);
		// 쿠키가 살아있는 시간
		ck.setMaxAge(0*60);
		response.addCookie(ck);
		response.sendRedirect("ckLogonConfirm.jsp");
		
	} else {
		out.println("로그인 에러");
	}
	
	
%>
</body>
</html>