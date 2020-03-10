package com.epam.DesignPatterns.CreationalPattern.Prototype;

import java.util.ArrayList;

public class Classroom_Prototype implements Cloneable
	{
	private ArrayList<String> a;
		public Classroom_Prototype()
		{
			a=new ArrayList<String>();
		}
		public Classroom_Prototype(ArrayList<String> t)
		{
			this.a=t;
		}
		public void add()
		{
			a.add("Jon");

			a.add("Gerry");

			a.add("Tom");

			a.add("Sam");
		}
		public ArrayList<String> get()
		{
			return a;
		}
		@Override
		public Object clone() throws CloneNotSupportedException
		{
			ArrayList<String> temp = new ArrayList<String>();
			for(String s : this.get())
			{
				temp.add(s);
			}
			return new Classroom_Prototype(temp);
	}

	}



