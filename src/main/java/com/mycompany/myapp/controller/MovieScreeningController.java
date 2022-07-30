package com.mycompany.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.myapp.domain.MovieViewJoinResultVO;
import com.mycompany.myapp.service.MovieViewJoinResultService;

@RequestMapping("contents/*")
@Controller
public class MovieScreeningController {
	
	@Autowired
	private MovieViewJoinResultService service;
	
	@GetMapping("/movie")
	public void MoiveScreeningGetMovie( Model model ) throws Exception {
		List<MovieViewJoinResultVO> list = service.newMovieList();
		model.addAttribute("list", list);
	}
	
	public class MovieReserveController {
		
		@GetMapping("/reserve")
		public String reserve() {
			return "contents/movie/reserve";
		} //예매

	}

}
