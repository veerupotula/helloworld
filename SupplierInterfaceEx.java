package com.capita.java8Interview;

import java.util.function.Supplier;

public class SupplierInterfaceEx {

	public static void main(String[] args) {

		Supplier<String> s = () -> {
			// Math.random() gives value between 0 to 1.so below value returns same random value between 0 to 3
			String s1[] = {"sunny","bunny","chinni","pinni"};
							int x = (int)(Math.random()*3 +1);
							return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
