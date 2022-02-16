package com.capita.file;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SamplePatternEx {
    private static final Pattern PATTERN = Pattern.compile("(\\D*)(\\d*)");
   // private static final Pattern PATTERN = Pattern.compile("ab");

	public static void main(String[] args) {
		String	s1= "0X8F0F";
  	 // String	s2= "0X8170";
	  	  String	s2= "abbababba";
                     // "012345678"  
     // final Matcher m1 = PATTERN.matcher(s1);
      final Matcher m2 = PATTERN.matcher(s1);
      while(m2.find()) {
    	  System.out.println(m2.start()+"---------"+m2.end()+"------group()----"+m2.group()+"------group(2)"+m2.group(2));
      }
	}
}
