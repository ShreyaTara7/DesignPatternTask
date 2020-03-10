package com.epam.DesignPatterns.StructuralPattern.Decorator;


	public class BusDecorator  implements Bus
	{
		protected Bus bus; 

		public BusDecorator(Bus b)
		{
			this.bus=b;
	    }

		public void details()
		{
			this.bus.details();
		}
	}


