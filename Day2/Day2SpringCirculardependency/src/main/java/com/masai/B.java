package com.masai;

public class B {
	private A a1; //object type dependency 
	

	public void showB() 
	{
	System.out.println("inside showB of B");
	System.out.println(a1);
	}
	//constructor injection 
	public B(A a1) 
	{
		super();
		this.a1 = a1;
	}

}
