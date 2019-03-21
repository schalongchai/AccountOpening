package com.me.app.rest.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class AccountController {
	@RequestMapping(value = "/account/", method = RequestMethod.GET)
	public String Test(ModelMap model) {
		return "This is account";
	}
}
