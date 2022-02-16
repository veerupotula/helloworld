package com.capita.generics;

import java.util.ArrayList;

public class BasicExampleOfGenerics {

	public static void main(String[] args) {
		System.out.println("Inside main()");
		
/*		ArrayList arrayList = new ArrayList();
		
		arrayList.add("vinayaka");
		arrayList.add("veeru");
		arrayList.add(new Integer(10));
		System.out.println("list of arrayList"+ arrayList);
		 String valueindexZero = (String)arrayList.get(0);
		 System.out.println("valueindexZero-------"+ valueindexZero);
		 String valueOfIndexTwo = (String)arrayList.get(2);
*/	
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("vinayaka");
		arrayList.add("veeru");
		//arrayList.add(new Integer(10));
		System.out.println("list of arrayList"+ arrayList);
		 String valueindexZero = arrayList.get(0);
		 System.out.println("valueindexZero-------"+ valueindexZero);
		// String valueOfIndexTwo = (String)arrayList.get(2);
	
	
	}

}
