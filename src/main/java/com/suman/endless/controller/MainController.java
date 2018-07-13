package com.suman.endless.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.suman.endless.model.Message;
import com.suman.endless.model.Request;
import com.suman.endless.model.User;
import com.suman.endless.service.RequestService;

@Controller
public class MainController {

	@Autowired
	private com.suman.endless.service.UserService userService;

	@Autowired
	private RequestService requestService;

	@GetMapping({ "/", "/home" })
	public ModelAndView index() {
		List<Request> requests = requestService.findAll();
		return new ModelAndView("home", "requests", requests);
	}

	@GetMapping("/why-donate")
	public ModelAndView whyDonate() {
		return new ModelAndView("why-donate");
	}

	@GetMapping("/who-can-donate")
	public ModelAndView whoCanDonate() {
		return new ModelAndView("who-can-donate");
	}

	@GetMapping({ "/login" })
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@GetMapping("/registration")
	public ModelAndView registration() {
		User user = new User();
		return new ModelAndView("registration", "user", user);
	}

	@PostMapping("/registration")
	public ModelAndView createNewUser(@Valid User user, BindingResult br) {
		ModelAndView modelAndView = new ModelAndView();
		User userExists = userService.findUserByEmail(user.getEmail());
		if (userExists != null) {
			br.rejectValue("email", "error.user", "Email already exists");
		}
		if (br.hasErrors()) {
			modelAndView.setViewName("registration");
		} else {
			userService.saveUser(user);
			modelAndView.addObject("successMsg", "Successfully registered");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("registration");
		}
		return modelAndView;
	}

	@GetMapping("/user")
	public ModelAndView regularHome() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", user.getFirstName());
		modelAndView.addObject("userEmail", "(" + user.getEmail() + ")");
		modelAndView.setViewName("user/user-home");
		return modelAndView;

	}

	@GetMapping("/admin")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName", user.getFirstName());
		modelAndView.addObject("userEmail", "(" + user.getEmail() + ")");
		modelAndView.setViewName("admin/admin-home");
		return modelAndView;
	}
}
