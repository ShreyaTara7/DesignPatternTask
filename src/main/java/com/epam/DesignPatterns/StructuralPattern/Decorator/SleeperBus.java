package com.epam.DesignPatterns.StructuralPattern.Decorator;

public class SleeperBus extends BusDecorator
{
	public SleeperBus(Bus b)
	{
		super(b);
	}
		public void details()
		{
			super.details(); 
			System.out.print(" Adding features of Sleeper bus......"); 			

		}
}