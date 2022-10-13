package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		//activate the spring container by locating the spring configuration file..
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		//pulling the A obj
		A a = ctx.getBean("a",A.class);
		a.showA();
	}

}
