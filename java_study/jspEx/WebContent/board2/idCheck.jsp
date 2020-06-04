<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 확인</title>
<script type="text/javascript" src="/jspEx/board2/js/boardScript.js"></script>  
</head>
<body>
	<table>
		<tr>
			<td>비밀번호 입력:</td>
			<td><input type="password" id="pwCheck" /></td>
		</tr>
		<tr>
			<td colspan=2>
				<input type="button" value="확인" onclick="setParentText();"/>
			</td>
			<td colspan=2>
				<input type="button" value="닫기" onclick="window.close();"/>
			</td>
		</tr>
	</table>
</body>
</html>