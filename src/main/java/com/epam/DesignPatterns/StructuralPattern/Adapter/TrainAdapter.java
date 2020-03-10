package com.epam.DesignPatterns.StructuralPattern.Adapter;



public class TrainAdapter implements Train
{
	
		//Using Composition for adapter pattern

		private Area sc = new Area();

		public Station getV1() 

		{

			return sc.getStation();

		}



		public Station getV21()

		{

			Station s=sc.getStation();

			return convertStation(s,10);

		}



		private Station convertStation(Station s, int i) 

		{

			return new Station(s.getStation()/i);

		}



		public Station getV2()

		{

			Station s=sc.getStation();

			return convertStation(s,10);

			

		

		}

	}



