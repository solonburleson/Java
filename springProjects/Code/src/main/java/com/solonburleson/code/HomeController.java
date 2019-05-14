package com.solonburleson.code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String check(@RequestParam(value="code") String code, RedirectAttributes redirectAtrributes) {
		if(code.equals("bushido")) {
			return "redirect:/code";
		} else {
			redirectAtrributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
