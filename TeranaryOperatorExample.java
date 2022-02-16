package com.capita.sample;

public class TeranaryOperatorExample {

	public static void main(String[] args) {
		int numberOfApplesPerPerson = 2;
		int numberOfPeople = 10;
		int numberOfApples = 20;
		
		
	//	val numberOfDonutsToBuy = if(numberOfPeople > 10) (numberOfPeople * donutsPerPerson) else defaultDonutsToBuy

		
			//int NoOfApples = if(numberOfPeople > 20)System.out.println("Total number of Apples"+ (numberOfApplesPerPerson * numberOfPeople));else System.out.println("Totoal number of Apples\t"+ numberOfApples);
	
		int NoOfApples = (numberOfPeople > 20)?(numberOfApplesPerPerson * numberOfPeople):numberOfApples;
		System.out.println("No of peoples"+ NoOfApples);

	}

}
