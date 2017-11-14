package com.sai.token.SpringBootToKen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HomeController {

	@RequestMapping("/sai")
	public ModelAndView sai() {
		
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Enteres index");
		modelAndView.setViewName("sai");
		System.out.println("Exit index");
		return modelAndView;
	}
}
