package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{

	public static void main(String[] args) 
	{
		// Using ApplicationContext tom implement Spring IoC
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         
        // Get the bean
        Sim sim = applicationContext.getBean("sim", Sim.class);
         
        // Calling the methods
        sim.calling();
        sim.data();
        
        //for Airtel
        Sim sim1 = applicationContext.getBean("sim1", Sim.class);
        
        // Calling the methods
        sim1.calling();
        sim1.data();
	}

}
