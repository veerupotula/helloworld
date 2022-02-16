package com.capita.generics;

public class GenericFunctions {
	
	static <T> void genericFunction(T element)
	{
		System.out.println(element.getClass().getName()+"==="+element);
	}

	public static void main(String[] args) {

		genericFunction("Vinayaka");
		genericFunction(123);
		genericFunction(258.58d);
		genericFunction(15454545L);
		
	}

}
