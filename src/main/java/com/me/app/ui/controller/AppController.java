package com.me.app.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	@RequestMapping(value = "/loginx", method = RequestMethod.GET)
	public String defaultPage() {
		return "login/login";
	}
}
