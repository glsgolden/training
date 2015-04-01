package com.training.java8;

import org.junit.Test;

public class LamdaTester 
{
	
	LambdaExpression lamdaExpression = new LambdaExpression();
	
	@Test
	public void withDeclaration()
	{
		LambdaExpression.MathOperation addition = (int a, int b) -> a + b;
		System.out.println("Addition of two number =" + lamdaExpression.operate(10, 20, addition));
		
	}
	
	@Test
	public void withoutDeclaration()
	{
		LambdaExpression.MathOperation substraction = (a, b) -> a - b;
		System.out.println("Addition of two number =" + lamdaExpression.operate(10, 20, substraction));
		
	}
	
	@Test
	public void withReturnAndCurlyBraces()
	{
		LambdaExpression.MathOperation substraction = (a, b) -> {return (a - b) };
		System.out.println("Addition of two number =" + lamdaExpression.operate(10, 20, substraction));
		
	}

}
