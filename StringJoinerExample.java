package com.capita.java8;

import java.util.StringJoiner;

public class StringJoinerExample {

	/**
	 * Java added a new final class StringJoiner in java.util package. 
	 * It is used to construct a sequence of characters separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. 
	 * You can also pass prefix and suffix to the char sequence
	 * 
	 */
	public static void main(String[] args) {
		
		StringJoiner joinNames = new StringJoiner(",","[","]");
		joinNames.add("lord");
		joinNames.add("vinayaka");
		joinNames.add("ganesh");
		joinNames.add("venkateswara");
		System.out.println(joinNames);
		
		StringJoiner joinNames2 = new StringJoiner(",","[","]");
		joinNames2.add("siva");
		joinNames2.add("hanuma");
		joinNames2.add("ayyappa");
		joinNames2.add("sai");
		joinNames2.add("durga");
		joinNames2.add("surya");
			System.out.println("after merge"+ joinNames.merge(joinNames2));

			
	}

}
