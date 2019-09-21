package br.unoeste.fipp.springbootjspmvcjar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
	
	@RequestMapping("/")
	public ModelAndView indexAction() {
		ModelAndView view = new ModelAndView("inicio/index");
		return view;
	}

}
