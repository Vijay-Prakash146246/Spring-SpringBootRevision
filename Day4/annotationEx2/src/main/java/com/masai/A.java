package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service
public class A 
{
	@Autowired
	//to solve the exception when we registered single class multiple time
	@Qualifier("b5")// to choose one spring bean obj among multiple registered obj.
	private B b1;
	public void funA() 
	{
	System.out.println("inside funA of A");
	System.out.println(b1);
	}
}
