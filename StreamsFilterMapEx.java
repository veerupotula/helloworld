package com.capita.java8Interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilterMapEx {

	public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(15);
			al.add(25);
			al.add(30);
			al.add(51);
			al.add(10);
			al.add(5);
			System.out.println(al);
			//with out streams
			List<Integer> l1 = new ArrayList();
			for (Integer integer : al) {
				if(integer % 2 == 0)
				{
					l1.add(integer);
				}
			}
			System.out.println(l1);
			//with Streams
			 List<Integer> l2= al.stream().filter(i->i%2==0).collect(Collectors.toList());
			 List<Integer> l3=al.stream().map(i -> i*2).collect(Collectors.toList());
					 System.out.println(l2);
					 System.out.println(l3);
				ArrayList<String> herosList = new ArrayList<>();
				herosList.add("Pawan");
				herosList.add("Mahesh");
				herosList.add("Charan");
				herosList.add("Jntr");
				herosList.add("Chiranjeevi");
				List<String> list = herosList.stream().filter(s->s.length()>5).collect(Collectors.toList());
				System.out.println("Length greathan by 5"+ list);
				List<String> listUpperCase = herosList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
					System.out.println("Heros with Upper case"+ listUpperCase);
					
				Long countGreaterThan6 = herosList.stream().filter(s->s.length()>6).count();
				System.out.println("Heros with greater than 5 letters count"+countGreaterThan6);
				//sort using defualt sorting order
				List ascendiList = al.stream().sorted().collect(Collectors.toList());
				System.out.println("Ascending order"+ ascendiList);
				// sort using desending order sorting order
				List desendList = al.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
				System.out.println("descending order"+ desendList);
				// get minimum value from list
				Integer min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
				System.out.println("Minimum value from list"+ min);
				Integer max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
				System.out.println("Minimum value from list"+ max);
				// foreach() example in java.util.stream using lambda
				ArrayList<String> foreachEx = new ArrayList<>();
				foreachEx.add("A");
				foreachEx.add("BB");
				foreachEx.add("CCC");
				foreachEx.stream().forEach(s->System.out.println(s));
				//using method refernce
				foreachEx.stream().forEach(System.out :: print);
				// to copy elements into array from stream.
				Integer[] intArray =al.stream().toArray(Integer[] :: new);
				for (Integer integer : intArray) {
					System.out.println(integer);		
				}
			
				// Use of Stream.of()
				
				Stream<Integer> s =Stream.of(9,99,999,9999);
				s.forEach(System.out :: println);
				// Use of Stream.of() for arrays
				Double d[] = {10.0,20.0,30.0,45.0,55.0};
				Stream<Double> doubleValue = Stream.of(d);
				doubleValue.forEach(System.out:: println);
					 }
	
}
