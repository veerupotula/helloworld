package com.capita.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8MapExample {

	public static void main(String[] args) {
           List<String> cityList =  Arrays.asList("Kakinada","Rajahmundry","Amalapuram","Hyderabad","Vijayawada");
  /*         List list = Arrays.asList("Kakinada","Rajahmundry","Amalapuram","Hyderabad","Vijayawada");*/
           System.out.println("List of uppercase"+ convertToUpperCase(cityList));   
           System.out.println("List of uppercase using java8"+convertToUpperCaseUsingStreams(cityList) );
           
	}
	
	static List<String> convertToUpperCase(List<String> list) {
		List<String> upperCaseList = new ArrayList<String>();
		for (String inputString : list) {
			String upperCaseString = inputString.toUpperCase();
			upperCaseList.add(upperCaseString);
		}
		return upperCaseList;
	}
/*	Without using generics
 * static List<String> convertToUpperCase(List list) {
		List upperCaseList = new ArrayList();
		for (Object object : list) {
			String inputString = (String) object;
			String upperCaseString = inputString.toUpperCase();
			upperCaseList.add(upperCaseString);
		}
		return upperCaseList;
	}
*/
	static List<String>convertToUpperCaseUsingStreams(List<String> inputStringList){
		
		List<String> upperCaseList = inputStringList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		// List<String>devicee = deviceList.stream().map()
		return upperCaseList;
	}
	
}
