package com.epam.DesignPatterns.BehavioralPattern2;

public class Member_mediatorPattern 
{
	
	    private String name;

	    public Member_mediatorPattern(String name) 
	    {
	        this.name = name;
	    }

	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }   

	    public void sendMessage(String message) 
	    {
	        Watsapp_MediatorPattern.showMessage(this, message);
	    }
	}


