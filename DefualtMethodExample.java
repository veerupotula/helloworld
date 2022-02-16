package com.capita.java8Interview;

interface Intef1{
	
	 default void m1() {
		System.out.println("This is defautlt method from Intef1");
	};
}
interface Intef23{
	
	 default void m1() {
		System.out.println("This is defautlt method from Inter2");
	};
}
public class DefualtMethodExample implements Intef1,Intef23{
	
	public void m1()
	{
		//System.out.println("My own implementaion");
		Intef1.super.m1(); // this is implementation for interface1
	}

	public static void main(String[] args) {
		DefualtMethodExample obj = new DefualtMethodExample();
		obj.m1();

	}

}
