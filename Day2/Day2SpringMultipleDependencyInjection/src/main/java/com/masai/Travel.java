package com.masai;

public class Travel 
{
	
	Vehicle v;  //object type dependency
	String name; //simple type depensency 
	
	public void jurney()
	{
		v.Go();
		System.out.println("Journey Get started");
		System.out.println("Name: "+name);
	}

//	//setter injection
//	public void setV(Vehicle v) 
//	{
//		this.v = v;
//	}
//
//	public void setName(String name) 
//	{
//		this.name = name;
//	}
	

	
	
	
	
	//constructor injection
		public Travel(Vehicle v, String name) 
		{
			super();
			this.v = v;
			this.name = name;
		}
	
}
