package com.brillio.springcoreex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.brillio.springcoreex2.model.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	 Car car=context.getBean("car",Car.class);
    	 System.out.println(car.getId());
    	 System.out.println(car.getModel());
    	 System.out.println(car.getCompany());
    	 System.out.println(car.getEngine().getEngineName());
    	 
    	 Car c1=context.getBean("benz",Car.class);
    
    	 
    	 
    	 
    }
}
