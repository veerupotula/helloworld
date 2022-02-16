package com.capita.java8Interview;

import java.util.function.Consumer;

public class ConsumerInterExample {

	public static void main(String[] args) {


		Consumer<String> c = s -> System.out.println(s);
		
		c.accept("vinayaka god");
		c.accept("this is consumer interface");
	}

}
