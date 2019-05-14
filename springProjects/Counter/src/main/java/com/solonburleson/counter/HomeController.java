package com.solonburleson.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			model.addAttribute("count", 0);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			model.addAttribute("count", count);
			
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/add2")
	public String add(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 2);
			model.addAttribute("count", 2);
		} else {
			Integer count = (Integer) session.getAttribute("count");
			count += 2;
			model.addAttribute("count", count);
			session.setAttribute("count", count);
		}
		return "add.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "reset.jsp";
	}
}
