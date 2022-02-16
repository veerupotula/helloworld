package com.capita.sample;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
System.out.println("Inside main");

 List<Pojo> pojoList = new ArrayList<>();
 
    for(int i=0; i<10;i++)
    {
    	 Pojo pojo = new Pojo();

    	pojo.setRelationName("parent");
    	pojo.setValue(i);
/*  	if(!pojoList.contains(pojo))
*/    	pojoList.add(pojo);
    }
    
    for (Pojo pojo1 : pojoList) {
        System.out.println("key--"+ pojo1.getRelationName()+"value---"+ pojo1.getValue());

	}
	}

}
