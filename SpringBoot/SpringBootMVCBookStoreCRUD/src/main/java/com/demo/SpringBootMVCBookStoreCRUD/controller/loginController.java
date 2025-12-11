package com.demo.SpringBootMVCBookStoreCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringBootMVCBookStoreCRUD.beans.User;
import com.demo.SpringBootMVCBookStoreCRUD.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("")
public class loginController {
	
	@Autowired
	UserService uservice;
	
	@GetMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("loginPage");
	}
	
	@PostMapping("/validatelogin")
	public ModelAndView validateLogin(@RequestParam(value="uname") String uname,@RequestParam(value="pass") String pass,HttpSession session) {
		System.out.println(uname +","+pass );
		User u = uservice.validateLogin(uname,pass);
		session.setAttribute("User", u);
		if(u!=null && u.getRole().equals("admin")) {
			return new ModelAndView("redirect:/books/display");
		}else if(u!=null && u.getRole().equals("user")){
			return new ModelAndView("loginPage","message","Currently only Admin is allowed. Not for user");
		}else {
			return new ModelAndView("loginPage","message","Enter Valid Cradentials");
		}
	}
	
	@GetMapping("/getBooks")
	public ModelAndView getBooks() {
		return new ModelAndView("redirect:/books/display");
	}
}
