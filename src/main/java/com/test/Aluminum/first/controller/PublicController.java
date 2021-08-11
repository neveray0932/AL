package com.test.Aluminum.first.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublicController {

	@RequestMapping(path = {"/", "/index"})
	public String index() {
		return "/index";
	}
	
	@RequestMapping(path = "/customer.page")
	public String customer() {
		
		return "/customer";
	}
}
