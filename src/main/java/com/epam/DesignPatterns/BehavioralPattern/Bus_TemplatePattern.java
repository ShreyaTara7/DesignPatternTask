package com.epam.DesignPatterns.BehavioralPattern;

public class Bus_TemplatePattern extends Vehicle_TemplatePattern{


	@Override
	void start() 
	{
		System.out.println("starting the bus");
		// TODO Auto-generated method stub
		
	}

	@Override
	void drive() {
		System.out.println("driving the bus");
		// TODO Auto-generated method stub
		
	}

	@Override
	void apply_break() {
		System.out.println("break applied");
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		System.out.println("stopped the bus");
		// TODO Auto-generated method stub
	}

}
