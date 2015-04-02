package com.training.java8;

import org.junit.Test;

public class MethodReferenceTest 
{
	
	@Test
	public void method1Test()
	{
		MethodReference reference = new MethodReference();
		reference.method1();
	}
	
	@Test
	public void method2Test()
	{
		MethodReference reference = new MethodReference();
		reference.method2();
	}

}
