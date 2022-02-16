package com.capita.java8Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomparator implements Comparator<Integer>
{
@Override
public int compare(Integer o1, Integer o2) {
   if(o1<o2) {
	   return -1;
   }else if(o1>o2) {
	   return +1;
   }else {
	return 0;
   }
}	
}

public class Jav8ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(15);
		arrayList.add(25);
		arrayList.add(30);
		arrayList.add(51);
		arrayList.add(10);
		arrayList.add(5);
		System.out.println(arrayList);
		Collections.sort(arrayList,new Mycomparator());
		//Comparator<Integer> c =(l1,l2)->(l1<l2)?-1:(l1>l2)?1:0;
	//	Collections.sort(arrayList,c);

	//	Collections.sort(arrayList,(l1,l2)->(l1<l2)?-1:(l1>l2)?1:0);
		System.out.println(arrayList);
	}

}
