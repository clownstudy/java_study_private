<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="kr.co.marketerz.memtb.*, java.util.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
<link href="/resources/css/board.css" rel="stylesheet">
<script type="text/javascript">
function callContent(memseq){
	document.content.memseq.value = memseq;
	document.content.submit();
}
</script>
</head>
<body>
   <!-- 글목록 출력 -->

   <h3 align="center">게시글목록</h3>
   
   <h4 align="center">전체 회원  <c:out value="${allCnt}" />건</h4>
   <c:choose>
   <c:when test="${list.size()==0}">
   <table border="1">
      <tbody class = "class02">
         <tr>
         <th><h4>회원이 없습니다.</h4></th>
         </tr>
      </tbody>
   </table>
   </c:when>
   <c:when test="${list.size()!=0}">
   <table border="1">
   <thead class = "class01">
      <tr><th>가입순서</th>
         <th>회원명(ID)</th>
         <th>생년월일</th>
         <th>가입일자</th>
         <th>연락처</th>
         <th>성별</th>
         </tr>
      <tbody class = "class02">
      
 	  	<!-- 해당 리스트 출력 jstl사용 -->
      <c:forEach var="mdto" items="${list}" varStatus="i">
         <tr>
            <td><c:out value="${mdto.rr}"/>
            	<input type="hidden" value='<c:out value="${mdto.memseq}" />' />
            </td>
            
            <td align="left">
            <a href="javascript:callContent('<c:out value="${mdto.memseq}" />')">
<%--             	<a href="#" onclick="javascript:callContent('<c:out value="${mdto.memseq}" />')"> --%>
            	<c:out value="${mdto.memname}"/>(<c:out value="${mdto.memid}" />)
            	</a>
            	</td>
            <td align="left">
            	<c:out value="${mdto.membirth}"/>
            	</td>
            <td>
            	<a href='mailto:<c:out value="dto.email"/>'>
	            <c:out value="${mdto.regdate}"/>
	            </a></td>
            <td><c:out value="${mdto.memtel}"/></td>
            <td align="center">
	            <c:if test="${fn:contains(mdto.memgender,'f')}" >
	            	<c:out value="여성" />
	            </c:if>
	            <c:if test="${fn:contains(mdto.memgender,'m')}" >
	            	<c:out value="남성" />
	            </c:if>
	        </td>
         </tr>
      </c:forEach>
         <tr>
         	<td colspan="5" align="right">
         		<a href="joinForm.mg">
         		<input type="button" value="회원가입">
         	</a>
         	</td>
         </tr>
      </tbody>
   </table>
      </c:when>
      </c:choose>
   <form action="content.mg" name="content" method="post">
	<input type="text" name="currentPage" value='<c:out value="${pdto.currentPage}" />'/>   
	<input type="text" name="currentPageBlock" value='<c:out value="${pdto.currentPageBlock}" />'/>   
	<input type="text" name="memseq" />
   </form>
     
<!--    <h1 style="text-align: center"> -->
<%--   	 	<c:if test="${pdto.startPage>pdto.pageBlock}"><a href="boardList.sp?currentPage=${pdto.startPage-pdto.pageBlock}&currentPageBlock=${pdto.currentPageBlock-1}">[이전]</a></c:if> --%>
<%--    		<c:forEach var="i" begin="${pdto.startPage}" end="${pdto.endPage}"> --%>
<%-- 			<a href="boardList.sp?currentPage=${i}&currentPageBlock=${pdto.currentPageBlock}"> <c:out value="[${i}]"/></a> --%>
<%--   	 	</c:forEach> --%>
<%--   	 	<c:if test="${pdto.allPage>pdto.endPage}"><a href="boardList.sp?currentPage=${pdto.endPage+1}&currentPageBlock=${pdto.currentPageBlock+1}">[다음]</a> --%>
<%--   	 		<input type="text" value="${pdto.allPage}" /> --%>
<%--   	 	</c:if> --%>
<!--    </h1> -->
<%--    </c:when> --%>
<%--    </c:choose> --%>
<!--    <!-- 해당 리스트를 출력 jstl사용 -->
<!--    <form action="content.mg" name="content" method="post"> -->
<%-- 	<input type="hidden" name="currentPage" value='<c:out value="${pdto.currentPage}" />'/>    --%>
<%-- 	<input type="hidden" name="currentPageBlock" value='<c:out value="${pdto.currentPageBlock}" />'/>    --%>
<%-- 	<input type="hidden" name="memseq" value='<c:out value="${mdto.memseq}"/>' />  지운 이유 : 위에서 onclick 시 num 보내줌--%>
<!--    </form> -->
<!-- </body> -->
<!-- </html> -->