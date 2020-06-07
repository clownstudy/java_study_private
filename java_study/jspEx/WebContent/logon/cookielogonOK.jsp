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
	String passwd = request.getParameter("passwd").trim(); // cookielogin.jsp에서 보내온 id, passwd값 가져오기.
	
// <!--  dao호출 실행하고 결과가지고 alert 띄움 -->
	LogonDAO dao = LogonDAO.getInstance();
	int c = dao.userCheck(id,passwd); // 데이터 베이스 연결 후, 받은 id, passwd가 데이터베이스와 일치하는지 확인하는 메소드.
	//회원이면 회원페이지 이동 아니면 오류메세지 출력
	if (c == 1){ // dao.userCheck가 true일 때.
		// id를(value) memId로 갖는 쿠키를 생성해서 저장하고 (클라이언트에 생성됨)
		Cookie ck = new Cookie("memId",id);
		// 쿠키가 살아있는 시간
		ck.setMaxAge(10*60); // ck.setMaxAge(a); a를 0으로 지정할 경우, 로그인 하자마자 로그아웃 처리가 되어버림.(쿠키가 0초동안 생존 가능하므로.)
		response.addCookie(ck); // 응답시 cookie를 추가.
		response.sendRedirect("ckLogonConfirm.jsp");
		
	} else { // dao.userCheck가 false일 때.
		out.println("로그인 에러");
	}
%>
</body>
</html>