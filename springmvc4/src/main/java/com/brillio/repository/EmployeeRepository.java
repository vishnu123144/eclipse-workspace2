package com.brillio.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.brillio.model.Employee;

public class EmployeeRepository {
	
	public static List<Employee> listEmployee
	
	=new ArrayList<Employee>();
	
	
	public boolean saveEmployee(Employee employee)
	{
		return listEmployee.add(employee);
	}
	
	public List<Employee> getAllEmployeeDetails()
	{
		return listEmployee;
	}
   public Employee updateEmployee(Employee employee)
   {
	   return employee;
   }
   public void deleteEmployee(Long mobile)
   {
	   ListIterator<Employee> listIterator=listEmployee.listIterator();
	   while(listIterator.hasNext())
    {
	Employee employee=(Employee) listIterator.next();
	if(employee.getMobile().equals(mobile))
	{
		listIterator.remove();
	}
    }
	   
   }
}
