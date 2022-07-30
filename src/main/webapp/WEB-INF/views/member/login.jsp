<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp" %>    
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>로그인</title>
  <link rel="stylesheet" href="${path}/resources/css/style.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript" src="${path}/resources/js/login.js"></script>
</head>
<body>
  <div class="membership-login-wrap">
    <h2 class="login-logo">
      <a href="${path}/"><img src="${path}/resources/img/logo.png" alt=""></a>
    </h2>
    <form action="${path}/member/login_Post" id="login-post" method="post" accept-charset="UTF-8">
      <div class="login-form">
        <input type="text" id="id" name="id" placeholder="ID" title="아이디 입력">
        <input type="password" id="password" name="password" placeholder="PASSWORD" title="비밀번호 입력">
      </div>
      <div class="login-btn-area">
        <button onclick="loginCheck(event)" class="login-btn">로그인</button>
      </div>
      <div class="login-lnk">
        <ul class="login-menu">
          <li><a href="${path}/member/agree">회원가입</a></li>
        </ul>
      </div>
    </form>
  </div>

</body>

</html>