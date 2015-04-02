package com.training.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public void method1() {
		List<String> names = new ArrayList<String>();

		names.add("Ganesh");
		names.add("Ankush");
		names.add("deepak");

		names.forEach(System.out::println);

	}

	public void method2() {

		List<A> names = new ArrayList<A>();

		A  a = new A();
		a.setA("ganesh");
		a.setB("shirsat");
		names.add(a);
		
		
		a = new A();
		a.setA("ganesh");
		a.setB("shirsat");
		names.add(a);
		
		a = new A();
		a.setA("ganesh");
		a.setB("shirsat");
		names.add(a);
		
		a = new A();
		a.setA("ganesh");
		a.setB("shirsat");
		names.add(a);
		
		a = new A();
		a.setA("ganesh");
		a.setB("shirsat");
		names.add(a);
		
		a = new A();
		a.setA("ganesh");
		a.setB("shirsat");
		names.add(a);
		

		names.forEach(System.out::println);

	}

	class A {
		private String a;
		private String b;

		public String getA() {
			return a;
		}

		public void setA(String a) {
			this.a = a;
		}

		public String getB() {
			return b;
		}

		public void setB(String b) {
			this.b = b;
		}
		
		@Override
		public String toString() {

			return this.a + " " + this.b;
		}

	}

}
