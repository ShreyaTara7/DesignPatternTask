package com.epam.DesignPatterns.CreationalPattern.Prototype;

import java.util.ArrayList;

public class Main 
{
		public static void main(String[] args) throws CloneNotSupportedException 

		{

			Classroom_Prototype k=new Classroom_Prototype();

			  k.add();		

			  Classroom_Prototype k1=(Classroom_Prototype) k.clone();

			ArrayList<String>k11=k1.get();

			k11.add("George");

			k11.add("Bran");		

			Classroom_Prototype k2=(Classroom_Prototype) k.clone();		

			ArrayList<String>k12=k2.get();

			k12.remove("Sam");		

			System.out.println(k.get());

			System.out.println(k11);

			System.out.println(k12);			

		}

	}

	



