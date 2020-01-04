package com.test.my_packages.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.my_packages.models.User;
import com.test.my_packages.services.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {
	public static final String STATUS_KEY = "status";
	public static final String MESSAGE_KEY = "message";

	@Autowired
	private UserService userService;

	@PostMapping
	@ResponseBody
	public Map<String, ?> loginRequest(@RequestParam String email, @RequestParam @Value("${test.message}") String password) {
		Map<String, String> response = new HashMap<String, String>();

		User user = userService.findUserByEmail(email);

		if (user != null && password.equalsIgnoreCase(user.getPassword())) {
			response.put(STATUS_KEY, "success");
			response.put(MESSAGE_KEY, "Valid user");
		} else {
			response.put(STATUS_KEY, "error");
			response.put(MESSAGE_KEY, "Invalid email or password");
		}

		return response;
	}
}
