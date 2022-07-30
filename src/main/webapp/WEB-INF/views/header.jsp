<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./include/includeFile.jsp" %>
<!DOCTYPE html>
<html>

<body>
  <div id="header">
    <div class="header-inner">
      <h1 class="header-logo"><a href="${path}/"><img src="${path}/resources/img/logow.png" width="80px" alt="무비문"></a></h1>
      <div id="gnb">
        <h2 class="blind">대표메뉴</h2>
        <ul class="nav">
          <li><a href="${path}/contents/movie">상영작</a></li>
          <li><a href="${path}/board/mainlistAll">공지사항</a></li>
        </ul>
      </div>
      <ul class="user-menu">
        <c:choose>
          <c:when test="${empty sessionScope.id}">
            <li> <a href="${path}/member/login">로그인</a></li>
            <li> <a href="${path}/member/agree">회원가입</a></li>
          </c:when>
          <c:otherwise>
            <li><a href="${path}/member/mypage"> ${sessionScope.id}님 </a>
            <li><a href="${path}/logout"> 로그아웃 </a>
          </c:otherwise>
        </c:choose>
      </ul>
    </div>
  </div>
</body>

</html>