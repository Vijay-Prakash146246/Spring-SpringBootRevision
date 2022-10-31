package com.masai;

public class Travel 
{
	//It is a dependency 
	Vehicle v;//here we can store an object of it's implemented class
	String name;
	//setter injection 
	

	public void jurney()
	{
		v.Go();
		System.out.println("Journey Get started");
		System.out.println("Name: "+name);
	}
	public Travel(Vehicle v, String name) 
	{
		super();
		this.v = v;
		this.name = name;
	}

	
//	public void setV(Vehicle v) 
//	{
//		this.v = v;
//	}

//	public void setName(String name) 
//	{
//		this.name = name;
//	}
	
	

	
}
