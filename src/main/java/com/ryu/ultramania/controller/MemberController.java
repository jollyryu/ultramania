package com.ryu.ultramania.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;

@Controller
public class MemberController {

	@GetMapping("/login")
	public ModelAndView login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("error", "아이디 또는 패스워드가 잘못 되었습니다.");

		if (logout != null)
			model.addAttribute("message", "로그아웃 되었습니다.");

		return new ModelAndView("login");
	}


	@GetMapping("/")
	public String home(Model model) {
		return "home";
	}

	@GetMapping("/403")
	public String error403() {
		return "/error/403";
	}

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome";
	}

}
