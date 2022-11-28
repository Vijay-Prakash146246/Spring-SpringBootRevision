package com.JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
//Here we are created only one instance per class

//Our Task
//calling one test method to another test method
//singleton class



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When running MathUtilsTest")
class MathUtilsTest 
{
	//This is called member variable 
	MathUtils t1;
	//It will generate error because without created instance we are trying to run 
	// so this method must be static
//	@BeforeAll
//	void beforeAllInit()
//	{
//		System.out.println("Tis need to run before all");
//	}
	
	// TO over come the above error make you method as static 
	@BeforeAll
	static void beforeAllInit()
	{
		System.out.println("This need to run before all");
	}
	//use Annotation to run before each testcases 
	//for initialization of each and Every test cases;
	//when we are using it then our code look like more cleaner and 
	//It remove the duplication from code
	
	@BeforeEach
	void init()
	{
		t1 =  new MathUtils();
	}
	@AfterEach
	void cleanUp()
	{
		System.out.println("Clean Up....");
	}

	//@Test
//	void test() 
//	{
//		System.out.println("This Test Run");
//	}
	@Test
	@DisplayName("Testing add method of our class")
	void testAdd() 
	{
//		//MathUtils t1 =  new MathUtils();
//		int expected = 1;
//		int actual = t1.add(0,1);
//		// for display JUnit kind of response use assert
//		//assertEquals(expected, actual);
//		//we can also pass String as a 3rd argument in assertEquals()
//		assertEquals(expected, actual,"The add method to add two number");
//		assertEquals(0,t1.add(0,0),"The add method to add two number");
		
		
		//Test add method using assertAll() method
		assertAll(
				()->assertEquals(1, t1.add(0,1)),
				()->assertEquals(0, t1.add(0,0)),
				()->assertEquals(8, t1.add(11,-3)),
				()->assertEquals(7, t1.add(4,3)),
				()->assertEquals(-7, t1.add(-4,-3))
				);
	}
	
//	@Test
//	@DisplayName("Testing add method of our class")
//	void testPositiveAdd() 
//	{
//		assertEquals(18, t1.add(7, 11));
//		
//	}
//	@Test
//	@DisplayName("Testing add method of our class")
//	void testNegativeAdd() 
//	{
//		assertEquals(-16, t1.add(-5, -11));
//		
//	}
	
	//by nested class 
	@Nested
	@DisplayName("addTest")
	//this is basically using for tagging 
	@Tag("Math")
	class addTest
	{
		@Test
		@DisplayName("Testing add method for 2 + Number")
		void testPositiveAdd() 
		{
			assertEquals(18, t1.add(7, 11));
			
		}
		@Test
		@DisplayName("Testing add method for 2 - Number")
		void testNegativeAdd() 
		{
			assertEquals(-16, t1.add(-5, -11));
			
		}
	}
	
	@Test
	@Tag("Math")
	void testAdd1() 
	{
		//Because we already initialize the instances
		//MathUtils t1 =  new MathUtils();
		assertEquals(0,t1.add(0,0),"The add method to add two number");
	}
	
	@Test
	@Tag("Math")
	@DisplayName("Multiple method")
	void testMultiply()
	{
		//assertEquals(0,t1.multiply(0,6),"The multiply method to multiply two number");
		assertAll(
				//here we basically pass a lot's of assert lambda expression
				() -> assertEquals(0,t1.multiply(0,6)),
				() -> assertEquals(0,t1.multiply(0,0)),
				() -> assertEquals(36,t1.multiply(6,6)),
				() -> assertEquals(-16,t1.multiply(-2,8))
				);
	}
	
	@Test
	@Tag("Math")
	void testDivide()
	{
		//MathUtils t1 =  new MathUtils();
		assertThrows(ArithmeticException.class, () -> t1.divide(1,0),"Divide By Zero should Throw Exception");
		
		//when it will throw Exception
		
	}
	@Test
	//@EnabledOnOs(value = {OS.LINUX})
	//@RepeatedTest(4)
	void testComputeCircleRadius()
	{
		//(new MathUtilsTest()).testDivide();
		boolean isServerUp = false;
		assumeTrue(isServerUp);
		//MathUtils t1 =  new MathUtils();
		assertEquals(314.1592653589793, t1.circleArea(10),"Should return right Circle Area");
	}
//	@Test
//	@DisplayName("Test Driven method should not be run")
//	void testDisabled()
//	{
//		fail("This Test should be disabled");
//	}
	
	//To solve above error use annotation like @Disabled
	@Test
	@Disabled
	//@Tag("Math")
	
	//using @Tag() annotation we can run particular tag name Test cases
	// for maven add dependency by seeing docs inside pom.xml file
	@DisplayName("Test Driven method should not be run")
	void testDisabled()
	{
		fail("This Test should be disabled");
	}
}
