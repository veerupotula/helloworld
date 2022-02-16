package com.capita.sample;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatEx {
	private static String DEFAULT_DATE_PATTERN = "EEE MMM d HH:mm:ss Z yyyy";

	public static void main(String[] args) throws ParseException{
/*System.out.println("iam in main");
String inputDate = "05-01-2018 02:24:05";
System.out.println("inputDate=========="+ inputDate);
String requiredOutput = "01/05/2018 00:00:00";
System.out.println("Required Output is" + requiredOutput);
convertTimestampToDateString(inputDate);
*/
		//String date="Thu Mar 01 00:00:00 IST 2018";
		String date="Sat Jun 01 12:53:10 IST 2013";
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy",
                Locale.ENGLISH);
		
		Date parsedDate = sdf.parse(date);
		//MMM d, yyyy HH:mm:ss---------dd/mm/yyyy hh:mm:ss
		SimpleDateFormat print = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(print.format(parsedDate));
		/*print.parse(date);
		print.format(parsedDate);*/
	}
	 public static String convertTimestampToDateString(String dateString) throws ParseException {
	   

	        DateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
	        Date date = (Date) dateFormat.parse(dateString);
	    //    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	        String formatedDate= simpleDateFormat.format(date);

	        return formatedDate;
	    }
}
