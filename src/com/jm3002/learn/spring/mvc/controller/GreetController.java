package com.jm3002.learn.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {

	
	/*@RequestMapping("/greet")
	public String showGreetingForm(){
		return "greet-form";
	}*/
	
	@RequestMapping("/greet")
	public String showGreetinadakmdalgForm(){
		return "greet-form";
	}
	
	@RequestMapping("/processGreetData")
	public String processGreetData(HttpServletRequest request, Model model){
		String name = request.getParameter("nm");
		String greet = "Hello, "+name;
		model.addAttribute("greetingMsg", greet);
		return "show-greet-result";
	}
	
	
	@RequestMapping("/processGreetDataV2")
	public String processGreetData(@RequestParam("nm") String userName, Model model){
		String greet = "Hello, "+userName;
		model.addAttribute("greetingMsg", greet);
		return "show-greet-result";
	}
}
