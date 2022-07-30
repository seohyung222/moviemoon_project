
package com.mycompany.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp.domain.MemberReplyJoinResultVO;
import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.service.MovieAvgScoreResultService;
import com.mycompany.myapp.service.ReplyService;

@RequestMapping("/")
@Controller
public class MovieCommentsController {

   @Autowired
   private ReplyService service;
   

   
   private final String loginKey = "login";
   
   //댓글리스트
   @RequestMapping(value = "/comment_list")
   public @ResponseBody List<MemberReplyJoinResultVO> replyRead(
		   @RequestParam(value = "id", required = false) String id,
		   @RequestParam(value = "movie_num", required = false) String movie_num,
           Model model,
           HttpServletRequest reqeust,
           HttpServletResponse response,
           HttpSession session) 
               throws Exception {
      List<MemberReplyJoinResultVO> replyList = service.replyList(movie_num);
      
      return replyList;

   } // replyRead
   
   
   
   //댓글 작성
   @RequestMapping(value ="/comment_insert")
   public @ResponseBody void replyInsert(
		  @RequestParam(value = "id", required = false) String id,
	      @RequestParam(value = "movie_num", required = false) String movie_num ,
	      @ModelAttribute("MemberReplyJoinResultVO") MemberReplyJoinResultVO vo, 
	      HttpServletRequest request ,
	      HttpSession session ) throws Exception{
      
      
      session = request.getSession();
      MemberVo memberInfo1 = (MemberVo) session.getAttribute(loginKey);
     
      
      vo.setId(memberInfo1.getId());
      vo.setMovie_num(movie_num);
      
       
      service.replyCreate(vo);
   }  //replyInsert
   
   
   //댓글 수정
   @RequestMapping(value = "/comment_update")
   public @ResponseBody void getReplyUpdate(
         @RequestParam(value = "id", required = false) String id,
         @RequestParam(value = "movie_num", required = false) String movie_num ,
         @RequestParam(value = "modscore", required = false) int score ,
         @RequestParam(value = "modcomment", required = false) String comment ,
         @ModelAttribute("MemberReplyJoinResultVO") MemberReplyJoinResultVO vo,
         HttpServletRequest request ,
         HttpSession session ) throws Exception {
	    session = request.getSession();
	     MemberVo memberInfo1 = (MemberVo) session.getAttribute(loginKey);
	      
	     vo.setId(memberInfo1.getId());
	     vo.setMovie_num(movie_num);
	     vo.setScore(score);
	     vo.setComment(comment);
	      
	     service.replyUpdate(vo);
      
   }  //replyUpdate

   
   //댓글 삭제
   @RequestMapping(value = "/comment_delete")
   public @ResponseBody int replyDelete (
         @RequestParam(value = "id", required = false) String id
         ) throws Exception {
	   
      return service.replyDelete(id);
      
   }  //replyDelete

} // end class