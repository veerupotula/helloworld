package com.capita.java8;
import java.util.Arrays;
import com.google.common.base.Joiner;


public class GuavaJoinExample {

	public static void main(String[] args) {

		String[] arr = {"one","two","three","four"};
		System.out.println("Original array"+ Arrays.toString(arr));
		//Use joiner to combine list of strings
		String result = Joiner.on("..").join(arr);
		System.out.println("after result"+ result);
		String[] arr = {"one","two","three",null,"four",null};
		Joine.on("---").skipNulls().join(arr);

	}
	

}
