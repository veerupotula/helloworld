package com.capita.java8Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingJava8Google {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(10,20,5,2,3,24,0);
				List<Integer> sortedList=intList.stream().sorted().collect(Collectors.toList());
				System.out.println(sortedList);
	}

}
