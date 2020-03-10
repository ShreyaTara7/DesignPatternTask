package com.epam.DesignPatterns.BehavioralPattern;

public class Car_TemplatePattern extends Vehicle_TemplatePattern
{

	@Override
	void start() 
	{
		System.out.println("starting the car");
		// TODO Auto-generated method stub
		
	}

	@Override
	void drive() {
		System.out.println("driving the car");
		// TODO Auto-generated method stub
		
	}

	@Override
	void apply_break() {
		System.out.println("break applied");
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		System.out.println("stopped the car");
		// TODO Auto-generated method stub
		
	}
	

}
