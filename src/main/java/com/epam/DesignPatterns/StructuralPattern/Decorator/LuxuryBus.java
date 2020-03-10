package com.epam.DesignPatterns.StructuralPattern.Decorator;


	public class LuxuryBus extends BusDecorator 
	{
		public LuxuryBus(Bus c) 
		{
			super(c);
		}

		public void details()
		{
			super.details(); 
			System.out.print(" Adding features of luxury bus.");
		}
	}


