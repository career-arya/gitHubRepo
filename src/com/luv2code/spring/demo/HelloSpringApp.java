package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
	System.out.println(cricketCoach.getDailyWorkout());
	System.out.println(cricketCoach.getFortuneService());
	System.out.println(cricketCoach.getEmailAddress());
	System.out.println(cricketCoach.getTeam());
	
	context.close();
	
	
}
}
