<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../board2/js/jquery-1.10.2.min.js"></script>
<style type="text/css">
table {
	margin: auto;
	text-align: center;
}
</style>
<script type="text/javascript">
$(function(){
	$('#submit').click(function(){
	
		if($('#id').val() == null || $('#id').val() == ''){ // #id의 value가 null, ''인 상황을 고려해야한다.
			alert("아이디를 입력하세요");
			$('#id').focus();
			return;
		};
		if($('#passwd').val() == null || $('#passwd').val() ==''){
			alert("비밀번호를 입력하세요");
			$('#passwd').focus();
			return;
		};
	$('#logonForm').submit(); // cookielogonOK.jsp로 이동(id, passwd값 post로 전달)
	});
})
</script>
</head>
<body>
	<form method="post" action="cookielogonOK.jsp" id="logonForm">
		<table>
			<tbody>
				<tr>
					<th>아이디</th>
					<td><input type="text" name="id" id="id" size=20 placeholder="id를 넣어주세요" />
				</tr>
				<tr>
					<th>패스워드</th>
					<td><input type="text" name="passwd" id="passwd" size=20 placeholder="password를 넣어주세요" /></td>
				</tr>
				<tr>
					<th colspan="2">
						<div id="submit">
						로그인
						</div>
					</th>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>