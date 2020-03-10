package com.epam.DesignPatterns.CreationalPattern.FactoryMethod;

public class Chocolate_Factory 
{
	
	    
	    public Chocolate_FactoryPattern getChocolate(String choc) {
	    	if(choc.equals(null)) return null;
	        
	        if(choc.equalsIgnoreCase("kitkat")) {
	            return new Kitkat();
	        } else if(choc.equalsIgnoreCase("snickers")) {
	            return new Snickers();
	        } else if(choc.equalsIgnoreCase("milkybar")) {
	            return new Milkybar();
	        }
	        return null;        
	    }  
	}


