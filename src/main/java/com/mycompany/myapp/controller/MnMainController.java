package com.mycompany.myapp.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp.domain.MovieViewJoinResultVO;
import com.mycompany.myapp.service.MNScreeningService;
import com.mycompany.myapp.service.MnService;
import com.mycompany.myapp.service.MovieViewJoinResultService;

@Controller
public class MnMainController {
	
	@Autowired
	private MnService service;
	
	@GetMapping("/mn_main")
	public String Mnmain( Model model) throws Exception {
		for(int i=1;i<=4;i++) {
			model.addAttribute("today"+i, service.today(i));
		}//매장별 당일 매출현황
		
		for(int i=1;i<=4;i++) {
			model.addAttribute("month"+i, service.month(i));
		}//매장별 이번달 매출현황
		
		List<String> arr = new ArrayList<>();
		for(int i=1;i<=4;i++) {
			arr.add(service.total(i)+" ");
		}
		model.addAttribute("arr",arr);
		
		return "mn_main";
		
	}
}
