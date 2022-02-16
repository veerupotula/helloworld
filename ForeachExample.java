package com.capita.java8;

import java.util.ArrayList;
import java.util.List;

/*
 * forEach() used to iterate elements.It is defined in Iterable and Stream interface.
 * It is default method in Iterable interface
 * 
 * This method takes a single parameter which is a functional interface.So,you can pass lambd expression
 * as an arugment.
 *    default void forEach(Consumer<super T>action)
 * */

public class ForeachExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30)
		;
		list.add(40);
		
		System.out.println(list);
		list.stream().forEach(System.out::println);
		
		//another example using for each
		List<String> gameList = new ArrayList<String>();
		gameList.add("CRICKET");
		gameList.add("FOOTBALL");
		gameList.add("Hockey");
		gameList.add("Tenniss");
		System.out.println("gameList"+ gameList);
		gameList.forEach(System.out::println);
	}

}
