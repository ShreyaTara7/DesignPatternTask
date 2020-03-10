package com.epam.DesignPatterns.StructuralPattern.Adapter;

public class Area

{
		public Station getStation()
		{

			return new Station(120);
		}
}