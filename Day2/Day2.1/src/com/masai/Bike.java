package com.masai;
//dependency class 
public class Bike implements Vehicle
{
	public void ride() 
	{
		System.out.println("Bike ride started....");
	}

	@Override
	public void go() 
	{
		ride() ;
	}

}
