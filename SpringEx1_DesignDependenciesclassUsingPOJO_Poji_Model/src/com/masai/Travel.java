package com.masai;

public class Travel 
{
	//It is a dependency 
	Vehicle v;//here we can store an object of it's implemented class

     //setter injection
	public void setV(Vehicle v) 
	{
		this.v = v;
	}
     
	//Constructor injection
	public Travel(Vehicle v) 
	{
		this.v = v;
	}
	
	public void jurney()
	{
		v.Go();
		System.out.println("Journey Get started");
	}

	public Travel() 
	{
		
	}
	
}
