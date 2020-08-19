package com.spring.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePage {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home()
	{
		return "index";
	}
}
