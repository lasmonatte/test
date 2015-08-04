package org.it.saan.main.controller;

import org.it.saan.member.model.IdCheckService;
import org.it.saan.member.model.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@Autowired
	TestService service;
	
	@RequestMapping("/test.it")
	public void controll() {
		System.out.println("safdaskdflsasfdsajjjjjjj");
		System.out.println(service.service());
	}
}
