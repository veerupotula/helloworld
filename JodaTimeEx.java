package com.capita.java8Interview;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JodaTimeEx {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		System.out.println("localdate"+localDate);
		System.out.println("localtime"+localTime);
		int mm = localDate.getMonthValue();
		int dd = localDate.getDayOfMonth();
		 int yy =localDate.getYear();
		 System.out.println("normal print"+dd+"--"+mm+"--"+yy);
		 System.out.printf("%d-%d-%d",dd,mm,yy);
		  int hour = localTime.getHour();
		  int min= localTime.getMinute();
		   int second=localTime.getSecond();
		   int nano =localTime.getNano();
		   System.out.printf("\n%d:%d:%d:%d",hour,min,second,nano);
		   // below code is for localdatetime using at a time
		   LocalDateTime ldt =LocalDateTime.now();
		   System.out.println("\n"+ldt);
		 int d =  ldt.getDayOfMonth();
		  int m = ldt.getMonthValue();
		   int y =ldt.getYear();
		   System.out.printf("\n %d-%d-%d",d,m,y);
		   int h = ldt.getHour();
		   int m1 = ldt.getMinute();
		   int s = ldt.getSecond();
		   int n = ldt.getNano();
		   System.out.printf("\n %d:%d:%d:%d",h,m1,s,n);
		   // below code is for display our date
		   LocalDateTime ldtime = LocalDateTime.of(1995,Month.SEPTEMBER,18,5,30);
		   System.out.println("\n"+ldtime);
		   System.out.println("After six months"+ ldtime.plusMonths(6));
		   System.out.println("Before six months"+ ldtime.minusMonths(6));
	}

}
