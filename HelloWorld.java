package com.capita.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
     System.out.println("welcome to new eclipse");
     List list =new ArrayList();
     list.add("veeru");
     list.add("potula");
     
     String name = list.get(0) + "\n(" + list.get(1)+")";
     //System.out.println(name);
    // name.split("\n");
  /*   String[] splited = name.split("\\(");
     for (String string : splited) {
    	String string1 = string.substring(0, string.length() - 1);
    	if(string1.contains(")"))
    	{
    		System.out.println(string1);
    	}
	}*/
     
     HashMap hmap = new HashMap();
     hmap.put(1, "one");
     hmap.put(2,"two");
     hmap.put(3,"three");
     System.out.println("result===="+ hmap.containsKey(3));
     if(hmap.containsKey(13))
     {
    	 System.out.println("value inside if-----"+ hmap.get(3));
     }
     
     final String[] equipmentHierarchies= {};
     
     for (String string : equipmentHierarchies) {
		
	}
	}
	
}
