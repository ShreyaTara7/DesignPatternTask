package com.epam.DesignPatterns.StructuralPattern.Adapter;

	public class Main 
	{
		public static void main(String[] args)
		{
			TrainAdapter();
		}

		private static void TrainAdapter() 
		{
				TrainAdapter sockAdapter = new TrainAdapter();

				Station v3 = getStation(sockAdapter,3);

				Station v12 = getStation(sockAdapter,12);

				Station v120 = getStation(sockAdapter,120);

				System.out.println("v3 Station using Object Adapter="+v3.getStation());

				System.out.println("v12 Station using Object Adapter="+v12.getStation());

				System.out.println("v120 Station using Object Adapter="+v120.getStation());

			}

			

			

			private static Station getStation(com.epam.DesignPatterns.StructuralPattern.Adapter.TrainAdapter sockAdapter, int i)
			{
				switch (i)
				{

				case 3: return sockAdapter.getV1();

				case 12: return sockAdapter.getV21();

				case 120: return sockAdapter.getV2();

				default: return sockAdapter.getV1();

				}
		}
		}







