
  package com.mycompany.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import
  org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import
  org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp.domain.MovieAvgScoreResultVO;
import com.mycompany.myapp.service.MovieAvgScoreResultService;
import com.mycompany.myapp.service.MovieViewJoinResultService;

  @RequestMapping("/")
  @Controller 
  public class MovieDetailInfoController {
  
	@Autowired
	private MovieViewJoinResultService service;
	
	@Autowired
	private MovieAvgScoreResultService avgScoreResultSevice;

	
	@RequestMapping(value ="/movie_detail")
	public void movieRead(@RequestParam(value = "movie_num", required = false) String movie_num, Model model)
			throws Exception {

		model.addAttribute("movieRead", service.movieRead(movie_num));
		
		} // movieRead
	
	
	@RequestMapping(value = "/movie_avgScore_Result_update")
	   public @ResponseBody void avgScoreResultUpdate(
			  @RequestParam(value = "movie_num", required = false) String movie_num,
			  @ModelAttribute("MovieAvgScoreResultVO") MovieAvgScoreResultVO vo) 
	               throws Exception {  
	      avgScoreResultSevice.replyScoreUpdate(vo);

	   } // avgScoreResult update
	
	 @RequestMapping(value = "/movie_avgScore_Result_select")
	   public @ResponseBody MovieAvgScoreResultVO avgScoreResultSelect(
			   @RequestParam(value = "movie_num", required = false) String movie_num,
	           HttpServletRequest reqeust,
	           HttpServletResponse response,
	           HttpSession session) 
	   
	               throws Exception {
	  
	      MovieAvgScoreResultVO avgScoreResult = avgScoreResultSevice.replyScoreSelect(movie_num);

	      return avgScoreResult;

	   } // avgScoreResultSelect
	
}