<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>회원가입</title>
  <link rel="stylesheet" href="${path}/resources/css/style.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
  <script type="text/javascript" src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
  <script>
  $(document).ready(function () {
	  var idReg = /^[a-zA-Z0-9]{6,10}$/;
	  var pwReg = /^[a-zA-Z0-9]{6,10}$/;
	  var nameReg = /^[가-힣]+$/;
	  var emailReg =  /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/
	  $('.join-submit').on('click', function (e) {
	    e.preventDefault();
	    //아아디
	    if ($("#id").val() == "") {
	      $("#id").focus();
	      return false;
	    }
	    //아이디 테스트
	    if (!idReg.test($("#id").val())) {
	      $("#id").focus();
	      return false;
	    }
	    //비밀번호
	    if (!pwReg.test($("#password").val())) {
	      $("#password").focus();
	      return false;
	    }
	    //비밀번호 확인
	    if ($("#password").val() !== $("#passwordCheck").val()) {
	      $("#passwordCheck").focus();
	      return false;
	    }
	    // 아이디랑 비밀번호랑 같은지
	    if ($("#id").val() == ($("#password").val())) {
	      $("#password").focus();
	      return false;
	    }
	    //이름
	    if (!nameReg.test($("#name").val())) {
	      $("#name").focus();
	      return false;
	    }

	    if (!emailReg.test($("#email").val())) {
	      //  $("#email").val("");
	      $("#email").focus();
	      return false;
	    }
	    $('.join-form').submit();
	          
	  });
	  //회원가입 전송
	  
	  $('#id').on('blur', function (e) {
		e.preventDefault();
	    var user_id = $('#id').val();

	    if (user_id == "") {
	      $("#idMessage").show();
	      $("#idMessage").text("아이디를 입력해주세요.");
	      return false;
	    }
	    $.ajax({
	      url: '${path}/member/idcheck',
	      type: 'post',
	      data: {
	        userId: user_id
	      },
	      dataType: 'json',
	      success: function (userId) {
	        console.log("userId:", userId);
	        console.log("user_id:", user_id);
	        if (userId == 1) {
	          $("#idMessage").show();
	          $("#idMessage").text("이미 가입된 아이디입니다.");
	          $("#id").val("");
	          return false;
	        } else if (!idReg.test(user_id)) {
	          $("#idMessage").show();
	          $("#idMessage").text("아이디는 숫자 문자 포함 6~10자로 입력해주세요.");
	          return false;
	        } else {
	          $("#idMessage").hide();
	          return false;
	        }
	      }, //end-success
	      error: function () {
	        console.log("실패");
	      } //end-error
	    }); //ajax
	  });

	  $('#password').on('blur', function (e) {
		e.preventDefault();
	    if ($('#password').val() === "") {
	      $("#pwMessage").show();
	      $("#pwMessage").text("비밀번호를 입력해주세요.");
	      return false;
	    } else if (!pwReg.test($("#password").val())) {
	      $("#pwMessage").show();
	      $("#pwMessage").text("비밀번호는 숫자 문자 포함 6~10자로 입력해주세요.");
	      return false;
	    } else if ($("#id").val() == ($("#password").val())) {
	      $("#pwMessage").show();
	      $("#password").val("");
	      $("#pwMessage").text("비밀번호가 아이디랑 같습니다.");
	      return false;
	    } else {
	      $("#pwMessage").hide();
	      return false;
	    }
	  });

	  $('#passwordCheck').on('blur', function (e) {
		e.preventDefault();
	    if ($('#passwordCheck').val() == "") {
	      $("#pwCheckMessage").show();
	      $("#pwCheckMessage").text("비밀번호 확인을 입력해주세요.");
	      return false;
	    } else if ($("#password").val() !== $("#passwordCheck").val()) {
	      $("#passwordCheck").val("");
	      $("#pwCheckMessage").show();
	      $("#pwCheckMessage").text("비밀번호랑 비밀번호 확인이 다릅니다.");
	      return false;
	    } else {
	      $("#pwCheckMessage").hide();
	      return false;
	    }
	  });

	  $('#name').on('blur', function (e) {
		e.preventDefault();
	    if ($('#name').val() == "") {
	      $("#nameMessage").show();
	      $("#nameMessage").text("이름을 입력해주세요.");
	      return false;
	    } else if (!nameReg.test($("#name").val())) {
	      $("#nameMessage").show();
	      $("#nameMessage").text("이름이 형식에 맞지 않습니다.");
	      return false;
	    } else {
	      $("#nameMessage").hide();
	      return false;
	    }
	  });

	  $('#email').on('blur', function (e) {
		e.preventDefault();
	    var user_email = $('#email').val();

	    if (user_email === "") {
	      $("#emailMessage").show();
	      $("#emailMessage").text("이메일을 입력해주세요.");
	      return false;
	    }
	    $.ajax({
	      url: '${path}/member/emailcheck',
	      type: 'post',
	      data: {
	        userEmail: user_email
	      },
	      dataType: 'json',
	      success: function (data) {
	        console.log(data);
	        if (data == 1) {
	          $("#emailMessage").show();
	          $("#emailMessage").text("사용 중인 이메일입니다.");
	          $("#email").val("");
	          return false;
	        } else if (!emailReg.test(user_email)) {
	          $("#emailMessage").show();
	          $("#emailMessage").text("이메일 형식이 틀립니다.");
	          $("#email").val("");
	          return false;
	        } //if
	        else {
	          $("#emailMessage").hide();
	        }

	      }, //end-success
	      error: function () {
	        console.log("실패");
	      } //end-error
	    }); //ajax
	  });
  });
  </script>
</head>

<body>
  <jsp:include page="../header.jsp" flush="false" />
  <div class="main-join-wrap">
    <form class="join-form" id="frmJoin" action="${path}/member/join" method="POST">
      <div class="join-title-main">
        <h2 class="join-title">회원가입</h2>
      </div>
      <div class="join-insert-wrap">
        <table class="join-table">
          <caption class="blind">회원가입 정보입력</caption>
          <colgroup>
            <col style="width:20%">
          </colgroup>
          <tbody>
            <tr>
              <th scope="row">
                <label for="id">*아이디</label>
              </th>
              <td>
                <input type="text" title="아이디" id="id" name="id" maxlength="12">
                <span class="error-message" id="idMessage" role="alert" style="display:none"></span>
              </td>
            </tr>
            <tr>
              <th scope="row"><label for="password">*비밀번호</label></th>
              <td>
                <input type="password" title="비밀번호" id="password" name="password">
                <span class="error-message" id="pwMessage" role="alert" style="display:none"></span>
              </td>
            </tr>
            <tr>
              <th scope="row"><label for="passwordCheck">*비밀번호 확인</label></th>
              <td>
                <input type="password" title="비밀번호 확인" id="passwordCheck" name="user-check-pw">
                <span class="error-message" id="pwCheckMessage" role="alert" style="display:none"></span>
              </td>
            </tr>
            <tr>
              <th><label for="name">*이름</label></th>
              <td>
                <input type="text" title="이름" id="name" name="name">
                <span class="error-message" id="nameMessage" role="alert" style="display:none"></span>
              </td>
            </tr>
            <tr>
              <th scope="row"><label for="email">*이메일</label></th>
              <td>
                <input type="email" id="email" name="email">
                <span class="error-message" id="emailMessage" role="alert" style="display:none"></span>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="join-button-wrap">
        <button type="button" class="join-button join-submit">회원가입</button>
        <input type="reset" value="취소" class="join-button">
      </div>
    </form>
  </div>
  <jsp:include page="../footer.jsp" flush="false" />
</body>

</html>