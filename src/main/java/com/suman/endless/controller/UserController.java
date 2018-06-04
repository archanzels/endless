package com.suman.endless.controller;

import com.suman.endless.model.User;
import com.suman.endless.repository.UserRepository;
import com.suman.endless.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;

	@GetMapping("/all")
	public ModelAndView showAll() {
		List<User> users = userService.getAllUser();
		return new ModelAndView("admin/all-user", "users", users);
	}

	@GetMapping("/update/{id}")
	public ModelAndView editUser(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		User theUser = userRepository.getOne(id);
		mv.addObject("user", theUser);
		mv.setViewName("admin/user-form");
		return mv;
	}

	@GetMapping("/request")
	public ModelAndView requestForm() {
		return new ModelAndView("request/request-form");
	}

	@PostMapping("/save/{id}")
	public String save(@ModelAttribute("user") User theUser) {
		userService.saveUser(theUser);
		return "redirect:/admin/all";

	}
}
