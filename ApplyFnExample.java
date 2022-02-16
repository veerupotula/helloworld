package com.capita.java8Interview;

import java.util.function.Function;

public class ApplyFnExample {

	public static void main(String[] args) {

		Function<String, Integer> fin = s->s.length();
		
		System.out.println(fin.apply("vinayaka"));
		System.out.println(fin.apply("god"));
		
	}

}
