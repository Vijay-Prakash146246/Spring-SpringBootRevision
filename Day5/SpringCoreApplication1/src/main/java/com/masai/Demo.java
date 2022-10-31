package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//activating the Spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		MyBusinessClass mb = ctx.getBean(MyBusinessClass.class,"mb");
		mb.fun1();
		Travel t = ctx.getBean(Travel.class,"t");
		t.jurney();
	}

}
