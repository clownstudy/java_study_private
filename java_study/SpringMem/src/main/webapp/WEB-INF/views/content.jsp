<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.co.marketerz.memtb.*, java.util.*" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <% request.setCharacterEncoding("utf-8"); %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글내용 </title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="/resources/js/boardScript.js"></script>
<script type="text/javascript" src="/resources/js/boardjquery.js"></script>
<script type="text/javascript" src="/resources/js/jquery_board.js"></script>
<link href="/resources/css/board.css" rel="stylesheet" />
</head>
<body>
   <table border=1>
         <thead>
            <tr>
               <th colspan=2>
                  <h3>글쓰기</h3>
               </th>
            </tr>
         </thead>
         <tbody>
            <tr>
               <th>아이디 : </th>
               <td><input type="text" value='<c:out value="${mdto.memid}"/>'/></td>
            </tr>
            <tr>
               <th>비밀번호 : </th>
               <td><input type="password" value='<c:out value="${mdto.mempass}"/>'/></td>
            </tr>
            <tr>
               <th>이름 : </th>
               <td><input type="text" value='<c:out value="${mdto.memname}"/>'/></td>
            </tr>
            <tr>
               <th>연락처:</th>
               <td><input type="text" value='<c:out value="${mdto.memtel}"/>'/></td>
            </tr>
            <tr>
               <th>생일:</th>
               <td><input type="text" value='<c:out value="${mdto.membirth}"/>'/></td>
            </tr>
            <tr>
               <th>이메일 :</th>
               <td><input type="text" value='<c:out value="${mdto.mememail}"/>'/></td>
            </tr>
            <tr>
               <th>가입일 :</th>
               <td><c:out value="${mdto.regdate}"/></td>
            </tr>
            <tr>
               <th>성별 :</th>
               <td><input type="text" value='<c:out value="${mdto.memgender}"/>'/></td>
            </tr>
            <tr>
               <td colspan="2" align = "center">
               <input type="button" id="up_btn" value="정보 수정" onclick="pwCheck('u');"/>
               <input type="button" id="del_btn" value="회원 탈퇴" onclick="pwCheck('d');"/>
               <input type="button" id="list1" value="회원 목록" />
               </td>
            </tr>
         </tbody>
      </table>
      <form action="" name = "parentForm" method="post">
     	 <input type="text" id="currentPage" name="currentPage" value='<c:out value="${pdto.currentPage}" />'/>   
		 <input type="text" id="currentPageBlock" name="currentPageBlock" value='<c:out value="${pdto.currentPageBlock}" />'/>   
         <input type="text" name="mempass" value = "${mdto.mempass}" />
         <input type="text" name="memid" value = "${mdto.memid}" />
         <input type="text" name="memseq" value = "${mdto.memseq}" />
      </form>
</body>
</html>