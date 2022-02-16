package com.capita.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SampleStreams {

	public static void main(String[] args) {
		System.out.println("Inside main()");
		ArrayList<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(0);
		listInteger.add(5);
		listInteger.add(10);
		listInteger.add(15);
		listInteger.add(20);
		listInteger.add(25);
		System.out.println(listInteger);
		List<Integer> l2 = listInteger.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		// If you want to process then we should go for filter concept
		// filter(Predicate) here Predicate is returns boolean 
		System.out.println(l2);

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(50);
		marks.add(25);
		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		// To update every object then we should go for map concepts
		// map(Function) here Function it can returns int or float or any type of datatype.
		System.out.println(updatedMarks);
   
		//use of count() to count failedstudents
		long noOfFailedStudents = marks.stream().filter(i->i<35).count();
			System.out.println("failed students count"+ noOfFailedStudents);
			
			//sorted() to sort list of elements
			List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
			System.out.println("sorted list"+ sortedList);
			//sorted(Comparator)-->customized sorting
	}
}
