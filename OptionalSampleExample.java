package com.capita.java8;

import java.util.Optional;

public class OptionalSampleExample {

	public static void main(String[] args) {

		Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

		String answer1 = "YES";
		String answer2 = null;
		System.out.println("Non-empty Optional "+ gender);
		System.out.println("Non empty Optional:Gender value"+ gender.get());
		System.out.println("Empty optional"+Optional.empty());
		
		System.out.println("ofNullable on Non-empty Optional"+ Optional.ofNullable(answer1));
		System.out.println("ofNullable on empty optional"+ Optional.ofNullable(answer2));
		//System.out.println("ofNullable on Non-empty Optional"+ Optional.of(answer2));
		
		// isPresent()
		  if(gender.isPresent())
		  {
			  System.out.println("value is available");
		  }
		  else {
			  System.out.println("value is not availble");
		  }
		  
		  gender.ifPresent(g-> System.out.println("In gedner option is available"));
		  emptyGender.ifPresent(g-> System.out.println("In gedner option is available"));
	      
		    System.out.println(gender.orElse("<N/A>")); //MALE
	        System.out.println(emptyGender.orElse("<N/A>")); //<N/A>

	}

}
