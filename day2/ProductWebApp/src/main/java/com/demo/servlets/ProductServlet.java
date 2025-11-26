package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class ProductServlet extends HttpServlet{
	ProductService pservice = new ProductServiceImpl();
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		List<Product> plist = pservice.getProducts();
		
		if(plist!=null) {
			out.println("<form action = 'billing' method = 'post'>");
			out.println("<table border='1'><tr><th>Pid</th><th>Product Name</th><th>Qty</th><th>Price</th><th>Add To Cart</th></tr>");
			for(Product p : plist) {
				out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td>"
						+ "<td><input type ='checkbox' name='selectedProducts' id="+p.getPid()+" value="+p.getPid()+"></td></tr>");
			}
			out.println("</table>");
			out.println("<button type='submit' name='btn' id = 'btn'>Check Out</button>");
			out.println("</form>");
			
		}else {
			out.println("<h1>Data is not present</h1>");
		}
		
		
	}
}
