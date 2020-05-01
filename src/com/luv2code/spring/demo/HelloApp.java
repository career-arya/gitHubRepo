package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
public static void main(String[] args) {
	//Load the configuration file
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     // retrieve the bean from spring Container
     Coach theCoach = context.getBean("trackCoach", Coach.class);
//     Coach theFortune = context.getBean(theFortune, args)
     // call methods on the bean
     System.out.println(theCoach.getDailyWorkout());
     // Close the Context
     context.close();
 
}
}
