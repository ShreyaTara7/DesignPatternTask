package com.epam.DesignPatterns.BehavioralPattern2;

public class Watsapp_MediatorPattern 
{
	//watsapp is the mediator between the member users
	
	    public static void showMessage(Member_mediatorPattern user, String message) 
	    {
	        System.out.println(user.getName()+" : "+message);
	    }
	}


