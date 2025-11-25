package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.User;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		LoginService lservice = new LoginServiceImpl();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		resp.setContentType("text/html");
		User user = lservice.loginvalidate(uname,pass);
		PrintWriter out = resp.getWriter();
		if(user!=null) {
			out.println("<h3>Login Success</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("product.html");
			try {
				rd.forward(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			out.println("<h3>User not found</h3>");
			out.println("<h3>Register new user</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			try {
				rd.include(req, resp);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
