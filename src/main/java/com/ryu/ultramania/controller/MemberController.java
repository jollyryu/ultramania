package com.ryu.ultramania.controller;

import com.ryu.ultramania.model.Member;
import com.ryu.ultramania.model.MemberRole;
import com.ryu.ultramania.service.MemberService;
import com.ryu.ultramania.support.MemberValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;

@Slf4j
@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberValidator memberValidator;

	@GetMapping(value = "/signup")
	public void registration(Model model) {
		model.addAttribute("userForm", new Member());

	}

	@PostMapping("/signup")
	public String registration(@ModelAttribute("userForm") @Valid Member userForm, BindingResult bindingResult) {

		memberValidator.validate(userForm, bindingResult);

		if (bindingResult.hasErrors()) {
			log.debug("valid error");
			return "signup";
		}

		userForm.setRole(MemberRole.USER);
		memberService.save(userForm);
		System.out.println(userForm.toString());
		log.debug("userInfo" + userForm.toString());
		log.debug("email" + userForm.getEmail() + "|" + userForm.getPassword());

		return "redirect:/welcome";
	}
	//주//

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
