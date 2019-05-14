package com.solonburleson.survey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String check(@RequestParam(value="name") String name, @RequestParam(value="dojo") String dojo, @RequestParam(value="lang") String lang, @RequestParam(value="comment") String comment, HttpSession session) {
		session.setAttribute("name", name);
		session.setAttribute("dojo", dojo);
		session.setAttribute("lang", lang);
		session.setAttribute("comment", comment);
		if(lang.equals("Java")) {
			return "redirect:/java";
		} else {
			return "redirect:/result";
		}
	}
	
	@RequestMapping("/java")
	public String java(HttpSession session, Model model) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("dojo", session.getAttribute("dojo"));
		model.addAttribute("lang", session.getAttribute("lang"));
		model.addAttribute("comment", session.getAttribute("comment"));
		return "java.jsp";
	}
	
	@RequestMapping("/result")
	public String result(HttpSession session, Model model) {
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("dojo", session.getAttribute("dojo"));
		model.addAttribute("lang", session.getAttribute("lang"));
		model.addAttribute("comment", session.getAttribute("comment"));
		return "result.jsp";
	}
}
