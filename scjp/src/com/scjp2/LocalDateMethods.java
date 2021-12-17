package com.scjp2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.scjp.Creator;

public class LocalDateMethods {
	  public static void main(String[] args) {
	        LocalDate date=LocalDate.parse("2004-09-08",DateTimeFormatter.ISO_LOCAL_DATE);
	        System.out.println(date.withMonth(06));//valid months between 1-12
	        System.out.println(date.withDayOfMonth(30));//valid values are 1-28/31
	        System.out.println(date.withDayOfYear(360));//valid values are 1-365/366
	        //it will start from starting 1st date january to end december days will be calculated
	        
	        
	        
	    }

}
