package com.mycompany.myapp.controller;


import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.myapp.domain.MemberVo;
import com.mycompany.myapp.dto.MemberDTO;
import com.mycompany.myapp.security.SHA256;
import com.mycompany.myapp.service.LoginService;
import com.mycompany.myapp.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class Membercontroller {

   @Autowired
   private MemberService memberservice;

   @Autowired
   private LoginService loginservice;


   @Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
   // ------------------------------------ idCheck-----------------------------------------//
   
   @PostMapping("/idcheck")
   @ResponseBody
   public int idCheck(@RequestParam("userId") String user_id) throws Exception {
      return memberservice.DuplicateId(user_id);

   } // idCheck

   // ------------------------------------ emailcheck -----------------------------------------//
   @PostMapping("/emailcheck")
   @ResponseBody
   public int emailcheck(@RequestParam("userEmail") String user_email) throws Exception {
      return memberservice.DuplicateEmail(user_email);

   }// emailcheck
   
   //------------------------------withdrawal_password_check--------------------------------------//
   @PostMapping("withdrawalCk")
   @ResponseBody
   public int withdrawalCk(@RequestParam("password") String passwordCk, 
                         @RequestParam("memberId") String memberId,
                         HttpSession session) throws Exception {
 
      int userRemoveCount = 0;

      MemberVo vo = new MemberVo();

      vo.setId(memberId);
      vo.setPassword(SHA256.encrypt(passwordCk));
      userRemoveCount = memberservice.remove(vo);

      if (userRemoveCount == 1) {           //삭제된 행이 있다면 
         session.invalidate();             // 세션 제거 !
      }

      return userRemoveCount;
   } //withdrawalCk

   //------------------------------reset_Password--------------------------------------//
   @PostMapping("reset_Password")
   @ResponseBody
   public int reset_Password(@RequestParam("userId") String user_Id, 
                           @RequestParam("userEmail") String user_Email, 
                              HttpSession session) throws Exception {
 
      //   int Information_match = 0;
         
         MemberVo vo = new MemberVo();
         
         vo.setId(user_Id);
         vo.setEmail(user_Email);
         
      //   System.out.println("Information_match::: " + Information_match);
         
         //Information_match = memberservice.getNewPw(vo);
         //return Information_match;
         return  memberservice.getNewPw(vo);

      } // reset_Password
   
   
   //------------------------------------ login -----------------------------------------//
   @GetMapping("/login")
   public void login() {
   } // login()

   @PostMapping("login_Post")
   public String login(@RequestParam String id, @RequestParam String password, 
		   RedirectAttributes rattr, HttpSession session) throws Exception {
	   
		Map<String, Object> rmap = loginservice.loginCheck(id, password);
		//성공이면 홈 아니면 login로 이동
		int code = (int)rmap.get("code");
		rattr.addFlashAttribute("msg", rmap.get("msg"));

		if (code == 0 ) { //성공
			session.setAttribute("id", id);
			return "redirect:/";
		}
		return "redirect:login";
		 // login_POST
   }
   // ------------------------------------ join-----------------------------------------//

   @GetMapping("/agree")
   public void agree() {
   } // agree
   
   @GetMapping("/join")
   public void join() {
   } // join

   @PostMapping("/join")
   public String join_result(MemberDTO dto) throws Exception {

      MemberVo vo = new MemberVo();

      String encryPassword = bCryptPasswordEncoder.encode(dto.getPassword()); // 비번 암호화

      vo.setId(dto.getId());
      vo.setPassword(encryPassword); 
      vo.setName(dto.getName());
      vo.setEmail(dto.getEmail());
 
      memberservice.regist(vo);

      return "/member/join_result";
      
   } // join_result

   // ------------------------------------ withdrawal -----------------------------------------//
   
    @GetMapping("/withdrawal_result") 
    public void withdrawal_result() throws Exception { }


} // end class