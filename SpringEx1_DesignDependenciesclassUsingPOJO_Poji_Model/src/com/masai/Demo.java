package com.masai;

public class Demo 
{
	public static void main(String[]args)
	{
		Travel t = new Travel(new Car());//calling constructor injection 
		t.jurney();
		
		System.out.println("\n++++++++++++++++++++++++++++++++++++\n");
		
		
		Travel  tr = new Travel(null);
		tr.setV(new Bike()); //calling setter injection
		tr.jurney();
	}
}
