package com.capita.java8Interview;

import java.util.function.Predicate;

public class PredicateJoiningEx {

	public static void main(String[] args) {
		int[] intArray = {0,5,10,15,20,25,4};
			Predicate<Integer> p1 = I -> I>10;
			Predicate<Integer> p2 = I -> I%2==0;
			System.out.println("The number greater than 10");
			m1(p1,intArray);
			System.out.println("The number less than 10");
			m1(p1.negate(),intArray);
			System.out.println("The number greater than 10 and even");
			m1(p1.and(p2),intArray);
			System.out.println("The number greater than 10 or even");
			m1(p1.or(p2),intArray);			
			
	}
	
	public static void m1(Predicate<Integer> p, int[] x)
	{
		for (int i : x) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}

}
