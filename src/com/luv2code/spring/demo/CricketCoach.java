package com.luv2code.spring.demo;

public class CricketCoach implements Coach {
	private FortuneServices myFortuneService;

	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Setting emailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Setting team");
		this.team = team;
	}

	public CricketCoach() {

	}

	public void setMyFortuneService(FortuneServices myFortuneService) {
		this.myFortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mints";
	}

	@Override
	public String getFortuneService() {
		return myFortuneService.getFortune();
	}

}
