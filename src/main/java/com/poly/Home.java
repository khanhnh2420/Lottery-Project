package com.poly;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	@RequestMapping("/home")
	public String loadHomePage() {
		return "index";
	}
}
