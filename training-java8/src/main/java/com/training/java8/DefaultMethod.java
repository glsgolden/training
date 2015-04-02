package com.training.java8;

class DefaultMethod 
{
	interface vehicle
	{
		default void print()
		{
			System.out.println("I am vehicle");
		}
	}
	
	interface fourWheeler
	{
		default void print()
		{
			System.out.println("I am fourWheeler");
		}
	}
	
	
	public class Car implements vehicle, fourWheeler
	{
		public void print()
		{
			System.out.println("I am Car");
		}
	}
}


