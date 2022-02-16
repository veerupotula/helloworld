package com.capita.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericMapExample {

	/*public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1,"vinayaka");
		map.put(2, "veeru");
		map.put(3,"ramu");
		map.put(4, "laxman");
		
	Set set =	map.entrySet();
		Iterator itr =set.iterator();
		while(itr.hasNext())
		{
		Map.Entry obj =	(Map.Entry)itr.next();
		System.out.println("key is \t"+ obj.getKey() +"get value is \t"+ obj.getValue());
		}
	}*/

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "vinayaka");
		map.put(2, "veeru");
		map.put(3, "ramu");
		map.put(4, "ramu");
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> obj = itr.next();
			System.out.println("key is ----\t-------" + obj.getKey() + "get value is ========\t=====" + obj.getValue());
		}
	}
}
