package com.JUnitTesting;

public class MathUtils 
{
	 public int add(int a,int b)
	 {
		 return (a+b);
	 }
	 public int subtract(int a,int b)
	 {
		 return (a-b);
	 }
	 public int multiply(int a,int b)
	 {
		 return (a*b);
	 }
	 public int divide(int a,int b)
	 {
		 return (a/b);
	 }
	 
	 public double circleArea(double radius)
	 {
		// return 3.14*radius*radius;
		 return Math.PI*radius*radius;
	 }
}
