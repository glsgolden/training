package com.training.java8;

public class LambdaExpression 
{
	
	interface MathOperation
	{
		int operation(int a, int b);
	}
	
	interface GreetingService
	{
		void sayMessage(String s);
	}
	
	public	int operate(int a, int b, MathOperation mathOperation)
	{
		return mathOperation.operation(a, b);
	}

}
