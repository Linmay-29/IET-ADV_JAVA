package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.RegisterService;
import com.demo.service.RegisterServiceImpl;

public class RegisterServlet extends HttpServlet {

	public void doGet (HttpServletRequest req,HttpServletResponse resp) throws IOException {
		RegisterService rservice = new RegisterServiceImpl();
		PrintWriter out = resp.getWriter();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		String email = req.getParameter("email");
		
		boolean status = rservice.registeruser(uname,pass,email);
		if(status){
			out.println("<h3>Register Sucessfull</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			try {
				rd.forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) {
		try {
			doGet(req,resp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
