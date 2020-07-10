<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Simple Shopping Mall</title>
<link href="./resources/css/main.css" 
             rel="stylesheet" type="text/css">
<script src="./resources/js/jquery-1.10.2.min.js"></script>
<script src="./resources/js/mainScript.js" charset="utf-8" 
          type="text/javascript"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="./resources/js/zipCheck.js"></script>
</head>

<body>
    <c:import url="Top.jsp"/>
	<form name="regForm" method="post" action="memberUpdateProc">
	<table class="tableclass2">
	<thead>
	     <tr> <th colspan=3  class="theadstyle"> 회원가입 </th></tr>
	   </thead>
	<tbody >
		<tr> 
			<td  class="tbodystyle" >아이디</td>
			<td style="width: 60%"  class="tbodystyle">
			<input type="text" name="mem_id" size="30" class="chk" title="아이디"  readonly="readonly" 
			   value="${mdto.mem_id}"> 
			</td>
		</tr>
		<tr> 
			<td  class="tbodystyle">패스워드</td>
			<td  class="tbodystyle">
			 <input type="password"  id= "passwd" name="m_passwd" size="30" class="chk" title="패스워드" placeholder="패스워드를 입력하시오.">
			  <font id="check" size="2" color="red"></font> 
			</td>
		</tr>
		<tr> 
			<td class="tbodystyle">패스워드 확인</td>
			<td class="tbodystyle">
			<input type="password" id= "passwd2" name="m_repasswd" size="30" class="chk" title="패스워드 확인" placeholder="패스워드를  확인하시오."> </td>
		</tr>
		<tr> 
			<td class="tbodystyle">이름</td>
			<td class="tbodystyle"><input type="text" name="m_name" size="30" class="chk" title="이름" value="${mdto.m_name }" > </td>
		</tr>
		<tr> 
		<td class="tbodystyle">이메일</td>
			<td class="tbodystyle">
			<input type="text" name="m_email" size="50" class="chk" title="이메일" value="${mdto.m_email}"> </td>
		</tr>
		<tr>  
			<td class="tbodystyle">전화번호</td>
			<td class="tbodystyle">
			<input type="text" name="m_phone" size="40" class="chk" title="전화번호" value="${mdto.m_phone}"> </td>
		</tr>
		
		 <tr>
                <td class="tbodystyle">우편번호</td>
                <td class="tbodystyle">
                <input type="text" name="zipcode" id="sample6_postcode" readonly="readonly" value="${mdto.zipcode}"> 
                <input type="button" onclick="zipCheck()" class="chk" title="우편번호" value="우편번호 찾기">
                </td>
            </tr>
 
            <tr>
                <td class="tbodystyle">주소</td>
                <td class="tbodystyle">
                <input type="text" size="100" name="address" id="sample6_address" 
                      class="chk" title="주소" readonly="readonly" value="${mdto.address}"></td>
            </tr>
            <tr>
                <td class="tbodystyle">주소상세</td>
                <td class="tbodystyle">
                <input type="text" size="100" name="address2" id="sample6_address2" 
                   class="chk" title="상세주소" readonly="readonly" value="${mdto.address2}"></td>
            </tr>
		<tr>  
			<td class="tbodystyle">직업</td>
			<td class="tbodystyle">
				<select name="m_job">
					<option value="0">선택하세요.
					<option value="회사원">회사원
					<option value="연구전문직">연구전문직
					<option value="교수학생">교수학생
					<option value="일반자영업">일반자영업
					<option value="공무원">공무원
					<option value="의료인">의료인
					<option value="법조인">법조인
					<option value="종교,언론,에술인">종교.언론/예술인
					<option value="농,축,수산,광업인">농/축/수산/광업인
					<option value="주부">주부
					<option value="무직">무직
					<option value="기타">기타
				</select>
			</td>
		</tr>
		<tr> 
			<td colspan="3"  class="theadstyle"> 
			<button type="submit" id ="inputCheck">정보수정</button> 
			&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
			<button type="reset" onclick="javascript:location.href='/'"> 취소 </button>
			</td>
		</tr>
	</tbody>
	</table>
	</form>
   <c:import url="Bottom.jsp"/>
</body>
</html> 

