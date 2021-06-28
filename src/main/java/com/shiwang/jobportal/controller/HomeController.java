package com.shiwang.jobportal.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiwang.jobportal.dao.UserDao;
import com.shiwang.jobportal.entity.User;

@Controller
public class HomeController {

	@Autowired
	private UserDao userdao;
	
	@InitBinder
	public void checkWhiteSpaces(WebDataBinder webBinder) {
		StringTrimmerEditor trimparameters = new StringTrimmerEditor(true);
		webBinder.registerCustomEditor(String.class, trimparameters);
	}
	
	@GetMapping("/")
	public String loadHome() {
		return "index";
	}
	
	@GetMapping("/apply")
	public ModelAndView loadApplicationForm() {
		return new ModelAndView("applicationForm", "user", new User());
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult bindingresult, ModelMap model) {
		
		if(bindingresult.hasErrors()) {
			return "applicationForm";
		}
	else {
//			model.addAttribute("firstName", user.getFirstName());
//			model.addAttribute("lastName", user.getLastName());
//	        model.addAttribute("contactNumber", user.getContactNumber());
//	        model.addAttribute("email", user.getEmail());
//	        model.addAttribute("gender", user.getGender());
//	        model.addAttribute("skills", user.getSkills());
//	        model.addAttribute("currentEmployer", user.getCurrentEmployer());
//	        model.addAttribute("workexperience", user.getWorkexperience());
//	        model.addAttribute("currentCTC", user.getCurrentCTC());
//	        model.addAttribute("expectedCTC", user.getExpectedCTC());
			
		userdao.saveUser(user);
			return "success";
		}
		
	}
	
}
