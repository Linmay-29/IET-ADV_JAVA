package com.demo.MyFirstSpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.MyFirstSpringBootDemo.dto.UserDto;
import com.demo.MyFirstSpringBootDemo.service.LoginService;

@RestController
public class loginController {
	
	@Autowired
	LoginService lService;
	
	@GetMapping("/loginuser")
	public ResponseEntity<UserDto> login(@RequestParam String uname,@RequestParam String upass) {
		UserDto u = lService.authenticateUser(uname,upass);
		return ResponseEntity.ok(u);
	}
}
