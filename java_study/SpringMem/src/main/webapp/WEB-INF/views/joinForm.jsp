<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 페이지</title>
<!-- <script type="text/javascript" src="./resources/js/idCheckScript.js"></script> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<!-- <script src="./resources/js/jquery.js"></script> -->
<script type="text/javascript" src="/resources/js/jquery_join.js"></script>
</head>
<body>
	<form name="joinForm" method="post" action="joinPro.mg">
<%-- 	<input type="hidden" value="${pdto.currentPage}" /> --%>
<%-- 	<input type="hidden" value="${pdto.currentPageBlock}" /> --%>
		<table>
			<tr>
				<td>아이디</td>
				<td colspan="2">
					<input type="text" title="아이디" name="memid" id="memid" class="chk" placeholder="아이디를 입력하세요"/>
					<font id="warning" size="2" color=""></font>
<!-- 					<button type="button" onclick="return idVerify()">중복확인</button> -->
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td colspan="2">
					<input type="password" title="비밀번호" class="chk" name="mempass" id="password" placeholder="비밀번호를 입력하세요"/>
				</td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td colspan="2">
					<input type="password" title="비밀번호 확인" class="chk" name="mempass2" id="passChk" placeholder="비밀번호를 다시 입력하세요" />
					<font name="check" size="2" color="red"></font>
				</td>
			</tr>
			<tr>
				<td>이름</td>
				<td colspan="2">
					<input type="text" title="이름" class="chk" name="memname" placeholder="이름을 입력하세요" />
				</td>
			</tr>
			<tr>
				<td>연락처</td>
				<td colspan="2">
					<input type="tel" title="연락처" class="chk" name="memtel"  placeholder="연락처를 입력하세요"/>
				</td>
			</tr>
			<tr>
				<td>생년월일</td>
				<td colspan="2">
					<input type="date" name="membirth" />
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td colspan="2">
					<input type="email" title="이메일" class="chk" name="mememail"  placeholder="이메일을 입력하세요"/>
				</td>
			</tr>
			<tr>
				<td>성별</td>
				<td>
					<input type="radio" id="m" name="memgender" value="m" checked="checked"/>
					<label for="m">M</label>
				</td>
				<td>
					<input type="radio" id="f" name="memgender" value="f" checked="checked"/>
					<label for="f">F</label>
				</td>
			</tr>
		</table>
			<button type="button" id="submit1">가입</button>
			<button type="button">취소</button>
	</form>
</body>
</html>