<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Simple Shopping Mall</title>
<link rel="stylesheet" href="/resources/main/main.css">
</head>
<body>
<c:import url="Top.jsp" />
<br>
<!--  index 내용 시작 -->
<table class="tableclass2">
<thead>
	<tr>
		<th colspan="3" class="theadstyle">회원 가입</th>
	</tr>
<tbody>
	<tr>
		<td class="tbodystyle">아이디</td>
		<td style="width: 57%" class="tbodystyle">
			<input type="text" name="mem_id" size="30">
			<input type="button" value="ID중복확인" onClick="idCheck(this.form.mem_id.value)">
		</td>
		<td class="tbodystyle">아이디를 적어주세요</td>
	</tr>
	<tr>
		<td class="tbodystyle">패스워드</td>
		<td class="tbodystyle">
			<input type="password" name="mem_passwd" size="30" /></td>
		<td class="tbodystyle">패스워드를 적어주세요</td>
	</tr>
	<tr>
		<td class="tbodystyle">패스워드확인</td>
		<td class="tbodystyle">
			<input type="password" name="mem_repasswd" size="30"/></td>
		<td class="tbodystyle">패스워드를 확인합니다</td>
	</tr>
	<tr>
		<td class="tbodystyle">이름</td>
		<td class="tbodystyle">
			<input type="text" name="mem_name" size="30"/></td>
		<td class="tbodystyle">이름을 적어주세요</td>
	</tr>
	<tr>
		<td class="tbodystyle">이메일</td>
		<td class="tbodystyle">
			<input type="text" name="mem_email" size="50"/></td>
		<td class="tbodystyle">이메일을 적어주세요</td>
	</tr>
	<tr>
		<td class="tbodystyle">전화번호</td>
		<td class="tbodystyle">
			<input type="text" name="mem_phone" size="40"/></td>
		<td class="tbodystyle">전화번호를 적어주세요</td>
	</tr>
	<tr>
		<td class="tbodystyle">우편번호</td>
		<td class="tbodystyle">
			<input type="text" name="mem_zipcode" size="10">
			<input type="button" value="우편번호찾기" onClick="zipCheck()"></td>
		<td class="tbodystyle">우편번호를 적어주세요</td>
	</tr>
	<tr>
		<td class="tbodystyle">주소</td>
		<td class="tbodystyle">
			<input type="text" name="mem_address" size="100"/></td>
		<td class="tbodystyle">주소를 적어주세요</td>
	</tr>
	<tr>
		<td class="tbodystyle">직업</td>
		<td class="tbodystyle">
			<select>
				<option>학생</option>
				<option>백수</option>
				<option>직장인</option>
				<option>개발자</option>
				<option>군인</option>
			</select>
		</td>
		<td class="tbodystyle">직업을 선택해주세요</td>
	</tr>
	<tr>
		<td colspan="3" class="theadstyle" >
			<button type="submit" id="inputCheck">회원가입</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="다시쓰기" alt="모두 지워짐">
		</td>
	</tr>  
</tbody>
</table>
<!-- index 내용 끝 -->
<c:import url="Bottom.jsp" />
</body>
</html>