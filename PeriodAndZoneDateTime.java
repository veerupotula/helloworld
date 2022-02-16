package com.capita.java8Interview;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PeriodAndZoneDateTime {

	public static void main(String[] args) {


		LocalDate dob = LocalDate.of(1987, 9, 18);
		LocalDate today = LocalDate.now();
		Period p = Period.between(dob, today);
		System.out.printf("Age is %d years,  %d months and %d days",p.getYears(),p.getMonths(),p.getDays());
		
		//Year object
		
		int n =1987;
		Year y = Year.of(n);
		if(y.isLeap()) {
			System.out.printf("\n%d year is leaf year",n);
		}else {
			System.out.printf("\n%d year is not leaf year\n",n);
		}
		//Zone class example
		  ZoneId zone = ZoneId.systemDefault();
		  System.out.println("default zone is\n"+ zone);
		  // Customize zone
		  ZoneId custzone = ZoneId.of("America/Los_Angeles");
		  ZonedDateTime customZone = ZonedDateTime.now(custzone);
		  System.out.println("custom zone is \n"+customZone);
		  
		  

	}
	

}
