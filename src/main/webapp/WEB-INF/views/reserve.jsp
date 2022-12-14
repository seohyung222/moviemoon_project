<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ include file="./include/includeFile.jsp" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>예매페이지</title>
  <link rel="stylesheet" href="${path}/resources/css/style.css">
</head>

<body>
  <jsp:include page="header.jsp" flush="false" />
  <div id="container">
    <h3 class="ticket-title">영화예매</h3>
    <div class="ticket-info-area">
      <ul class="ticket-info">
        <li><span class="ticket-movie-poster"> <img src="${path}/savedir/${movieRead.view_name_key}">
          </span>
          <div class="ticket-movie">
            <div class="ticket-info-title">영화</div>
            <div>${movieRead.title}</div>
          </div>
        </li>
        <li>
          <div class="ticket-info-title">관람일시</div>
          <div id="txtDate"></div>
          <div id="txtTime"></div>
        </li>
        <li>
          <div class="ticket-info-title">선택좌석</div>
          <div id=seatInfo></div>
        </li>
        <li>
          <div class="ticket-info-title">총 결제금액</div>
          <div class="ticket-price"><span>0</span>원</div>
        </li>
      </ul>
    </div>
    <!-- 예매본문 -->
    <div class="layout-content reserve-wrap">
      <div class="box-step">
        <dl class="cinema-choice">
          <dt>
            <span class="round">STEP 1</span> 영화관 선택
          </dt>
          <dd>
            <ul class="choice-list cinema-choice-list">
              <%-- 첫번째 버튼 클릭하면 두번쨰 활성화되고 다시 쿼리문 수행--%>
              <c:forEach items="${list}" var="list">
                <li>
                  <button value="${list}">${list}</button>
                  <ul class="choice-list-detail" id="cityList">
                  </ul>
                </li>
              </c:forEach>
            </ul>
          </dd>
        </dl>
        <dl class="date_choice">
          <dt>
            <span class="round">STEP 2</span> 관람일 선택
          </dt>
          <dd>
            <p class="select-message">영화관을 선택해주세요.</p>
            <ul class="choice-list" id="dateList">

            </ul>
          </dd>
        </dl>
        <dl class="time_choice">
          <dt>
            <span class="round">STEP 3</span> 관람시간 선택
          </dt>
          <dd>
            <p class="select-message">관람일을 선택해주세요.</p>
            <!-- 선택 날짜에 관한 관람시간 리스트 -->
            <ul class="choice-list" id="timeList">

            </ul>
            <!--  선택 전  -->
          </dd>
        </dl>
        <dl class="seat_choice">
          <dt>
            <span class="round">STEP 4</span> 좌석 및 잔여석 확인
          </dt>
          <dd>
            <p class="select-message">관람시간을 선택해주세요.</p>
            <div class="seat-choice-content">
              <!-- 선택 시간에 관한 좌석 및 잔여석 -->
              <div class="remain-seat">일반석 : <span id="remainSeatNum">${remainseats}</span>석</div>
              <!-- 몇좌석 남았는지 seat-v에 넣기 ajax로-->
              <!--  선택 전-->
              <div class="select-person-area">
                <label for="ticketCount" class="select-title">인원선택</label>
                <span>
                  <select id="ticketCount" class="select-person">
                    <option value="1" selected>1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="6">6</option>
                    <option value="7">7</option>
                    <option value="8">8</option>
                    <option value="9">9</option>
                    <option value="10">10</option>
                  </select>
                </span>
              </div>
              <p class="select-caption">※최대 10명까지 선택가능 합니다.</p>
            </div>
          </dd>
        </dl>
      </div>
      <div class="screen">
        <span class="screen-title">SCREEN</span>
        <div class="seat-area">
          <span class="screen-stage">SCREEN</span>
          <ul class="all-seats">
          </ul>
        </div>
      </div>
      <div class="reserve-note">
        <div class="precautions"><strong>예매 시 주의사항</strong></div>
        <div class="precautions-content">
          <p>※ 예매시 주의 사항</p>
          <p>1. 홈페이지 예매 후 현장에서 결제수단을 변경 할 수 없습니다.</p>
          <p>2. 영화 날짜 및 시간 변경은 취소 후 다시 예매 진행을 하셔야 합니다.</p>
          <p>3. 부분 취소 환불은 불가능합니다.</p>
          <ul class="reserve-rule">
            <li>※예매 취소 및 환불 규정</li>
            <li>&nbsp; &nbsp;· 인터넷(모바일)예매 : 영화 상영 시간 20분 전까지 환불 가능.<br>
              &nbsp; &nbsp; &nbsp; &nbsp;(인터넷(모바일)예매 후 현장에서 결제수단변경을 원하실 경우 상영시간 20분전까지 직접 예매 취소 후 재결제 하셔야 합니다.)
            </li>
            <li>&nbsp; &nbsp;· 현장예매 : 영화상영시간 전까지 취소 및 환불 가능.</li>
          </ul>
        </div>
      </div>
      <div class="payment-area">
        <button id="payment" class="join-submit join-button">결제</button>
      </div>
    </div>
    <jsp:include page="footer.jsp" flush="false" />
  </div>
  <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
  <script type="text/javascript" src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
  <script>
    $(document).ready(function () {
      var seatSum = [];
      //영화관 선택
      $(".cinema-choice-list>li>button").on("click", function () {
        $(".cinema-choice-list>li>button").removeClass("active");
        $(this).addClass("active");
        $(".choice-list-detail").removeClass("on");
        $(this).siblings(".choice-list-detail").addClass("on");
      });
      //영화도시,관람일
      $(".cinema-choice-list").on("click", ".choice-list-detail>li>button", function () {
        $(".choice-list-detail>li>button").removeClass("active");
        $(this).addClass("active");
        if (!$(this).hasClass("active")) {
          $(".date_choice>dd>.choice-list").removeClass("on");
        } else {
          $(".date_choice>dd>.select-message").hide();
          $(".date_choice .choice-list").addClass("on");
        }
      });
      //관람일 선택
      $(document).on('click', '.date_choice .choice-list>li>button', function () {
        $(".date_choice .choice-list>li>button").removeClass("active");
        $(this).addClass("active");
        $('#txtDate').text($(this).text());
      });

      // 관람시간
      $(document).on('click', '.date_choice .choice-list>li>button', function () {
        if (!$(this).hasClass('active')) {
          $('.time_choice>dd>.choice-list').removeClass('on');
        } else {
          $('.time_choice>dd>.select-message').hide();
          $('.time_choice .choice-list').addClass('on');
        }
      });
      //관심시간 선택
      $(document).on('click', '.time_choice .choice-list>li>button', function () {
        $(".time_choice .choice-list>li>button").removeClass("active");
        $(this).addClass("active");
        $('#txtTime').text($(this).text());
      });
      // 좌석
      $(document).on('click', '.time_choice .choice-list>li>button', function () {
        if (!$(this).hasClass('active')) {
          $('.seat-choice-content').removeClass('on');
        } else {
          $('.seat_choice .select-message').hide();
          $('.seat-choice-content').addClass('on');
        }
      });
      // ajax
      //영화관지역
      $('.cinema-choice-list>li>button').on('click', function () {
        cinema = $(this).val();
        console.log(cinema);
        $.ajax({
          url: '${path}/movie/screening/districts?movie_num=${movieRead.movie_num}&cinema=' + cinema,
          type: 'post',
          success: function (data) {
            console.log("영화관 지역 :" + data);
            var cityList = "";
            /* for(var idx = 0; idx < data.length; idx++) {
             str+="<li><button value="+ data[idx] +">" + data[idx] + "</button></li>";
            } */
            $.each(data, function (index, item) {
              console.log(index, item);
              cityList += "<li><button value=" + item + ">" + item + "</button></li>";
            });
            $(".choice-list-detail").html(cityList);
          }, //end-success
          error: function () {
            console.log("실패");
          } //end-error
        }) //ajax
      });
      //관람일
      $(document).on('click', '#cityList>li>button', function () {
        dist = $(this).val();
        console.log("지역:" + cinema);
        console.log("도시:" + dist);
        $.ajax({
          url: '${path}/movie/screening/dates?movie_num=${movieRead.movie_num}&cinema=' + cinema + '&dist=' + dist,
          type: 'post',
          success: function (data) {
            var dateList = "";
            $.each(data, function (index, item) {
              console.log(index, item);
              dateList += "<li><button value=" + item + ">" + item + "</button></li>";
            });
            $("#dateList").html(dateList);
          }, //end-success
          error: function () {
            console.log("실패");
          } //end-error
        }) //ajax
      });
      //관람시간
      $(document).on('click', '#dateList>li>button', function () {
        dates = $(this).val();

        $.ajax({
          url: '${path}/movie/screening/times?movie_num=${movieRead.movie_num}&cinema=' + cinema + '&dist=' +
            dist + '&dates=' + dates,
          type: 'post',
          success: function (data) {
            console.log(data);
            var timeList = "";

            $.each(data, function (index, item) {
              timeList += "<li><button value=" + item + ">" + item + "</button></li>";
            });

            $("#timeList").html(timeList);
          }, //end-success
          error: function () {
            console.log("실패");
          } //end-error
        }) //ajax
      });
      //좌석
      $(document).on('click', '#timeList>li>button', function () {
        seatSum = [];
        $('#seatInfo').text("");
        $('.ticket-price>span').text("0");

        times = $(this).val();
        $.ajax({
          url: '${path}/movie/screening/seats?movie_num=${movieRead.movie_num}&cinema=' + cinema + '&dist=' +
            dist + '&dates=' + dates + '&times=' + times,
          type: 'post',

          success: function (data) {
            var seatRow = data;
            console.debug('- seatRow:', seatRow);
            var seatList = "";
            for (var i = 0; i < seatRow.length; i++) {
              seatList += "<li><span>" + String.fromCharCode(i + 65) + "</span>";

              var seatCol = seatRow[i].list;
              console.debug('- seatCol:', seatCol);

              for (var j = 0; j < seatCol.length; j++) {
                if (seatCol[j].status === 'Y') {
                  seatList += "<button class='completed' value=" + seatCol[j].seat_num +
                    " disabled='disabled'>" + seatCol[j].seat_num + "</button>";
                } else {
                  seatList += "<button value=" + seatCol[j].seat_num + ">" + seatCol[j].seat_num +
                    "<span class='blind reserve-status'>" + seatCol[j].status + "</span></button>";
                }
              } // inner for
              seatList += "</li>";
            } // outer for
            $('.all-seats').html(seatList);
            $('.screen-title').hide();
            $('.screen-stage').show();
          }, //end-success
          error: function () {
            console.log("실패");
          } //end-error
        }) //ajax

        $.ajax({
          url: '${path}/movie/screening/showSeat?movie_num=${movieRead.movie_num}&cinema=' + cinema + '&dist=' +
            dist + '&dates=' + dates + '&times=' + times,
          type: 'post',
          success: function (data) {
            var seatsList = "";
            $('#remainSeatNum').html(data);
            console.log(data);
          }, //end-success
          error: function () {
            console.log("실패");
          } //end-error
        }) //ajax
      }); 

      $(document).on('click', '.all-seats>li>button', function () {
        var cnt = $('#ticketCount').val();
        var selectedCnt = $('.selected').length;

        //재 클릭후 버튼 선택 제거
        if ($(this).hasClass('selected')) {
          $(this).removeClass('selected');
          var removeSeat = $(this).val()
          seatSum.splice(seatSum.indexOf(removeSeat), 1);
        } else if (cnt < selectedCnt + 1) {
          alert('인원수가 초과되었습니다. 좌석을 취소후에 선택해주세요.')
          //$(this).addClass('');
          return false;
        } else {
          $(this).addClass('selected');
          seatSum.push($(this).val());
        }
        console.log(seatSum);
        $('#seatInfo').text(seatSum);
        $('.ticket-price>span').text(seatSum.length * 8000);
      });

      $('#ticketCount').change(function () {
        $('.all-seats>li>button').removeClass('selected');
        seatSum = [];
        $('#seatInfo').text("");
        $('.ticket-price>span').text("0");
      });

      $('#payment').on('click', function () {
        console.log($('#ticketCount').val())
        console.log("seatSum:", seatSum);
        seatSum = seatSum.sort();
        //console.log(cinema, dist, dates, times, seatSum);
        if (seatSum.length === 0) {
          alert('좌석을 선택해주세요.');
          return false;
        } else if (seatSum.length < $('#ticketCount').val()) {
          alert('선택한 인원수와 좌석 수가 맞지 않습니다.');
          return false;
        }


        $.ajax({
          url: '${path}/movie/screening/reservation?movie_num=${movieRead.movie_num}&cinema=' + cinema + '&dist=' +
            dist + '&dates=' + dates + '&times=' + times + '&seatSum=' + seatSum,
          type: 'post',
          success: function (data) {
            console.log("결제")
          }, //end-success
          error: function () {
            console.log("실패");
          } //end-error
        }) //ajax

        if (confirm("결제가 완료되었습니다.")) {
          window.location.href = "${path}"
        }

      });
    });
  </script>
</body>

</html>