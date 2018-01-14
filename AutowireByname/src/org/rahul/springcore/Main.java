package org.rahul.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		 
			ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
			Car carObj = (Car) context.getBean("carBean");
			
			carObj.printCarDetails();
			
	}
 

}