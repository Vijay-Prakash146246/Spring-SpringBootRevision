package com.masai;

public class Bike implements Vehicle
{
	public void Ride()
	{
		System.out.println("Bike Ride Started");
	}

	@Override
	public void Go() 
	{
		// TODO Auto-generated method stub
		Ride();
		
	}

}
