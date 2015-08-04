package org.it.saan.member.controller;

import org.it.saan.member.model.IdCheckService;
import org.it.saan.member.model.MemberDto;
import org.it.saan.member.model.MemberRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {
	@Autowired
	MemberRegisterService mrService;

	// ModelAndView String.. ∏Æ≈œ
	@RequestMapping(value = "/mem/reg.it", method = RequestMethod.GET)
	public ModelAndView controll(ModelAndView mav) {
		mav.setViewName("t:member.register");
		return mav;
	}

	@RequestMapping(value = "/mem/reg.it", method = RequestMethod.POST)
	public ModelAndView controll(ModelAndView mav, MemberDto dto) {

		int r = mrService.service(dto);
		
		
		mav.setViewName("t:member.registerResult");

		mav.addObject("rst", r);
		return mav;
	}
	
	@Autowired
	IdCheckService icService;
	
	@RequestMapping(value="/mem/chk.it")
	public ModelAndView controll(ModelAndView mav, String chk) {
		boolean rst = icService.service(chk);
		
		mav.addObject("rst", rst);
		mav.setViewName("ajax/chkProc");
		
		return mav;
	}
}




