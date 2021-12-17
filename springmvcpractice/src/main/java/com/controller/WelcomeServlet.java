package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.CustomerDao;
import com.model.Customer;

@Controller  //Indicates that an annotated class is a "Controller" (e.g. a web controller). 
//@RequestMapping("/brillio") //Request Handler-->localhost:8082/brillio
public class WelcomeServlet {
	
	ApplicationContext context=new ClassPathXmlApplicationContext();
	
	@GetMapping("/")
	public String getIndexPage()
	{
		return "index"; //search for index page in webapp/view/index
	}
	
	
	@RequestMapping(path="addCustomer",method=RequestMethod.POST)
	public ModelAndView saveCustomerDetails(HttpServletRequest req,HttpServletResponse res,ModelAndView model) //add our data or add view name using model and view 
	{
		String name=req.getParameter("username");
		String mobile=req.getParameter("mobile");
		String email=req.getParameter("email");
		
		Customer customer=context.getBean("customer",Customer.class);
		customer.setName(name);
		customer.setMobile(mobile);
		customer.setEmail(email);
		
		CustomerDao customerDao=context.getBean("customerDao",CustomerDao.class);
		
		boolean details=customerDao.addCustomerDetails(customer);
		
		if(details)
		{
			model.addObject("message", "Successfully Added");
			model.setViewName("home");
			
		}else
		{
			model.addObject("message", "Failed");
			model.setViewName("error");
		}
		
		return model;
		
	}
	
	
	@GetMapping("/home")
	public String getHomePage()
	{
		return "home"; //search for index page in webapp/view/index
	}
	
	@GetMapping("/contact")
	public String getContactPage()
	{
		return "contact"; //search for index page in webapp/view/index
	}


}
