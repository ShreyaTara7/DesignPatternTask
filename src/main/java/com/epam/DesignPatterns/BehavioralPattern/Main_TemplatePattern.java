package com.epam.DesignPatterns.BehavioralPattern;

public class Main_TemplatePattern 
{
	public static void main(String[] args)
	{
		Vehicle_TemplatePattern vtp=new Car_TemplatePattern();
		vtp.driving();
		System.out.print("\n\n");
		Vehicle_TemplatePattern vtb=new Bus_TemplatePattern();
		vtb.driving();
	}

}
