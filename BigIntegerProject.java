package com.capita.file;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BigIntegerProject {
    private static final Pattern PATTERN = Pattern.compile("(\\D*)(\\d*)");

	// 0X8F0F,0X8170
      public static void main(String[] args) {
    	  String	s1= "0X8F0F";
    	  String	s2= "0X8170";
		// int static compareStrings(s1,s2);
    	  BigIntegerProject bigInterPrj = new BigIntegerProject();
    	 int i = bigInterPrj.compareStrings(s1, s2);
    	 System.out.println("final result is"+i);
	}

    protected int compareStrings( String s1,  String s2) {
        final Matcher m1 = PATTERN.matcher(s1);
        final Matcher m2 = PATTERN.matcher(s2);
        final int patternMatcher = comparePatternMatcher(m1, m2);
        if (0 != patternMatcher) {
            return patternMatcher;
        } else {
            // Handle if one string is a prefix of the other. Nothing comes before something.
            return m1.hitEnd() && m2.hitEnd() ? 0 : m1.hitEnd() ? -1 : +1;
        }
    }

    private int comparePatternMatcher(final Matcher m1, final Matcher m2) {
        while (m1.find() && m2.find()) {
            final int nonDigitalCompare = nonDigitCompare(m1, m2);
            if (0 != nonDigitalCompare) {
                return nonDigitalCompare;
            }

            final int digitsInSecondParenthesesCompare = digitsInSecondParenthesesCompare(m1, m2);
            if (0 != digitsInSecondParenthesesCompare) {
                return digitsInSecondParenthesesCompare;
            }

            int numberCompare = numberCompare(m1, m2);
            if (0 != numberCompare) {
                return numberCompare;
            }
        }
        return 0;
    }

    private int nonDigitCompare(final Matcher m1, final Matcher m2) {
        // matcher.group(1) fetches any non-digits captured by the first parentheses in PATTERN.
        return m1.group(1).compareToIgnoreCase(m2.group(1));
    }

    private int digitsInSecondParenthesesCompare(final Matcher m1, final Matcher m2) {
        // matcher.group(2) fetches any digits captured by the second parentheses in PATTERN.
        if (m1.group(2).isEmpty()) {
            return m2.group(2).isEmpty() ? 0 : -1;
        } else if (m2.group(2).isEmpty()) {
            return 1;
        }
        return 0;
    }

    private int numberCompare(final Matcher m1, final Matcher m2) {
        final BigInteger n1 = new BigInteger(m1.group(2));
        final BigInteger n2 = new BigInteger(m2.group(2));
        return n1.compareTo(n2);
    }


}
