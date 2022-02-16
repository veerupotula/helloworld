package com.capita.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8Filter {

	public static void main(String[] args) {
			System.out.println("I am from main()");
			List<String> list =new ArrayList<String>();
			list.add("L1");
			list.add("L2");
			list.add("L3");
			list.add("L4");
			list.add("L5");
			list.add("L6");
			System.out.println(list.contains("L6"));
			System.out.println(list.contains("L8"));
	
	}

}
