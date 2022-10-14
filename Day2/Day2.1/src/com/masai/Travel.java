package com.masai;
//Dependent class
public class Travel 
{
	//it is the dependency of reference type
	//here we can store one of its implemented class obj.
	Vehicle v; 
	
	public void journey() 
	{
		v.go();
		System.out.println("Jounrney started...");
	}
	//constructor injection point

	public Travel(Vehicle v) 
	{
		super();
		this.v = v;
	}

	//setter injection point
	public void setV(Vehicle v) 
	{
		this.v = v;
	}
	public Travel() 
	{
		super();
	}
	
	
}
