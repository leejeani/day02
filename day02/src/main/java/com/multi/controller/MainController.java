package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.vo.Cust;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "start";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(String fid, String fpwd) {
		System.out.println("Login Impl");
		System.out.println(fid+" "+fpwd);
		String next = null;
		if(fid.equals("qqq") && fpwd.equals("111")) {
			next = "start";
		}else {
			next = "loginfail";
		}
		return next;
	}

	@RequestMapping("/registerimpl")
	public String registerimpl(Cust cust) {
		System.out.println(cust);
		return "start";
	}
	
	@RequestMapping("/css")
	public String css01(String page) {
		return page;
	}
	
}


















