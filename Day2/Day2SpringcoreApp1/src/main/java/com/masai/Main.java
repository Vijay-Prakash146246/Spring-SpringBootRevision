package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		//Activating Spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyBusinessClass obj =  ctx.getBean("mb",MyBusinessClass.class); 
		obj.fun1();
	}
	
}
