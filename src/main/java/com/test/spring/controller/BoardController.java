package com.test.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.test.spring.dto.BoardDTO;
import com.test.spring.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
		
	@Autowired BoardService bs;
	
	@RequestMapping(value="save", method=RequestMethod.GET)
	public String saveForm() {
		System.out.println("글쓰기 폼 불러오기!");
		return "board/save";
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public String save(@ModelAttribute BoardDTO boardDTO) {
		bs.save(boardDTO);
		System.out.println("글쓴거 저장완료");
		return "./index";
		
	}
	}
