package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.service.RegisterService;
import com.demo.service.RegisterServiceImpl;

public class PersonalServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession(false);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String gender = request.getParameter("gender");
		String [] hobbies = request.getParameterValues("hobbies");
		String city = request.getParameter("city");
		String name = (String) session.getAttribute("name");
		String email = (String) session.getAttribute("email");
		String pass = (String) session.getAttribute("pass");
		
		
		RegisterService rservice = new RegisterServiceImpl();
		boolean status =rservice.setData(name,email,pass,gender,hobbies,city);
		
		if(status) {
			out.println("<h1>Resigtration Sucessfull</h1>");
		}else {
			out.println("<h1>Registration Failed</h1>");
		}
	}
}
