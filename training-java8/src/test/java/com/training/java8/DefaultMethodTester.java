package com.training.java8;

import org.junit.Test;

public class DefaultMethodTester 
{
	
	@Test
	public void callCarMethod()
	{
		
		DefaultMethod.Car car = new DefaultMethod().new Car();
		car.print();
		
	}
	
	@Test
	public void test2()
	{
		
		DefaultMethod.Car car = new DefaultMethod().new Car();
		car.print();
		
	}

}
