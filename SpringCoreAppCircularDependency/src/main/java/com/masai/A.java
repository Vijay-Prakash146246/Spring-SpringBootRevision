package com.masai;

public class A 
{
	private B b1;
	//constructor injection 
//	public A(B b1) 
//	{
//	this.b1=b1;
//	}
	
	//To solve circular dependency problem we add at least a setter injection
	public void setB1(B b1) 
	{
		this.b1 = b1;
	}
	
	public void showA() 
	{
		System.out.println("inside showA of A ");
		System.out.println(b1);
	}


	
}
