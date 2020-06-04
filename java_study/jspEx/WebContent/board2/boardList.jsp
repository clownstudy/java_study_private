<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="board.*, java.util.*" %>
    <%request.setCharacterEncoding("utf-8"); %>   
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
<link href="./board2/css/board.css" rel="stylesheet">
<script type="text/javascript">
function callContent(num){
	document.content.num.value = num;
	document.content.submit();
}
</script>
</head>
<body>
   <!-- 글목록 출력 -->

   		 <h3>게시글목록</h3>
   <c:choose>
   <c:when test="${list.size()==0}">
   <table border="1">
      <tbody class = "class02">
         <tr>
         <th><h4>게시글이 없습니다.</h4></th>
         </tr>
      </tbody>
   </table>
   </c:when>
   <c:when test="${list.size()!=0}">
   <table border="1">
   <thead class = "class01">
      <tr><th>글번호</th>
         <th>글제목</th>
         <th>글작성자</th>
         <th>작성일자</th>
         <th>조회수</th>
         </tr>
      <tbody class = "class03">
      
 	  	<!-- 해당 리스트 출력 jstl사용 -->
      <c:forEach var="dto" items="${list}">
         <tr>
            <td><c:out value="${dto.rr}"/>
            	<input type="hidden" value='<c:out value="${dto.num}" />' />
            </td>
            
            <c:if test="${dto.re_level ==1}">
            <td align="left">
            	<a href="javascript:callContent('<c:out value="${dto.num}" />')">
            	<c:out value="${dto.subject}"/>
            	</a>
            	</td>
            </c:if>
            <c:if test="${dto.re_level > 1}">
            <td align="left">
            	<img src="./board2/content/images/level.gif" width="${dto.re_level*5}">
            	<img src="./board2/content/images/re.gif">
             	<a href="javascript:callContent('<c:out value="${dto.num}" />')">
            	<c:out value="${dto.subject}"/>
            	</a>
            	</td>
            </c:if>
            <td>
            	<a href='mailto:<c:out value="dto.email"/>'>
	            <c:out value="${dto.writer}"/>
	            </a></td>
            <td><c:out value="${dto.reg_date}"/></td>
            <td><c:out value="${dto.readcnt}"/></td>
         </tr>
      </c:forEach>
         <tr>
         	<td colspan="2" align="right">
         		<a href="writeForm.jsp">
         		<input type="button" value="글쓰기">
         	</a>
         	</td>
         </tr>
      </tbody>
   </table>
   
   </c:when>
   </c:choose>
   <form action="content.do" name="content" method="post">
	<input type="hidden" name="num" value='<c:out value="${dto.num}" />'/>
   </form>
<%--       
   
   <c:forEach var="dto" items="${list}">
      <c:out value="${dto.writer}"/>
   </c:forEach>    --%>
   
   
   <!-- 해당 리스트를 출력 jstl사용 -->
   
</body>
</html>