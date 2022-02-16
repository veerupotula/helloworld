package com.capita.sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleDateFormat {
    private static String DEFAULT_DATE_PATTERN = "dd/mm/yyyy hh:mm:ss";
    private static String dateString = "2018-05-01";



	public static void main(String[] args) throws ParseException {
		System.out.println("Inside main");
/*		 DateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
	        Date date = (Date) dateFormat.parse(dateString);
	    //    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
	        String formatedDate= simpleDateFormat.format(date);
	        System.out.println("-----------"+ formatedDate);
	        String input = "2018-01-01 00:00:00";
	        Date curDate = new Date();
	                SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	                String DateToStr = format.format(curDate);
	                System.out.println(DateToStr);
	                format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
	                DateToStr = format.format(curDate);
	                System.out.println(DateToStr);
	        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
*/
	        DateFormat dateFormat11 = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
	        Date date1 = (Date) dateFormat11.parse(dateString);
	        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	        String formatedDate1 = simpleDateFormat1.format(date1);
	     System.out.println("last-----------"+ formatedDate1);

	        	}
}
