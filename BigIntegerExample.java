package com.capita.file;

import java.math.BigInteger;

public class BigIntegerExample {

	public static void main(String[] args) {

		numberCompare("vinayak","veeru");
	}
	  static int numberCompare(final String m1, final String m2) {
	        final BigInteger n1 = new BigInteger("");
	        final BigInteger n2 = new BigInteger(m2.toString());
	        System.out.println("Output value is"+ n1.compareTo(n2));
	      //  StringUtils.isNotBlank(n1)? n1.compareTo(n2): 0;
	        return n1.compareTo(n2);
	    }

}
