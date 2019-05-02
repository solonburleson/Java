package com.solonburleson.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello(@RequestParam(value="first_name", required=false) String first_name, @RequestParam(value="last_name", required=false) String last_name) {
		if(first_name == null && last_name == null) {
			return "<h1>Hello Human!</h1><p>Welcome to SpringBoot!</p>";
		} else if(last_name == null) {
			return "<h1>Hello " + first_name + "!</h1><p>Welcome to SpringBoot!</p>";
		} else if(first_name == null) {
			return "<h1>Hello " + last_name + "!</h1><p>Welcome to SpringBoot!</p>";
		} else {
			return "<h1>Hello " + first_name + " " + last_name + "!</h1><p>Welcome to SpringBoot!</p>";
		}
	}

}
