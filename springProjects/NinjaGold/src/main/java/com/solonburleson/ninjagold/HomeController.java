package com.solonburleson.ninjagold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private ArrayList<String> log = new ArrayList<>();
	
	@RequestMapping("/gold")
	public String index(HttpSession session, Model model) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			model.addAttribute("gold", 0);
		} else {
			model.addAttribute("gold", session.getAttribute("gold"));
			model.addAttribute("log", this.log);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/farm", method=RequestMethod.POST)
	public String farm(HttpSession session) {
		String pattern = "hh:mm a";
		SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
		String time = formatDate.format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		Integer goldfound = getGold("farm");
		gold += goldfound;
		session.setAttribute("gold", gold);
		this.log.add(0, "You entered a farm and earned " + goldfound + " gold (" + time + ")");
		return "redirect:/gold";
	}
	
	@RequestMapping(value="/cave", method=RequestMethod.POST)
	public String cave(HttpSession session) {
		String pattern = "hh:mm a";
		SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
		String time = formatDate.format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		Integer goldfound = getGold("cave");
		gold += goldfound;
		session.setAttribute("gold", gold);
		this.log.add(0, "You entered a cave and earned " + goldfound + " gold (" + time + ")");
		return "redirect:/gold";
	}
	
	@RequestMapping(value="/house", method=RequestMethod.POST)
	public String house(HttpSession session) {
		String pattern = "hh:mm a";
		SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
		String time = formatDate.format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		Integer goldfound = getGold("house");
		gold += goldfound;
		session.setAttribute("gold", gold);
		this.log.add(0, "You entered a house and earned " + goldfound + " gold (" + time + ")");
		return "redirect:/gold";
	}
	
	@RequestMapping(value="/casino", method=RequestMethod.POST)
	public String casino(HttpSession session) {
		String pattern = "hh:mm a";
		SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
		String time = formatDate.format(new Date());
		Integer gold = (Integer) session.getAttribute("gold");
		Integer goldfound = getGold("casino");
		gold += goldfound;
		session.setAttribute("gold", gold);
		if(goldfound < 0) {
			this.log.add(0, "You entered a casino and lost " + goldfound + " gold....Ouch ("+ time + ")");
		} else {
			this.log.add(0, "You entered a casino and earned " + goldfound + " gold (" + time + ")");
		}
		return "redirect:/gold";
	}
	
	public Integer getGold(String location) {
		Integer gold;
		Random r = new Random();
		if(location == "farm") {
			gold = r.nextInt(21-10)+10;
		} else if(location == "cave") {
			gold = r.nextInt(11-5)+5;
		} else if(location == "house") {
			gold = r.nextInt(6-2)+2;
		} else {
			gold = r.nextInt(101)-50;
		}
		return gold;
	}
}
