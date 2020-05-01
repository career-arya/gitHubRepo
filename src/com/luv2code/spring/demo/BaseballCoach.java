package com.luv2code.spring.demo;

public class BaseballCoach implements Coach{
	private FortuneServices myFortuneService;
 public BaseballCoach(FortuneServices myFortuneService) {
	 this.myFortuneService=myFortuneService;
 }

	@Override
	public String getDailyWorkout() {
		return "spend 30 mints for workout";
	}

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return myFortuneService.getFortune();
	}
}
