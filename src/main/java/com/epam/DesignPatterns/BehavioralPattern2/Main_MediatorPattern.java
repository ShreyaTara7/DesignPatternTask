package com.epam.DesignPatterns.BehavioralPattern2;

public class Main_MediatorPattern 
{
	
	    public static void main(String[] args) {
	        Member_mediatorPattern tara = new Member_mediatorPattern("tara");
	        Member_mediatorPattern tanuja = new Member_mediatorPattern("tanuja");
	        
	        tara.sendMessage("Hi tanuja! what are you upto?");
	        tanuja.sendMessage("hi tara!!nothing much!!");
	    }
	}



