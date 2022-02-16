package com.capita.java8Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// This is used to convert a stream of stream into a list of values
public class FlatMapEx {

	public static void main(String[] args) {
		// creating ArrayList
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
		List<String> productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

		List<List<String>> allProducts = new ArrayList<List<String>>();
		allProducts.add(productlist1);
		allProducts.add(productlist2);
		allProducts.add(productlist3);
		allProducts.add(productlist4);
		System.out.println("all products-----" + allProducts);

		// creating a list of all products
		List<String> listOfAllProducts = new ArrayList<>();

		for (List<String> pro : allProducts) {

			for (String string : pro) {
				listOfAllProducts.add(string);
			}
		}
		System.out.println("After all for loops" + listOfAllProducts);
		
		// Now using flapMap()
	List<String>flatMapList =	allProducts.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
		System.out.println("Using flatMapList"+ flatMapList);
	}

}
