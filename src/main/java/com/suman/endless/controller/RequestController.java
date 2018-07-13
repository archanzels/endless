package com.suman.endless.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.suman.endless.model.Request;
import com.suman.endless.service.RequestService;

@Controller
@RequestMapping("/request")
public class RequestController {

	@Autowired
	private RequestService requestService;

	@GetMapping("/all")
	public ModelAndView showAll() {
		List<Request> requests = requestService.findAll();
		return new ModelAndView("request/all-requests", "requests", requests);
	}

	@GetMapping("/delete/{id}")
	public String deleteRequest(@PathVariable(name = "id") Integer id) {
		requestService.deleteRequest(id);
		return "redirect:/request/all";
	}

	@GetMapping(value = { "/editRequest/{id}", "/editRequest" })
	public String requestEditForm(Model theModel, @PathVariable(required = false, name = "id") Integer id) {
		if (id != null) {
			theModel.addAttribute("request", requestService.findOne(id));
		} else {
			/* theModel.addAttribute("request", new Request()); */
			Request request = new Request();
			theModel.addAttribute("request", request);
		}
		return "/request/request-form";
	}

	@PostMapping("/postRequest")
	public ModelAndView requestEdit(@Valid Request request, BindingResult br) {
		ModelAndView mv = new ModelAndView();
		if (!br.hasErrors()) {
			requestService.saveRequest(request);
			return new ModelAndView("redirect:/request/all");
		} else {
			mv.setViewName("request/request-form");
		}
		return mv;
	}
}
