package com.capita.sample;


abstract class Person
{
 abstract  void attitude();	
}

public class AnnonymousInnerClassExample {

	public static void main(String[] args) {

		Person p = new Person() {
			@Override
			void attitude() {
System.out.println("Good attitude");				
			}
		};
		p.attitude();
	}
}
