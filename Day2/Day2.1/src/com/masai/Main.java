package com.masai;

public class Main 
{
	public static void main(String[] args) 
	{
		
//injecting the dependency obj to the dependent, by calling constrcutor injection.
		Travel tr=new Travel(new Bike()); 
		tr.journey();
		
		
		Travel tr1=new Travel();
		// injecting the dependency obj to the dependent, by calling setter method.
		tr.setV(new Car()); 
		tr.journey();
	}

}
