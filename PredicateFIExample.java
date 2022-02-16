package com.capita.java8Interview;

import java.util.function.Predicate;

/* Perform a particular conditional check*/
public class PredicateFIExample {

	public static void main(String[] args) {

		Predicate<Integer> p = I -> I>100;
		System.out.println(p.test(50));
		System.out.println(p.test(500));
		
		Predicate<String> stringPred = s -> s.length() >5;
		System.out.println(stringPred.test("vinayaka"));
		System.out.println(stringPred.test("veeru"));

	}

}
