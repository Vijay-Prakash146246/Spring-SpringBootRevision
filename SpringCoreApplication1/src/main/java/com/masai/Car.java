package com.masai;

public class Car implements Vehicle
{
	public void Start()
	{
		System.out.println("Car Ride get Started");
	}

	@Override
	public void Go() 
	{
		// TODO Auto-generated method stub
		Start();
		
	}
	
}
