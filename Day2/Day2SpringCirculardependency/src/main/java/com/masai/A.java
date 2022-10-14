package com.masai;

public class A 
{
	private B b1; //dependency object type
	
	//Setter Injection
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
