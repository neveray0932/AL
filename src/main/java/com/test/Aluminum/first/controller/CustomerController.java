package com.test.Aluminum.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Aluminum.first.domain.CustomerBean;
import com.test.Aluminum.first.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerservice;
	
	@RequestMapping(path = { "/customer.controller" })
	public String method(String custcontroller, Model model, CustomerBean bean) {
		
		if(custcontroller!=null && custcontroller.equals("送出")) {
			System.out.println("OK2");
			CustomerBean result = customerservice.insert(bean);
//			model.addAttribute("aaa", "success");
		}
		
		return "redirect:/index";
	}
}
