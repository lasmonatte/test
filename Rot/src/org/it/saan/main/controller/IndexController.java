package org.it.saan.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("/index.it")
	public ModelAndView controll(ModelAndView mav) {
		mav.setViewName("t:layout.main");
		return mav;
	}

}
