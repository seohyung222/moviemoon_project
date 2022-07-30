package com.mycompany.myapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.myapp.domain.BoardVO;
import com.mycompany.myapp.domain.Criteria;
import com.mycompany.myapp.domain.PageMaker;
import com.mycompany.myapp.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/register")
	public void registerGET(BoardVO board, Model model) throws Exception{	
	}//registerGET
	
	
	@PostMapping("/register")
	public String registPost(BoardVO board, RedirectAttributes rttr) throws Exception{
		service.regist(board);
		rttr.addAttribute("result", "success");

		return "redirect:/board/listAll";
	}//registPost
		
	@GetMapping("/read")
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		model.addAttribute(service.read(bno));		
	}//read
	
	@GetMapping("/mainread")
	public void mainread(@RequestParam("bno") int bno, Model model) throws Exception {
		model.addAttribute(service.read(bno));		
	}

	@PostMapping("/remove")
	public String remove(@RequestParam("bno") int bno, 
		RedirectAttributes rttr) throws Exception {
		service.remove(bno);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";		
	}//remove
	
	@GetMapping("/modify")
	public void modifyGET(int bno, Model model) throws Exception {
	    model.addAttribute(service.read(bno));
	}//modifyGET
	
	@PostMapping("/modify")
	public String modifyPOST(BoardVO board,
			RedirectAttributes rttr) throws Exception {
		service.modify(board);
		rttr.addFlashAttribute("msg", "SUCCESS");
		return "redirect:/board/listAll";
	}//modifyPOST	

	@GetMapping("/listAll")
	public void listAll(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
//		model.addAttribute("list", service.listAll());	
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));
		model.addAttribute("pageMaker", pageMaker);
	}//listAll
	
	@GetMapping("/mainlistAll")
	public void mainlistAll(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
//		model.addAttribute("list", service.listAll());	
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.listCountCriteria(cri));		
		
		model.addAttribute("pageMaker", pageMaker);
	}//listAll
	
//	@GetMapping("/listCri")
//	public void listAll(Criteria cri, Model model) throws Exception{
//		model.addAttribute("list", service.listCriteria(cri));
//	}//listAll
	
//	@GetMapping("/listPage")
//	public void listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
//		
//		model.addAttribute("list", service.listCriteria(cri));
//		PageMaker pageMaker = new PageMaker();
//		pageMaker.setCri(cri);
////		pageMaker.setTotal(131);
//		pageMaker.setTotalCount(service.listCountCriteria(cri));		
//		
//		model.addAttribute("pageMaker", pageMaker);
//	}//listPage
	
}//end class
















