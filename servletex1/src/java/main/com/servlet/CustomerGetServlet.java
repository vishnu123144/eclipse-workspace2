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
import com.service.CustomerImple;
import com.service.CustomerService;
@WebServlet(urlPatterns="/getAllCustomer")
public class CustomerGetServlet extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;
	 public CustomerGetServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService service=new CustomerImple();
		PrintWriter writer=response.getWriter();
		writer.println("List of customer details");
		List<Customer> allCustomerDetails=service.getAllCustomerDetails();
		writer.println("List of customer details");
		
		  for (Customer cust : service.getAllCustomerDetails()) {
		   writer.println(cust);
		  }
		  request.setAttribute("list",allCustomerDetails);
		  request.getRequestDispatcher("list-customer-details.jsp").forward(request,response);
		
}
}