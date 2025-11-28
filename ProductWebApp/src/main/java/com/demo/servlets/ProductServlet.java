package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class ProductServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		ProductService pservice = new ProductServiceImpl();
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		List<Integer> cart = (List<Integer>) session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<>();
		}
		int cid = Integer.parseInt(req.getParameter("categories"));
		List<Product> plist = pservice.getProducts(cid);
		if(plist!=null) {
			out.println("<form action = 'billing' method = 'get'>");
			out.println("<table border='1'><tr><th>Pid</th><th>Product Name</th><th>Qty</th><th>Price</th><th>Add To Cart</th></tr>");
			for(Product p : plist) {
				out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td>"
						+ "<td><input type ='checkbox' name='selectedProducts' id="+p.getPid()+" value="+p.getPid()+"></td></tr>");
			}
			out.println("</table>");
			String[] selectedProducts = req.getParameterValues("selectedProducts");
			if(selectedProducts != null) {
				for(String p : selectedProducts) {
					cart.add(Integer.parseInt(p));
				}
			}
			session.setAttribute("cart", cart);
			out.println("<button type='submit' name='btn' id = 'btn'>Check Out</button>");
			out.println("</form>");
			
		}else {
			out.println("<h1>Data is not present</h1>");
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
