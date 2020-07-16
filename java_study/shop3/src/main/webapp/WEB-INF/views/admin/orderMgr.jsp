<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- views/admin -->
<html>
<head>
<title>Simple Shopping Mall </title>
<link href="../resources/css/main.css" rel="stylesheet" type="text/css">
<script  type="text/javascript" src="../resources/js/mainScript.js" charset="utf-8"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>

<body >
    <c:import url="Top.jsp"/>
	 <c:choose>
	  <c:when test="${idKey!=null}">
	<table class="tableclass1">
		<tr>
			<th>주문번호</th>
			<th>주문자</th>
			<th>주문수량</th>
			<th>주문날짜</th>
			<th>주문상태</th>
		</tr>
		<tr>
			<td>
			<c:if test="${odtoList.size()==null}">
			주문내역이없습니다.
			</c:if>
			<c:if test="${odtoList.size()!=null}">
			test
			</c:if>
			</td>
		</tr>
	</table>	  
	  </c:when>
	  <c:when test="${idKey==null}">
	<table class="tableclass1">
		   <tr>
		   <td style="background-color: #F1F8E0;"> 로그인 하신 후 이용해 주세요</td>
		  </tr>
	</table>
	  </c:when>
	 </c:choose>
  <c:import url="Bottom.jsp"/>
<form name="detail" method="post" action="/orderDetail">
	<input type="hidden" value="${odto.no}" />	
</form> 
  
 
</body>
</html>  
  