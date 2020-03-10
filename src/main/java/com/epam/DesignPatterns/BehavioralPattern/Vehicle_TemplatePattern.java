package com.epam.DesignPatterns.BehavioralPattern;

public abstract class Vehicle_TemplatePattern 
{
	abstract void start();
	abstract void drive();
	abstract void apply_break();
	abstract void stop();
	
	public final void driving()
	{
		start();
		drive();
		apply_break();
		drive();
		stop();
	}
}
