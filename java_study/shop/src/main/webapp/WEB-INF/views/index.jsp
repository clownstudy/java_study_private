<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Simple Shopping Mall </title>
<link href="/resources/css/main.css" rel="stylesheet" type="text/css">
<script  type="text/javascript" src="./resources/js/mainScript.js" charset="utf-8"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>

<body >
    <c:import url="Top.jsp"/>
	<table class="tableclass1">
	 <c:choose>
	  <c:when test="${idKey!=null}">
	     <tr > 
      	  <td style="background-color: #F1F8E0;">${mdto.m_name}님 방문해 주셔서 감사합니다.</td>
  	     </tr>
	  </c:when>
	  <c:when test="${idKey==null}">
	  <tr>
	   <td style="background-color: #F1F8E0;"> 로그인 하신 후 이용해 주세요</td>
	  </tr>
	  </c:when>
	 </c:choose>
	
	</table>
  <c:import url="Bottom.jsp"/>
 
</body>
</html>  
  