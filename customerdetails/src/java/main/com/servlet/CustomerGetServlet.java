package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Customer;
import com.service.CustomerService;
import com.service.CustomerServiceImpl;

@WebServlet(urlPatterns = "/getAllCustomer")
public class CustomerGetServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomerService service=new CustomerServiceImpl();
		 PrintWriter writer=resp.getWriter();
		   writer.println("List of  Customer details");
		   List<Customer> allCustomerDetails=service.getAllCustomerDetails();
		   writer.println(allCustomerDetails);
		   req.setAttribute("list", allCustomerDetails);
		   req.getRequestDispatcher("list-customer-details.jsp").forward(req, resp);
	}
	

}
