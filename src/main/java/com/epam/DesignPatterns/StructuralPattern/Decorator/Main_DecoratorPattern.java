package com.epam.DesignPatterns.StructuralPattern.Decorator;

public class Main_DecoratorPattern 
{
	public static void main(String[] args) 
	{
	    Bus s = new SleeperBus(new BasicBus()); 

		s.details();

		System.out.println("\n----------------------------------------------------"); 

		 Bus s2= new LuxuryBus(new SleeperBus(new BasicBus()));

		s2.details(); 

		}  

	}




