package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		//Activating Spring container
				ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
				A obj =  ctx.getBean("a",A.class); //pulling object of class A
				obj.showA() ;

	}

}
