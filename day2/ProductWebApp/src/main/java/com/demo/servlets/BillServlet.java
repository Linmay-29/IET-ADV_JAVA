package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.BillingService;
import com.demo.service.BillingServiceImpl;

public class BillServlet extends HttpServlet {
		public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {
			BillingService bservice = new BillingServiceImpl();
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			String[] selectedIds = req.getParameterValues("selectedProducts");
			double totalBill = bservice.getBill(selectedIds);
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Billing Page</title>");
			out.println("<style>");
			out.println("body { font-family: Arial, sans-serif; margin: 40px; }");
			out.println(".bill-box { border: 1px solid #ccc; padding: 20px; width: 300px; }");
			out.println("h2 { color: #2c3e50; }");
			out.println("</style>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div class='bill-box'>");
			out.println("<h2>Your Billing Summary</h2>");
			out.println("<p>Total Amount : <strong>" + totalBill + "</strong></p>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");

		}
}
