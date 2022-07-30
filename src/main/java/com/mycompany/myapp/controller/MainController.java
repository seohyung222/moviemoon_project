package com.mycompany.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.MovieViewJoinResultVO;
import com.mycompany.myapp.service.BoardService;
import com.mycompany.myapp.service.MovieViewJoinResultService;

@Controller
public class MainController {
	
	@Autowired
	private MovieViewJoinResultService service;

	@Autowired
	private BoardService service2;
	
	@GetMapping("/")
	public String Main(Model model) throws Exception {

		List<MovieViewJoinResultVO> list1 = service.boxMovieList(); // 박스오피스
		List<MovieViewJoinResultVO> list2 = service.newMovieList(); // 최신상영작
		List<BoardVO> list3 = service2.listAll();
		model.addAttribute("list1", list1);
		model.addAttribute("list2", list2);
		model.addAttribute("list3", list3);
		
		return "index";
	}

	@GetMapping("/index.html")
	public String Main_index() {
		return "redirect:/";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/introduction")
	public void introduction() {

	}
	
	

}// end class
