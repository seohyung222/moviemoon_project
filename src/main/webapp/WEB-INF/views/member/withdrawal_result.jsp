<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>회원 탈퇴</title>
  <link rel="stylesheet" href="${path}/resources/css/style.css">
</head>

<body>
  <div class="withdrawal_result_wrap">
    <div class="withdrawal_result">
      <img src="${path}/resources/img/tick-inside-circle.png">
      <div class="join-result-main">회원탈퇴 완료</div>
      <div class="join-result-sub">회원님의 무비문 회원탈퇴가 완료되었습니다.</div>
    </div>
    <div class="welcom-msg">
      <p>그동안 무비문을 이용해 주셔서 진심으로 감사드립니다.</p>
      <p>회원님의 계정은 비활성화되었으며 30일 이내에 영구 삭제될 예정입니다.<br>
        <br>
        <br>
        그동안 무비문 서비스를 아끼고 사랑해주셔서 고맙습니다.
        더욱더 노력하고 발전하는 무비문이 되겠습니다.
        <br>
      </p>
    </div>
  </div>
  <div class="join-button-wrap">
    <a href="${path}/" class="join-button join-submit">홈으로</a>
  </div>
  <jsp:include page="../footer.jsp" flush="false" />
</body>

</html>