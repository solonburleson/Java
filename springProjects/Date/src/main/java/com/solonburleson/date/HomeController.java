package com.solonburleson.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/date")
	public String date(Model model) {
		String pattern = "EEEEEE d MMM y";
		SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
		String date = formatDate.format(new Date());
		model.addAttribute("date", date);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		String pattern = "hh : mm a";
		SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
		String time = formatDate.format(new Date());
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
