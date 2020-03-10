package com.epam.DesignPatterns.CreationalPattern.FactoryMethod;
public class Main_FactoryPattern 
{
	
	    public static void main(String[] args) 
	    {
	    	Chocolate_Factory c = new Chocolate_Factory();
	        Chocolate_FactoryPattern cf = c.getChocolate("kitkat");
	        cf.manufacture();
	        
	        Chocolate_Factory c1 = new Chocolate_Factory();
	        Chocolate_FactoryPattern cf1 = c1.getChocolate("snickers");
	        cf1.manufacture();
	        
	        Chocolate_Factory c2 = new Chocolate_Factory();
	        Chocolate_FactoryPattern cf2 = c2.getChocolate("milkybar");
	        cf2.manufacture();
	        
	        System.out.println("Manufacturing stopped...");
	    }
	}


