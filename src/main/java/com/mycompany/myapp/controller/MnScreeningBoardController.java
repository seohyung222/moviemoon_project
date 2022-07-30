package com.mycompany.myapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.myapp.domain.Criteria;
import com.mycompany.myapp.domain.MNScreeningDTO;
import com.mycompany.myapp.domain.PageMaker;
import com.mycompany.myapp.dto.LoginDTO;
import com.mycompany.myapp.service.MNScreeningService;

@Controller
@RequestMapping("/MN_Screening_Board/*")
public class MnScreeningBoardController {

	@Autowired
	private MNScreeningService service;

	@RequestMapping(value = "MN_screening_list", method = RequestMethod.GET)
	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception {
		
		model.addAttribute("list", service.mnScreeningListCriteria(cri));
		model.addAttribute("listTitle", service.getTitle());
		model.addAttribute("listCinema", service.getCinema());
		model.addAttribute("listStartTime", service.getMovieTime());
		
		MNScreeningDTO dto = new MNScreeningDTO();
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.mnScreeninglistCountCriteria(cri));

		model.addAttribute("pageMaker", pageMaker);
		
	} // listPage

	/* 상영정보 등록페이지 */
	@RequestMapping(value = "MN_screening_register", method = RequestMethod.GET)
	public void mnScreeningRegisterGET(MNScreeningDTO dto, Model model) throws Exception {
		model.addAttribute("listTitle", service.getTitle());
		model.addAttribute("listCinema", service.getCinema());
		model.addAttribute("listDist", service.getDist());
		model.addAttribute("listStartTime", service.getMovieTime());
	}

	
	@RequestMapping(value ="MN_screening_register", method = RequestMethod.POST)
	public String mnScreeningRegistPOST(
			MNScreeningDTO dto, Model model) throws Exception {
		service.mnScreeningRegist(dto);
		return "redirect:/MN_Screening_Board/MN_screening_list";

	}// mnMovieDetailInfo

	
	@GetMapping("MN_screening_list/delete")
    public String delete(@RequestParam("screening_num") int screening_num) throws Exception{
       MNScreeningDTO dto = new MNScreeningDTO();
       dto.setScreening_num(screening_num);
       
       service.deletea(dto);
       
       return "redirect:/MN_Screening_Board/MN_screening_list/";
 } 
}
